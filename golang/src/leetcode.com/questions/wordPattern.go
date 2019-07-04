package questions

import "strings"

func wordPattern(pattern string, str string) bool {
    if len(pattern) == 0 && len(str) == 0 {
    	return true
	}
	if len(pattern) == 0 && len(str) != 0 {
		return false
	}
	if len(pattern) != 0 && len(str) == 0 {
		return false
	}
	patternArray := []byte(pattern)
	strArray := strings.Split(str, " ")
	if len(patternArray) != len(strArray) {
		return false
	}

	strMap := make(map[byte]string)
	ptnMap := make(map[string]byte)
	for i:=0; i<len(patternArray); i++ {
		v, ok := strMap[patternArray[i]]
		if ok {
			if v != strArray[i] {
				return false
			}
		}
		v2, ok2 := ptnMap[strArray[i]]
		if ok2 {
			if v2 != patternArray[i] {
				return false
			}
		}
		if !ok && !ok2 {
			strMap[patternArray[i]] = strArray[i]
			ptnMap[strArray[i]] = patternArray[i]
		}
	}
	return true
}