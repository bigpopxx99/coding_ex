package questions

import "testing"

func TestWordPattern(t *testing.T) {
	cases := [] struct {
		p    string
		s    string
		want bool
	}{
		{"abba", "dog cat cat dog", true},
		{"abba", "dog cat cat fish", false},
		{"aaaa", "dog cat cat dog", false},
		{"abba", "dog dog dog dog", false},
		{"abcd", "cat dog fish sheep", true},
		{"", "", true},
		{"", "cat", false},
		{"a", "cat", true},
		{"ab", "", false},
	}

	for _, v := range cases {
		get := wordPattern(v.p, v.s)
		if get != v.want {
			t.Errorf("%v %v get:%v want:%v", v.p, v.s, get, v.want)
		}
	}
}
