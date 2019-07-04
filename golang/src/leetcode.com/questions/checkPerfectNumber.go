package questions

func checkPerfectNumber(num int) bool {
	if num == 1{
		return false
	}
	sum := 1
	div := 2
    for  {
    	if div >= int(num/2) {
    		break
		}
		if num % div == 0 {
			bigDiv := num / div
			if bigDiv < div {
				break
			}else if bigDiv == div {
				sum += div
				break
			}else{
				sum += div + bigDiv
			}
		}
		div++
	}

	return num == sum
}