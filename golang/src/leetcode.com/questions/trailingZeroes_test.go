package questions

import "testing"

func TestTrailingZeroes(t *testing.T) {
	cases := [] struct{
		n int
		want int
	}{
		{3,0},
		{5,1},
	}

	for _, v:= range cases{
		get := trailingZeroes(v.n)
		if get != v.want{
			t.Errorf("get:%d want:%d",get,v.want)
		}
	}
}
