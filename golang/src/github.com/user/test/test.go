package test

import (
	"fmt"
	"strings"
)

type iPeople interface {
	run()
	speak()
}

type StructBlackMan struct {
}

func (blackMan structBlackMan) run() {
	fmt.Println("im a blackman run")
}

func (blackMan structBlackMan) speak() {
	fmt.Println("im a blackman speak")
}

func main() {
	//fmt.Println(numJewelsInStones("aA", "aAAbbbb"))
	//fmt.Println(numJewelsInStones("z","ZZ"))

	//test_list := []string{"tests.+emailalex@leecode.com", "test.+e.mail+bob.cathy@leetcode.com", "test+email+david@leecode.com"}
	//fmt.Println(numUniqueEmails(test_list))
	//
	//test_str := []string{"gin", "zen", "gig", "msg"}
	//fmt.Println(uniqueMorseRepresentations(test_str))

	//test1 := []string{"cba","daf","ghi"}
	//	//test2 := []string{"a","b"}
	//	//test3 := []string{"zyx","wvu","tsr"}
	//	//
	//	//fmt.Println(minDeletionSize(test1))
	//	//fmt.Println(minDeletionSize(test2))
	//	//fmt.Println(minDeletionSize(test3))

	//test1 := []int{3, 1, 2, 4}
	//test2 := []int{0, 1}
	//fmt.Println(sortArrayByParity(test1))
	//fmt.Println(sortArrayByParity(test2))

	//test1 := "LLR"
	//test2 := "UUDD"
	//fmt.Println(judgeCircle(test1))
	//fmt.Println(judgeCircle(test2))

	test1 := [][]int{{1,1,0},{1,0,1},{0,0,0}}
	test2 := [][]int{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}}
	fmt.Println(flipAndInvertImage(test1))
	fmt.Println(flipAndInvertImage(test2))

}

func flipAndInvertImage(A [][]int) [][]int {
    if A == nil || len(A) == 0 || A[0] == nil || len(A[0]) == 0 {
    	return A
	}

	y := 0
	for y < len(A) {
		x := 0
		for x < len(A[y])-1-x {
			A[y][x], A[y][len(A[y])-1-x] = A[y][len(A[y])-1-x], A[y][x]
			x++
		}
		for i:=0; i<len(A[y]); i++ {
            v := A[y][i] - 1
            if v > 0 {
				A[y][i] = v
			}else{
				A[y][i] = v * (-1)
			}
		}
		y++
	}
	return A
}

func judgeCircle(moves string) bool {
	if len(moves) == 0 {
		return true
	}
	h_v := 0
	v_v := 0
	for i := 0; i < len(moves); i++ {
		switch moves[i] {
		case 'U':
			v_v++
			break
		case 'D':
			v_v--
			break
		case 'L':
			h_v++
			break
		case 'R':
			h_v--
			break
		default:
			break
		}
	}
	return (h_v == 0) && (v_v == 0)
}

func numJewelsInStones(J string, S string) int {
	if len(J) == 0 || len(S) == 0 {
		return 0
	}
	count := 0
	slice := strings.Split(J, "")
	for _, v := range slice {
		count += strings.Count(S, v)
	}
	return count
}

func numUniqueEmails(emails []string) int {
	if emails == nil || len(emails) == 0 {
		return 0
	}
	new_map := map[string]string{}
	for _, v := range emails {
		at_index := strings.Index(v, "@")
		plus_index := strings.Index(v, "+")
		local_name := v[0:plus_index]
		local_name = strings.Replace(local_name, ".", "", -1)
		parsed_str := local_name + "@" + v[at_index+1:]
		_, ok := new_map[parsed_str]
		if !ok {
			new_map[parsed_str] = "_"
		}
	}
	return len(new_map)
}

func uniqueMorseRepresentations(words []string) int {
	if words == nil || len(words) == 0 {
		return 0
	}
	transList := []string{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
		"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."}
	resultMap := map[string]string{}
	count := len(words)
	for i := 0; i < len(words); i++ {
		word := words[i]
		morse := ""
		for j := 0; j < len(word); j++ {
			letter := word[j]
			index := letter - 'a'
			morse += transList[index]
		}
		_, ok := resultMap[morse]
		if !ok {
			resultMap[morse] = "_"
		} else {
			count--
		}
	}
	return count
}

func minDeletionSize(A []string) int {
	if A == nil || len(A) == 0 || len(A[0]) == 0 {
		return 0
	}
	count := 0
	eachStringLength := len(A[0])
	for i := 0; i < eachStringLength; i++ {
		for j := 0; j < len(A)-1; j++ {
			if A[j][i] > A[j+1][i] {
				count++
				break
			}
		}
	}
	return count
}

func sortArrayByParity(A []int) []int {
	if A == nil || len(A) == 0 {
		return A
	}
	resultArray := make([]int, len(A))
	index := 0
	for _, v := range A {
		if v%2 == 0 {
			resultArray[index] = v
			index++
		}
	}
	for _, v := range A {
		if v%2 == 1 {
			resultArray[index] = v
			index++
		}
	}
	return resultArray
}
