package questions

func validPalindrome(s string) bool {
	if len(s) <= 2 {
		return true
	}

	left, right := 0, len(s)-1
	for left < right {
		if s[left] != s[right] {
			ret1 := validCheck(s, left+1, right)
			if ret1 {
				return true
			}
			ret2 := validCheck(s, left, right-1)
			if ret2 {
				return true
			}
			return false
		}
		left++
		right--
	}
	return true
}

func validCheck(s string, left int, right int) bool {
	if len(s) <= 1 {
		return true
	}

	for left <= right {
		if s[left] != s[right] {
			return false
		}
		left++
		right--
	}
	return true
}
