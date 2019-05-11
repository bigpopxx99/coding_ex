
public class DeleteNode {

	public static void deleteNode(DNListNode node) {
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DNListNode t1 = new DNListNode(4);
		DNListNode t2 = new DNListNode(5);
		DNListNode t3 = new DNListNode(1);
		DNListNode t4 = new DNListNode(9);
        
        t3.next = t4;
        t2.next = t3;
        t1.next = t2;
        
        printLinkedList(t1);
        
	}
	
	private static void printLinkedList(DNListNode head) {
		while (head != null) {
			System.out.print(head.val+" ");
			head = head.next;
		}
	}
}

class DNListNode {
	int val;
	DNListNode next;

	DNListNode(int x) {
		val = x;
	}
}


