package main

import (
	"leetcode.com/questions"
	"fmt"
)

func main() {
	node := questions.ListNode{}
	node.Val = 10
	node2 := questions.ListNode{}
	node2.Val = 10
	var p1,p2 *questions.ListNode
	p1 = &node
	p2 = &node2
	fmt.Println(*p1==*p2)
}
