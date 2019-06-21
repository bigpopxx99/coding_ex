package main

import "fmt"

func main() {
	//array := []int{1,2,3,4,5,6}
	str := "我是你大爷"

	for index, value := range str {
		fmt.Printf("index:%d value:%q\n",index,value)
	}
}
