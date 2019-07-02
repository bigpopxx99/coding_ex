package questions

import (
	"sort"
)

func numMovesStones(a int, b int, c int) []int {
    arr := []int{a,b,c}
    sort.Ints(arr)
    min := arr[0]
    mid := arr[1]
    max := arr[2]
    maxDiff := max - min
    minDiff := Min(max - mid, mid - min)
    ret := []int{0, 0}
    if maxDiff > 2 {
    	ret[1] = maxDiff - 2
	}else{
		ret[1] = 0
	}
    if minDiff <= 2 {
    	if ret[1] == 0 {
    		ret[0] = 0
		}else{
			ret[0] = 1
		}
	}else{
		ret[0] = 2
	}
    return ret
}

func Min(x, y int) int {
	if x > y {
		return y
	}
	return x
}