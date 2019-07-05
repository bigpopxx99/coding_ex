package questions

import "testing"

func TestValidPalindrome(t *testing.T) {
	cases := [] struct{
		in string
		want bool
	}{
		{"aba", true},
		{"abca", true},
		{"a", true},
		{"", true},
		{"abcdefghfedcba", true},
		{"abcdefgyzfedcba", false},
		{"aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga", true},

	}

	for _,v := range cases {
		get := validPalindrome(v.in)
		if get != v.want {
			t.Errorf("%v, get:%v, want:%v", v.in, get, v.want)
		}
	}
}
