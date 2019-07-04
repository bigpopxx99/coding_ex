package questions

import "testing"

func TestCheckPerfectNumber(t *testing.T) {
	cases := [] struct{
		in int
		want bool
	}{
		{28, true},
		{1, false},
		{2, false},
		{4, false},
	}

	for _, v := range cases {
		get := checkPerfectNumber(v.in)
		if get != v.want {
			t.Errorf("%d, get:%v, want:%v",v.in, get, v.want)
		}
	}
}
