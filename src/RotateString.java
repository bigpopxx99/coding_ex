import java.util.LinkedList;

public class RotateString {
	
//	public class MyLinkedNode {
//		char val;
//		MyLinkedNode next;
//		public MyLinkedNode(char v) {
//			this.val = v;
//		}
//	}
//	
//    public boolean rotateString(String A, String B) {
//    	if (A == null || B == null || A.length() != B.length()) {
//    		return false;
//    	}
//    	if (A.equals(B)) {
//    		return true;
//    	}
//    	MyLinkedNode aHead = new MyLinkedNode(A.charAt(0));
//    	MyLinkedNode aPoint = aHead;
//        for (int i=1; i<A.length(); i++) {
//        	MyLinkedNode tmp = new MyLinkedNode(A.charAt(i));
//        	aPoint.next = tmp;
//        	aPoint = aPoint.next;
//        }
//        aPoint.next = aHead;
//
//        MyLinkedNode aStart = aHead;
//        int searchTime = A.length();
//        while (searchTime-- > 0) {
//        	MyLinkedNode point = aStart;
//        	StringBuffer sBuffer = new StringBuffer();
//        	for (int i=0; i<A.length(); i++) {
//        		sBuffer.append(point.val);
//        		point = point.next;
//        	}
//        	if (sBuffer.toString().equals(B)) {
//        		return true;
//        	}
//        	aStart = aStart.next;
//        }
//        return false;
//    }
	// StringBuffer或者A+A 要比String.format()快
	public boolean rotateString(String A, String B) {
		if (A==null || B==null || A.length() != B.length()) {
			return false;
		}
		String AA = A+A;
		return AA.contains(B);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateString obj = new RotateString();
		System.out.println(obj.rotateString("abcde", "cdeab"));
		System.out.println(obj.rotateString("abcde", "abced"));
		System.out.println(obj.rotateString("", ""));

	}

}
