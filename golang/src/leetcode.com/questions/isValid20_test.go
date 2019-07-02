package questions

import "testing"

func TestIsValid20(t *testing.T) {
	cases := [] struct{
		in string
		want bool
	}{
		{"()", true},
		{"()[]{}", true},
		{"(]", false},
		{"([)]", false},
		{"{[]}", true},
	}

	for _, v := range cases {
		get := isValid(v.in)
		if get != v.want {
			t.Errorf("%q get:%v want:%v", v.in, get, v.want)
		}
	}
}
