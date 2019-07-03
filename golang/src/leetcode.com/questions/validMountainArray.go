package questions

func validMountainArray(A []int) bool {
    tp := 0 //0:up, 1:down
    for i:=0; i< len(A) - 1; i++ {
    	if A[i+1] == A[i] {
    		return false
		}
    	if tp == 0 && A[i+1] < A[i] {
    		if i == 0 {
    			return false
			}else{
				tp = 1
			}
		}
		if tp == 1 && A[i+1] > A[i] {
			return false
		}
	}
	return tp == 1
}