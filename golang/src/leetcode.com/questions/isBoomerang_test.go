package questions

import "testing"

func TestIsBoomerang(t *testing.T){

	cases := [] struct {
		in [][]int
		want bool
	}{
		{[][]int{{1,1},{2,3},{3,2}}, true},
		{[][]int{{1,1},{2,2},{3,3}}, false},
	}

	for idx, c := range cases{
		get := isBoomerang(c.in)
		if (get != c.want){
			t.Errorf("No.%d get==%v want==%v", idx+1, get, c.want)
		}
	}
}

