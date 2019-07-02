package questions

import (
	"bytes"
	"strconv"
)

func MakeNodeList(arr []int) *ListNode{
	if arr == nil || len(arr) == 0 {
		return nil
	}
	head := &ListNode{arr[0], nil}
	pre := head
	for i:=1; i<len(arr); i++ {
		node := &ListNode{arr[i], nil}
		pre.Next = node
		pre = pre.Next
	}
	return head
}


func CompareNodeLists(head1 *ListNode, head2 *ListNode) bool {
	for head1 != nil && head2 != nil {
		if head1.Val != head2.Val {
			return false
		}
		head1 = head1.Next
		head2 = head2.Next
	}
	return head1 == nil && head2 == nil
}

func getNodeListString(head *ListNode) string{
	buf := bytes.Buffer{}
	for head != nil {
		if head.Next == nil {
			buf.WriteString(strconv.Itoa(head.Val))
		}else{
			buf.WriteString(strconv.Itoa(head.Val)+"->")
		}
		head = head.Next
	}
	return buf.String()
}
