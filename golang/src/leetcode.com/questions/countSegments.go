package questions

func countSegments(s string) int {
	if len(s) == 0 {
		return 0
	}
	ret := 0
	arr := []byte(s)
	flag := false
	idx := 0
	for idx < len(arr) {
		if arr[idx] == ' ' {
			if flag {
			    ret++
			    flag = false
			}
		}else{
			if !flag {
				flag = true
			}
		}
		idx++
	}
	if arr[len(arr)-1] != ' ' {
		ret++
	}
	return ret
}

func countSegments2(s string) int {
	if len(s) == 0 {
		return 0
	}
	ret := 0
	arr := []rune(s)
	flag := false
	idx := 0
	for idx < len(arr) {
		if arr[idx] == ' ' {
			if flag {
				ret++
				flag = false
			}
		}else{
			if !flag {
				flag = true
			}
		}
		idx++
	}
	if arr[len(arr)-1] != ' ' {
		ret++
	}
	return ret
}