package questions

import (
	"fmt"
	"strconv"
)

func largestTimeFromDigits(A []int) string {
    ret := private_getFullArray(fmt.Sprintf("%d%d%d%d",A[0],A[1],A[2],A[3]))
    var valid []string
    for i:=0; i< len(ret); i++ {
    	if private_validCheck(ret[i]){
    		valid = append(valid, ret[i])
		}
	}
	if len(valid) > 0 {
		maxIdx := 0
		maxV, _ := strconv.Atoi(valid[0])

		for i:=1; i<len(valid); i++ {
			v, _ := strconv.Atoi(valid[i])
			if v > maxV {
				maxIdx = i
				maxV = v
			}
		}
        return fmt.Sprintf("%v%v:%v%v",valid[maxIdx][0]-'0',valid[maxIdx][1]-'0',valid[maxIdx][2]-'0',valid[maxIdx][3]-'0')
	}else{
		return ""
	}
}

func private_getFullArray(s string) []string {
	strs := make([]string, 0)
	private_helper([]byte(s), 0, &strs)
	return strs
}

func private_helper(bt []byte, start int, strs *[]string) {

	if start == len(bt) {
		*strs = append(*strs, string(bt))
	} else {
		for i := start; i <= len(bt)-1; i++ {
			if i != start {
				tmp := bt[start]
				bt[start] = bt[i]
				bt[i] = tmp
			}

			private_helper(bt, start+1, strs)

			if i != start {
				tmp := bt[start]
				bt[start] = bt[i]
				bt[i] = tmp
			}
		}
	}
}

func private_validCheck(s string) bool {
	if s[0]-'0' > 2 {
		return false
	}
	if s[0]-'0' == 2 && s[1]-'0' > 3 {
		return false
	}
	if s[2]-'0' > 5 {
		return false
	}
	return true
}
