package questions

import "testing"

func TestGetIntersectionNode(t *testing.T){

	a1 := ListNode{Val:4}
	a2 := ListNode{Val:1}
	b1 := ListNode{Val:5}
	b2 := ListNode{Val:0}
	b3 := ListNode{Val:1}
	c1 := ListNode{Val:8}
	c2 := ListNode{Val:4}
	c3 := ListNode{Val:5}
	a1.Next = &a2
	a2.Next = &c1
	b1.Next = &b2
	b2.Next = &b3
	b3.Next = &c1
	c1.Next = &c2
	c2.Next = &c3

	a11 := ListNode{}
	a22 := ListNode{}
	b11 := ListNode{}
	b22 := ListNode{}
    a11.Next = &a22
    b11.Next = &b22

	cases := [] struct{
		headA *ListNode
		headB *ListNode
		want *ListNode
	}{
		{&a1, &b1, &c1},
		{&a11,&a11, &a11},
		{&a11, &b11, nil},
	}

	for idx,v := range cases {
		get := getIntersectionNode(v.headA, v.headB)
		if get != v.want {
			t.Errorf("No.%d fail",idx)
		}
	}
}
