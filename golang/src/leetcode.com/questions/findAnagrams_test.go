package questions

import (
	"testing"
	"fmt"
)

func TestFindAnagrams(t *testing.T){

	cases := [] struct {
		s string
		p string
		want []int
	}{
		{"cbaebabacd","abc", []int{0,6}},
		{"abab","ab", []int{0,1,2}},
		{"baa","aa", []int{1}},
		{"abacbabc","abc", []int{1,2,3,5}},
	}

	for idx, c := range cases{
		get := findAnagrams(c.s, c.p)
		printArray(get)
		printArray(c.want)
		if !isSame(get, c.want){
			t.Errorf("No.%d error",idx+1)
		}
	}
}

func isSame(a []int, b[] int) bool{
	if len(a) != len(b) {
		return false
	}
	for i:=0; i<len(a); i++ {
		if a[i] != b[i] {
			return false
		}
	}
	return true
}

func printArray(array []int){
	for i:=0; i<len(array); i++ {
		fmt.Print(array[i]," ")
	}
	fmt.Println()
}