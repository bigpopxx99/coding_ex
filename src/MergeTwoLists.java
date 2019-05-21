
public class MergeTwoLists {

	// public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	// if (l1 == null) return l2;
	// if (l2 == null) return l1;
	//
	// ListNode head = new ListNode(Math.min(l1.val, l2.val));
	// if (l1.val < l2.val) {
	// l1 = l1.next;
	// }else {
	// l2 = l2.next;
	// }
	// ListNode pNode = head;
	// while (l1 != null && l2 != null) {
	// ListNode node = new ListNode(Math.min(l1.val, l2.val));
	// if (l1.val < l2.val) {
	// l1 = l1.next;
	// }else {
	// l2 = l2.next;
	// }
	// pNode.next = node;
	// pNode = pNode.next;
	// }
	// if (l1 != null) {
	// pNode.next = l1;
	// }else {
	// pNode.next = l2;
	// }
	// return head;
	// }

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode head = l1.val <= l2.val ? l1 : l2;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				while (l1.next != null && l1.next.val <= l2.val) {
					l1 = l1.next;
				}
				ListNode tmp1 = l1.next;
				l1.next = l2;
				l1 = tmp1;
			} else {
				while (l2.next != null && l2.next.val <= l1.val) {
					l2 = l2.next;
				}
				ListNode tmp2 = l2.next;
				l2.next = l1;
				l2 = tmp2;
			}
		}

		return head;
	}

	public static void main(String[] args) {
		int[] t1 = { 1, 4, 7, 23 };
		int[] t2 = { 2, 3, 5, 6, 8, 24 };
		ListNode l1 = new ListNode(t1[0]);
		ListNode pNode1 = l1;
		for (int i = 1; i < t1.length; i++) {
			ListNode node = new ListNode(t1[i]);
			pNode1.next = node;
			pNode1 = pNode1.next;
		}

		ListNode l2 = new ListNode(t2[0]);
		ListNode pNode2 = l2;
		for (int i = 1; i < t2.length; i++) {
			ListNode node = new ListNode(t2[i]);
			pNode2.next = node;
			pNode2 = pNode2.next;
		}
		MergeTwoLists mergeTwoLists = new MergeTwoLists();
		ListNode ret = mergeTwoLists.mergeTwoLists(l1, l2);

		while (ret != null) {
			System.out.print(ret.val + " ");
			ret = ret.next;
		}
	}

}
