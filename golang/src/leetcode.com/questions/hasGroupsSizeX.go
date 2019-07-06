package questions

import "sort"

func hasGroupsSizeX(deck []int) bool {
	xMap := make(map[int]int)

	for i := 0; i < len(deck); i++ {
		v, ok := xMap[deck[i]]
		if ok {
			xMap[deck[i]] = v + 1
		} else {
			xMap[deck[i]] = 1
		}
	}
	xMap2 := make(map[int]int)
	for _, value := range xMap {
		if value < 2 {
			return false
		}
		_, ok := xMap2[value]
		if !ok {
			xMap2[value] = 1
		}
	}
	var array []int
	for key := range xMap2 {
		array = append(array, key)
	}
	sort.Ints(array)
	first := array[0]
	var fArray []int
	fArray = append(fArray, first)
	for i:=1; i<len(array); i++ {
		if array[i] % first != 0 {
			fArray = append(fArray, array[i])
		}
	}
	for i:=2; i<=first; i++ {
		cr := true
		for j:=1; j< len(fArray); j++ {
			if fArray[j] % i != 0{
				cr = false
				break
			}
		}
		if cr == true {
			return true
		}
	}
	return false
}
