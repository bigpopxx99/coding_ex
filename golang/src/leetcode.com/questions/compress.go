package questions

import (
	"strconv"
)

func compress(chars []byte) int {
	if len(chars) == 1 {
		return 1
	}
	length := len(chars)
	w := 0
	for p, q := 0, 1; q < length; q++ {
		if chars[q] != chars[p] {
			diff := q - p
			if diff > 1 {
				chars[w] = chars[p]
				if diff > 9 {
					str := strconv.Itoa(diff)
					for i := 0; i < len(str); i++ {
						chars[w+1+i] = str[i]
					}
					w += len(str) + 1
				}else{
					chars[w+1] = byte('0'+diff)
					w += 2
				}
			}else{
				chars[w] = chars[p]
				w += 1
			}
			p = q
		}
		if q == length-1 {
			diff := q - p + 1
			if diff > 1 {
				chars[w] = chars[p]
				if diff > 9 {
					str := strconv.Itoa(diff)
					for i := 0; i < len(str); i++ {
						chars[w+1+i] = str[i]
					}
					w += len(str) + 1
				}else{
					chars[w+1] = byte('0'+diff)
					w += 2
				}
			} else {
				chars[w] = chars[p]
				w += 1
			}
			break
		}
	}
	return w
}
