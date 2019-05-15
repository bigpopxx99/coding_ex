
public class ReverseLinkedList {

	public static ListNode reverseLinkedList(ListNode head) {
		ListNode tail = new ListNode(-1);
		getNextNode(head, head, tail);
		return tail.next;
	}

	public static ListNode getNextNode(ListNode head, ListNode current, ListNode tail) {

		if (!(current.next == null)) {
			ListNode nextNode = getNextNode(head, current.next, tail);			
			nextNode.next = current;
			current.next = null;
		}else {
			//tail
			tail.next = current;
		}
		return current;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode t1 = new ListNode(1);
		ListNode t2 = new ListNode(2);
		ListNode t3 = new ListNode(3);
		ListNode t4 = new ListNode(4);
		ListNode t5 = new ListNode(5);
		t1.next = t2;
		t2.next = t3;
		t3.next = t4;
		t4.next = t5;
		ListNode ret = reverseLinkedList(t1);
	}

}
