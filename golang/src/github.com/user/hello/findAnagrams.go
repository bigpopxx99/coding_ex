package main

import (
	"sort"
	"strings"
	"fmt"
)

func findAnagrams(s string, p string) []int {
	var ret []int
	if len(p) > len(s) {
		return ret
	}
	lenP := len(p)
	fmt.Println("lenP:",lenP)
	for i:=0; i<len(s)-len(p)+1; i++ {
		if isAnagrams(s[i:i+lenP], p) {
			ret = append(ret, i)
		}
	}
	return ret
}

func isAnagrams(s string, p string) bool{
	fmt.Println("input s:",s," input p:",p)
	if len(s) != len(p) {
		return false
	}
	var sArray = strings.Split(s, "")
	var pArray = strings.Split(p, "")
	sort.Strings(sArray)
	sort.Strings(pArray)
	ss := strings.Join(sArray, "")
	sp := strings.Join(pArray, "")
	ret := strings.Compare(ss, sp) == 0
	fmt.Println("result:",ret)
	return ret
}

func main() {
	findAnagrams("cbaebabacd", "abc")
}

