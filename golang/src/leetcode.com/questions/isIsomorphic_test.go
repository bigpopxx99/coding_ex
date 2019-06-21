package questions

import "testing"

func TestIsIsomorphic(t *testing.T){

	cases := [] struct {
		s string
		t string
		want bool
	}{
		{"egg", "add", true},
		{"foo", "bar", false},
		{"paper", "title", true},
		{"ab","aa",false},
	}

	for idx, c := range cases{
		get := isIsomorphic(c.s, c.t)
		if (get != c.want){
			t.Errorf("No.%d get==%v want==%v", idx+1, get, c.want)
		}
	}
}