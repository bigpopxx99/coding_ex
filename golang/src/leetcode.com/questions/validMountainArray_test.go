package questions

import "testing"

func TestValidMountainArray(t *testing.T) {
	cases := [] struct{
		in []int
		want bool
	}{
		{[]int{2,1}, false},
		{[]int{3,5,5}, false},
		{[]int{0,3,2,1}, true},
	}

	for _, v := range cases {
		get := validMountainArray(v.in)
		if get != v.want {
			t.Errorf("fail array:%v, get:%v, want:%v",v.in, get, v.want)
		}
	}
}
