public class Test {
	
	private static void changeArray(int[] input) {
		int[] n = new int[10];
		input = n;
		System.out.println("input length:"+input.length);
	}
	
	

	public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
		
	}

}

class TMPNODE {
	int val;
	TMPNODE next;
}
