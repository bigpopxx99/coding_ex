package questions

import (
	"testing"
)

func TestIsPalindrome(t *testing.T){
	test1 := MakeNodeList([]int{1,2,2,1})
	test2 := MakeNodeList([]int{1,2})
	cases := [] struct{
		head *ListNode
		want bool
	}{
		{test1, true},
		{test2, false},
		{nil, false},
	}

	for idx,v := range cases {
		get := isPalindrome(v.head)
		if get != v.want {
			t.Errorf("test%d, get:%v want:%v",idx, get, v.want)
		}
	}
}
