import java.lang.invoke.ConstantCallSite;
import java.util.Stack;

public class MyQueue {
	
	public MyQueue() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}

	public void appendTail(final int v) {
		stack1.push(v);
	}

	public int deleteHead() {
		if (stack2.isEmpty()) {
			int stack1Size = stack1.size();
			for (int i = 0; i < stack1Size - 1; i++) {
				stack2.push(stack1.pop());
			}
			return stack1.pop();
		} else {
			return stack2.pop();
		}

	}

	private Stack<Integer> stack1;
	private Stack<Integer> stack2;

}
