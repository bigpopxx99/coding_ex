package main

import (
	"fmt"
	"sync"
)

type Fetcher interface {
	// Fetch returns the body of URL and
	// a slice of URLs found on that page.
	Fetch(url string) (body string, urls []string, err error)
}

// Crawl uses fetcher to recursively crawl
// pages starting with url, to a maximum of depth.

func Crawl(url string, depth int, fetcher safeFetcher, quit chan int) {
	fmt.Println("depth:",depth)
	if depth <= 0 {
		return
	}
	body, urls, err := fetcher.Fetch(url)
	if err != nil {
		fmt.Println(err)
		if depth == 1 {
			quit <- 1
		}
		return
	}
	fmt.Printf("found: %s %q\n", url, body)
	for _, u := range urls {
		go Crawl(u, depth-1, fetcher, quit)
	}
	return
}

func main() {
	quit := make(chan int)
	Crawl("https://golang.org/", 4, safeFetcher{fetcher: fetcher, used: make(map[string]int)}, quit)
	<-quit
}

type safeFetcher struct {
	fetcher fakeFetcher
	used    map[string]int
	mux     sync.Mutex
}

// fakeFetcher is Fetcher that returns canned results.
type fakeFetcher map[string]*fakeResult

type fakeResult struct {
	body string
	urls []string
}

func (f *safeFetcher) DupCheck(url string) bool {
	_, ok := f.used[url]
	if ok {
		return true
	} else {
		f.used[url] = 1
		return false
	}
}

func (f *safeFetcher) Fetch(url string) (string, []string, error) {
	f.mux.Lock()
	defer f.mux.Unlock()
	if f.DupCheck(url) {
		return "", nil, fmt.Errorf("dup url:%s", url)
	}
	if res, ok := f.fetcher[url]; ok {
		return res.body, res.urls, nil
	}
	return "", nil, fmt.Errorf("not found: %s", url)
}

// fetcher is a populated fakeFetcher.
var fetcher = fakeFetcher{
	"https://golang.org/": &fakeResult{
		"The Go Programming Language",
		[]string{
			"https://golang.org/pkg/",
			"https://golang.org/cmd/",
		},
	},
	"https://golang.org/pkg/": &fakeResult{
		"Packages",
		[]string{
			"https://golang.org/",
			"https://golang.org/cmd/",
			"https://golang.org/pkg/fmt/",
			"https://golang.org/pkg/os/",
		},
	},
	"https://golang.org/pkg/fmt/": &fakeResult{
		"Package fmt",
		[]string{
			"https://golang.org/",
			"https://golang.org/pkg/",
		},
	},
	"https://golang.org/pkg/os/": &fakeResult{
		"Package os",
		[]string{
			"https://golang.org/",
			"https://golang.org/pkg/",
		},
	},
}
