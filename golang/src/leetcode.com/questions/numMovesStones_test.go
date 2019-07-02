package questions

import "testing"

func TestNumMovesStones(t *testing.T) {
	cases := [] struct{
		a int
		b int
		c int
		want []int
	}{
		{1,2,5, []int{1,2}},
		{4,3,2, []int{0,0}},
		{3,5,1, []int{1,2}},
		{1,9,5, []int{2,6}},
	}

	for _, v := range cases {
		get := numMovesStones(v.a,v.b,v.c)
		for i:=0; i< len(get); i++ {
			if get[i] != v.want[i]{
				t.Errorf("error get:%v want:%v",get, v.want)
			}
		}
	}
}
