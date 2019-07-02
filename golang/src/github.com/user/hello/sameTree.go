package main

import (
	"golang.org/x/tour/tree"
	"fmt"
)

func Walk(t *tree.Tree, ch chan int, root *tree.Tree) {
	fmt.Println("cao")
	if t.Left != nil {
		Walk(t.Left, ch, root)
	}
	ch <- t.Value
	if t.Right != nil {
		Walk(t.Right, ch, root)
	}
	if root == t {
		close(ch)
	}
}

// Same determines whether the trees
// t1 and t2 contain the same values.
func Same(t1, t2 *tree.Tree) bool {
	ch1 := make(chan int)
	ch2 := make(chan int)
	go Walk(t1, ch1, t1)
	go Walk(t2, ch2, t2)
	for {
		v1, ok1 := <-ch1
		v2, ok2 := <-ch2

		fmt.Println("ok1:", ok1, "v1:", v1, "ok2:", ok2, "v2:", v2)
		if ok1 == false && ok2 == false {
			return true
		}
		if ok1 != ok2 {
			return false
		}
		if v1 != v2 {
			return false
		}
	}
	return true
}

func main() {
	t1 := tree.New(1)
	t2 := tree.New(1)
	fmt.Println(Same(t1, t2))
}
