package questions

func isPalindrome(head *ListNode) bool {
	if head == nil {
		return false
	}
	slow := head
	fast := head

	for fast.Next != nil && fast.Next.Next != nil {
		fast = fast.Next.Next
		slow = slow.Next
	}
	rHead := reverse(slow.Next)
	for rHead != nil {
		if rHead.Val != head.Val {
			return false
		}
		rHead = rHead.Next
		head = head.Next
	}
	return true
}

func reverse(head *ListNode) *ListNode{
	var pre *ListNode
	var next *ListNode

	for head != nil {
		next = head.Next
		head.Next = pre
		pre = head
		head = next
	}

	return pre
}
