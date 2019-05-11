
public class ReverseList {

	// 递归实现
//	public static MyListNode reverseList(MyListNode head) {
//		if (head == null || head.next == null) {
//			return head;
//		}
//		MyListNode tListNode = reverseList(head.next);
//		MyListNode p = tListNode;
//		while (p.next != null) {
//			p = p.next;
//		}
//		p.next = head;
//		head.next = null;
//        return tListNode;
//	}
	
	// 迭代实现 效率比递归高，但是逻辑复杂，判断条件复杂，不好理解，思路就是针对单向链表，设置左中右三个指针向右逐渐移动，根据各种情况判断返回时机
	public static MyListNode reverseList(MyListNode head) {
		MyListNode p = head;
		if (p==null || p.next == null) {
			return p;
		}else {
			MyListNode l = p;
			p = p.next;
			MyListNode r = p.next;
			l.next = null;
			while (true) {
				p.next = l;
				if (r == null) {
					return p;
				}else if (r.next == null) {
					r.next = p;
					return r;
				}else {
				    l = p;
				    p = r;
				    r = r.next;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyListNode t1 = new MyListNode(1);
        MyListNode t2 = new MyListNode(2);
        MyListNode t3 = new MyListNode(3);
        MyListNode t4 = new MyListNode(4);
        MyListNode t5 = new MyListNode(5);
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;
        t4.next = t5;
        printLink(t1);      
        MyListNode a1 = reverseList(t1);
        printLink(a1);
	}
	
	private static void printLink(MyListNode head) {
		MyListNode p = head;
		while (p != null) {
			System.out.print(p.val+" ");
			p = p.next;
		}
		System.out.println("");
	}
}

class MyListNode {
	int val;
	MyListNode next;

	MyListNode(int x) {
		val = x;
	}
}


