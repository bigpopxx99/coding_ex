package questions

import "testing"

func TestHasGroupsSizeX(t *testing.T) {
	cases := [] struct{
		in []int
		want bool
	}{
		{[]int{1,2,3,4,4,3,2,1}, true},
		{[]int{1,1,1,2,2,2,3,3},false},
		{[]int{1}, false},
		{[]int{1,1}, true},
		{[]int{1,1,2,2,2,2},true},
		{[]int{2,2,2,2,1,1,3,3,3,3,3,3}, true},
		{[]int{1,1,1,1,2,2,2,2,2,2}, true},
		{[]int{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,8,8,9,9,9,10,10,10},true},
	}

	for _,v := range cases {
		get := hasGroupsSizeX(v.in)
		if get != v.want {
			t.Errorf("%v get:%v want:%v",v.in, get, v.want)
		}
	}
}
