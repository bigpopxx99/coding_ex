package questions

import "testing"

func TestLargestTimeFromDigits(t *testing.T){
	cases := [] struct{
		in []int
		want string
	}{
		{[]int{1,2,3,4}, "23:41"},
		{[]int{5,5,5,5}, ""},
		{[]int{0,4,0,0}, "04:00"},
		{[]int{2,0,6,6}, "06:26"},
	}

	for _,v := range cases {
		get := largestTimeFromDigits(v.in)
		if get != v.want {
			t.Errorf("%v get:%v want:%v", v.in, get, v.want)
		}
	}
}