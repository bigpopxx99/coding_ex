package questions

//func getIntersectionNode(headA, headB *ListNode) *ListNode {
//	if headA == nil || headB == nil {
//		return nil
//	}
//	if headA == headB {
//		return headA
//	}
//    numA := getNodeListNums(headA)
//    numB := getNodeListNums(headB)
//    if numA > numB {
//    	for i:=0; i<numA-numB; i++ {
//    		headA = headA.Next
//		}
//	}else if numA < numB {
//		for i:=0; i<numB-numA; i++ {
//			headB = headB.Next
//		}
//	}
//	for headA != nil && headB != nil {
//		if headA == headB {
//			return headA
//		}
//		headA = headA.Next
//		headB = headB.Next
//	}
//	return nil
//}
//

func getIntersectionNode(headA, headB *ListNode) *ListNode {
	if headA == nil ||  headB == nil {
		return nil
	}

	a := headA
	b := headB

	for a!=b {
		if a != nil {
			a = a.Next
		}else{
			a = headB
		}
		if b != nil {
			b = b.Next
		}else{
			b = headA
		}
	}

	return a
}

func getNodeListNums(head *ListNode) int {
	ret := 0
	node := head
	for node != nil {
		ret++
		node = node.Next
	}
    return ret
}