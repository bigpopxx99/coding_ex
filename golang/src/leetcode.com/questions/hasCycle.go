package questions


func hasCycle(head *ListNode) bool {
	for node:=head; node != nil; node=node.Next {
		if node.Val == -999999 {
			return true
		}
		node.Val = -999999
	}
	return false
}
