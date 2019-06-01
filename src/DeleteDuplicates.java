
public class DeleteDuplicates {
	
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
        	return head;
        }
        ListNode p = head;
        while (p.next != null) {
        	if (p.val == p.next.val) {
        		p.next = p.next.next;
        	}else {
        		p = p.next;
        	}
        }
        return head;
    }

	public static void main(String[] args) {
        ListNode t1 = ListUtils.makeUpList(new int[] {1,1,2});
        ListNode t2 = ListUtils.makeUpList(new int[] {1,1,2,3,3});
        DeleteDuplicates d = new DeleteDuplicates();
        Utils.printListNodes(d.deleteDuplicates(t1));
        Utils.printListNodes(d.deleteDuplicates(t2));
	}

}
