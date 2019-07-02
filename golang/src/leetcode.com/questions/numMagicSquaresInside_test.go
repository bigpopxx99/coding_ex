package questions

import "testing"

func TestNumMagicSquaresInside(t *testing.T) {
	cases := [] struct{
		in [][]int
		want int
	}{
		{[][]int{{4,3,8,4},{9,5,1,9},{2,7,6,2}}, 1},
		{[][]int{}, 0},
	}

	for _, v := range cases {
		get := numMagicSquaresInside(v.in)
		if get != v.want {
			t.Errorf("get:%d want:%d", get, v.want)
		}
	}
}
