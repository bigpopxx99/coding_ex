package questions

func findAnagrams(s string, p string) []int {
	ret := []int{}
	if len(p) > len(s) {
		return ret
	}
	var pm = [26]int{}
	var pArray = []byte(p)
	for i:=0; i< len(pArray); i++ {
		idx := pArray[i] - 'a'
		pm[idx] += 1
	}
	left, right, cnt := 0, 0, len(p)
	var sArray = []byte(s)
	for right < len(s) {
		idx := sArray[right] - 'a'
		if pm[idx] >= 1 {
			cnt--
		}
		pm[idx] -= 1
		right++
		if cnt == 0 {
			ret = append(ret, left)
		}
		if right - left  == len(p){
			idx := sArray[left] - 'a'
			if pm[idx] >= 0 {
				cnt++
			}
			pm[idx] += 1
			left++
		}
	}
	return ret
}

