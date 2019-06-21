package test

import (
	"fmt"
	"sort"
)

func main() {
	//test1 := "IDID"
	//test2 := "III"
	//test3 := "DDI"
	//
	//fmt.Println(diStringMatch(test1))
	//fmt.Println(diStringMatch(test2))
	//fmt.Println(diStringMatch(test3))
	//
	//left := 1
	//right := 22
	//fmt.Println(selfDividingNumbers(left, right))

	//test1 := []int{0,1,0}
	//test2 := []int{0,2,1,0}
	//
	//fmt.Println(peakIndexInMountainArray(test1))
	//fmt.Println(peakIndexInMountainArray(test2))

	//test1 := []int{1,4,3,2}
	//fmt.Println(arrayPairSum(test1))

	test1 := []int{4, 2, 5, 7}
	fmt.Println(sortArrayByParityII(test1))
}

func sortArrayByParityII(A []int) []int {
	evenP := 0
	oddP := 1
	for oddP <= len(A)-1 && evenP <= len(A)-2 {
		if A[evenP]%2 != 0 {
			tmp := A[evenP]
			A[evenP] = A[oddP]
			A[oddP] = tmp
			oddP += 2
		} else {
			evenP += 2
		}
	}
	return A
}

//func sortArrayByParityII(A []int) []int {
//    oddArray := make([]int, 0)
//    evenArray := make([]int, 0)
//    retArray := make([]int, 0)
//    for i:=0; i<len(A); i++ {
//    	if A[i] % 2 == 0 {
//			evenArray = append(evenArray, A[i])
//		}else{
//			oddArray = append(oddArray, A[i])
//		}
//	}
//	for j:=0; j<len(oddArray); j++ {
//		retArray = append(retArray, evenArray[j], oddArray[j])
//	}
//	return retArray
//}

func arrayPairSum(nums []int) int {
	sort.Ints(nums)
	sum := 0
	for i := 0; i < len(nums); i += 2 {
		sum += nums[i]
	}
	return sum
}

func peakIndexInMountainArray(A []int) int {
	for i := 0; i < len(A)-1; i++ {
		if A[i+1] < A[i] {
			return i
		}
	}
	return -1
}

func diStringMatch(S string) []int {
	if len(S) == 0 {
		return nil
	}
	ret := make([]int, len(S))
	lo := 0
	hi := len(S)

	for i := 0; i < len(S); i++ {
		if S[i] == 'I' {
			ret[i] = lo
			lo++
		} else {
			ret[i] = hi
			hi--
		}
	}
	ret = append(ret, lo)
	return ret
}

func selfDividingNumbers(left int, right int) []int {
	if left > right || left < 0 || left > 10000 || right < 0 || right > 10000 {
		return nil
	}
	ret := make([]int, 0)
	for i := left; i <= right; i++ {
		j := i
		isTrue := true
		for j != 0 {
			if j%10 == 0 || i%(j-j/10*10) != 0 {
				isTrue = false
				break
			}
			j = j / 10
		}
		if isTrue {
			ret = append(ret, i)
		}
	}
	return ret
}
