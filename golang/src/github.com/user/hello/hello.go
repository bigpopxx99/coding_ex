package main

import (
	"fmt"
	"math"
)

func checkPerfectNumber(num int) bool {
	if num == 1{
		return false
	}
	sum := 1
	div := 2
	for  {
		if div > int(math.Sqrt(float64(num))) {
			break
		}
		if num % div == 0 {
			bigDiv := num / div
			if bigDiv < div {
				break
			}else if bigDiv == div {
				sum += div
				break
			}else{
				sum += div + bigDiv
			}
		}
		div++
	}

	return num == sum
}

func main() {
	for i:=1; i<10000; i++{
		if checkPerfectNumber(i) {
			fmt.Println(i)
		}
	}
}
