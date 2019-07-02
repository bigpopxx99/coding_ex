package questions

import "testing"

func TestCountSegments(t *testing.T) {
	cases := [] struct{
		s string
		want int
	}{
		{"Hello, my name is John aa", 6},
		{"", 0},
		{" a- a a ", 3},
		{" ", 0},
		{" , ", 1},
		{", , , ,        a, eaefa", 6},
		{" 中 国 最 牛 逼， 。 ", 6},
	}

	for _, v := range cases {
		get := countSegments(v.s)
		if get != v.want {
			t.Errorf("s:%q get:%d want:%d",v.s, get,v.want)
		}
	}
}
