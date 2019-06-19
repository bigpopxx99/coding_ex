import java.util.Stack;

public class Test {
	
	private static void changeArray(int[] input) {
		int[] n = new int[10];
		input = n;
		System.out.println("input length:"+input.length);
	}
	
	

	public static void main(String[] args) {
        MyStack2 obj = new MyStack2();
        obj.push(1);
        obj.push(2);
        int a1 = obj.top();
        int a2 = obj.pop();
        boolean b1 = obj.empty();
	}

}

class TMPNODE {
	int val;
	TMPNODE next;
}
