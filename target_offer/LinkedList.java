import java.util.Stack;

public class LinkedList {

	/**
	 * 利用递归逆向打印，但要防止链表过长，导致的栈溢出
	 * @param head
	 */
	private static void printListReverse(LLListNode head) {
		if (head == null) {
			return;
		}
		LLListNode p = head;
		if (p.next != null) {
			printListReverse(p.next);
		}
		System.out.print(p.val + " ");
	}
	
	
	/**
	 * 使用栈的后进先出的特性，实现链表逆向打印，避免链表长度过长，递归的深度过深导致栈溢出
	 * @param head
	 */
	private static void printListRevers2(LLListNode head) {
		Stack<LLListNode> stack = new Stack<>();
		LLListNode p = head;
		while (p != null) {
			stack.push(p);
			p = p.next;
		}
		
		while (!stack.isEmpty()) {
			System.out.print(stack.pop().val + " ");
		}
		System.out.println();
	}
	
	private static void deleteNode(LLListNode head, int val) {
		if (head == null) {
			return;
		}
		if (head.val == val) {
			head = head.next;
			return;
		}
		LLListNode parentNode = head;
		LLListNode childNode = head.next;
		while (childNode != null) {
		    if (childNode.val == val) {
		    	parentNode.next = childNode.next;
		    	return;
		    }
		    childNode = childNode.next;
		    parentNode = parentNode.next;
		}
	}
	
	private static void addNode(LLListNode head, LLListNode node) {
		if (head == null || node == null) {
			return;
		}
		if (head.val == node.val) {
			return;
		}
		LLListNode p = head;
		while(p.next != null) {
			if (p.next.val == node.val) {
				return;
			}
			p = p.next;
		}
		p.next = node;
	}

	private static void printList(LLListNode head) {
		if (head == null) {
			return;
		}
		LLListNode p = head;
		while (p != null) {
			System.out.print(p.val + " ");
			p = p.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tArray = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 10 };
		LLListNode head = null;
		LLListNode p = null;
		for (int i = 0; i < tArray.length; i++) {
			LLListNode item = new LLListNode(tArray[i]);
			if (i == 0) {
				head = item;
				p = item;
			} else {
				p.next = item;
				p = p.next;
			}
		}

		printList(head);
		printListReverse(head);
		System.out.println();
		printListRevers2(head);
		
		LLListNode node1 = new LLListNode(12);
	    addNode(head, node1);
	    printList(head);
	    deleteNode(head, 14);
	    deleteNode(head, 12);
	    printList(head);

	}

}

class LLListNode {
	int val;
	LLListNode next;

	public LLListNode(int v) {
		// TODO Auto-generated constructor stub
		val = v;
	}
}
