package questions

import "testing"

func TestContainsNearbyDuplicate(t *testing.T) {
	cases := [] struct{
		nums []int
		k int
		want bool
	}{
		{[]int{1,2,3,1}, 3, true},
		{[]int{1,0,1,1}, 1, true},
		{[]int{1,2,3,1,2,3}, 2, false},
		{[]int{99,99}, 2, true},
	}

	for idx,v := range cases {
		get := containsNearbyDuplicate(v.nums, v.k)
		if get != v.want {
			t.Errorf("No.%d fail get:%v want:%v", idx, get, v.want)
		}
	}
}
