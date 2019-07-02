package questions

import "container/list"

func isValid(s string ) bool {
	Map := map[byte]byte{
		')' : '(',
		']' : '[',
		'}' : '{',
	}
	lst := list.New()
	arr := []byte(s)
	for i:=0; i< len(arr); i++ {
		v := arr[i]
		if v=='(' || v=='[' || v=='{' {
			lst.PushBack(v)
		}else{
			if lst.Len() == 0 {
				return false
			}
			if lst.Back().Value != Map[v] {
				return false
			}
			lst.Remove(lst.Back())
		}
	}
	return lst.Len() == 0
}
