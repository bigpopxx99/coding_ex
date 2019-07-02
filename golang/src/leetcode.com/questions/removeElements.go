package questions


func removeElements(head *ListNode, val int) *ListNode {
	for head != nil && head.Val == val {
    	head = head.Next
	}

	if head == nil {
		return nil
	}
    node := head
    for node != nil {
    	if node.Next != nil && node.Next.Val == val {
    		node.Next = node.Next.Next
		}else {
			node = node.Next
		}
	}
	return head
}
