package questions


func containsNearbyDuplicate(nums []int, k int) bool {
	numsMap := make(map[int]int)
	for idx:=0; idx < len(nums);idx++ {
		value := nums[idx]
		if v,ok := numsMap[value]; ok == true {
			if idx-v <= k {
				return true
			}
		}
		numsMap[value] = idx
	}
	return false
}