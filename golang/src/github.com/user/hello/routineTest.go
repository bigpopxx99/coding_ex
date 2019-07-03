package main

import (
	"sync"
	"fmt"
	"time"
)

type Money struct {
	flag sync.Mutex
	sum int
}

var wg sync.WaitGroup

func (m *Money) addMoney() {
	defer wg.Done()
	m.flag.Lock()
	defer m.flag.Unlock()
	time.Sleep(1000)
	m.sum++
}

func main() {
	money := Money{sum:0}
	timeStart := time.Now().UTC()
	for i:=0; i<10000; i++ {
		wg.Add(1)
        go money.addMoney()
	}

	wg.Wait()
    diff := time.Now().UTC().Sub(timeStart)
	fmt.Println("result:",money.sum,"time:",diff)
}
