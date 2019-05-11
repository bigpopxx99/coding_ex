class SolutionMiddleNum {
	public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
        	return head;
        }
        int count = 1;
        ListNode node = head;
        while (node.next != null) {
        	node = node.next;
        	count++;
        }
        ListNode node2 = head;
        int count2 = 0;
        while (count2 < (int)count/2) {
        	node2 = node2.next;
        	count2++;
        }
        return node2;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class MiddleNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(6);
        SolutionMiddleNum solution = new SolutionMiddleNum();
        System.out.println(solution.middleNode(head).val);
	}

}
