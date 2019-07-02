package questions

import (
	"testing"
)

func TestRemoveElements(t *testing.T) {
	test1 := MakeNodeList([]int{1, 2, 6, 3, 4, 5, 6})
	want1 := MakeNodeList([]int{1, 2, 3, 4, 5})
	cases := [] struct {
		head *ListNode
		val  int
		want *ListNode
	}{
		{test1, 6, want1},
		{nil, 6, nil},
	}

	for idx, v := range cases {
        get := removeElements(v.head, v.val)
        if !CompareNodeLists(get, v.want) {
        	t.Error("test",idx," fail"," get:",getNodeListString(get), " want:",getNodeListString(v.want))
		}
	}
}
