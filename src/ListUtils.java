
public class ListUtils {
	
	public static ListNode makeUpList(int[] array) {
		if (array == null || array.length == 0) {
			System.out.println("array is null");
			return null;
		}
		ListNode head = new ListNode(array[0]);
		ListNode p = head;
		for (int i=1; i<array.length; i++) {
			ListNode node = new ListNode(array[i]);
			p.next = node;
			p = p.next;
		}
		return head;
	}

}
