
public class MergeLinkedList {
	
	public static ListNode mergeLinkedList(ListNode listNode1, ListNode listNode2) {
		if (listNode1 == null && listNode2 == null) {
			return null;
		}
		if (listNode1 == null) {
			return listNode2;
		}
		if (listNode2 == null) {
			return listNode1;
		}
		ListNode p1 = listNode1;
		ListNode p2 = listNode2;
		ListNode ret = listNode1.val > listNode2.val ? listNode2 : listNode1;
		
		while (p1 != null && p2 != null) {
			if (p1.val <= p2.val) {
				ListNode tmp = p1.next;
				p1.next = p2;
				p1 = tmp;
			}else {
				ListNode tmp = p2.next;
				p2.next = p1;
				p2 = tmp;
			}
		}
		
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ListNode t11 = new ListNode(1);
        ListNode t13 = new ListNode(3);
        ListNode t15 = new ListNode(5);
        t11.next = t13;
        t13.next = t15;
        
        ListNode t22 = new ListNode(2);
        ListNode t24 = new ListNode(4);
        ListNode t26 = new ListNode(6);
        ListNode t28 = new ListNode(8);
        ListNode t210 = new ListNode(10);
        t22.next = t24;
        t24.next = t26;
        t26.next = t28;
        t28.next = t210;
        
        ListNode ret = mergeLinkedList(t11, t22);
        while (ret != null) {
        	System.out.print(ret.val+" ");
        	ret = ret.next;
        }
	}

}
