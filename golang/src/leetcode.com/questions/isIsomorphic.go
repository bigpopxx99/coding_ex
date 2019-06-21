package questions

func isIsomorphic(s string, t string) bool {
	if len(s) == 0 && len(t) == 0 {
		return true
	}
	hashMap := make(map[string]string)
    for idx, c := range t {
    	v, ok := hashMap[string(c)]
    	if ok {
    		if v != string(s[idx]){
    			return false
			}
		}else{
			hashMap[string(t[idx])] = string(s[idx])
		}
	}
	hashMap = make(map[string]string)
	for idx, c := range s {
		v, ok := hashMap[string(c)]
		if ok {
			if v != string(t[idx]){
				return false
			}
		}else{
			hashMap[string(s[idx])] = string(t[idx])
		}
	}
	return true
}
