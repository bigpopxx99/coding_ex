import java.util.ArrayList;
import java.util.List;

class MyStack2 {
    
    private List<Integer> queue1;
    private List<Integer> queue2;

    /** Initialize your data structure here. */
    public MyStack2() {
        queue1 = new ArrayList<>();
        queue2 = new ArrayList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if (!queue1.isEmpty()){
            queue1.add(x);
        }else if (!queue2.isEmpty()){
            queue2.add(x);
        }else {
            queue1.add(x);
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (queue1.isEmpty() && !queue2.isEmpty()) {
			//把2的数据往1导，留下最后一个
			final int s = queue2.size();
			for (int i=0; i<s-1; i++) {
				queue1.add(queue2.get(0));
				queue2.remove(0);
			}
			int v = queue2.get(0);
			queue2.remove(0);
			return v;
		}else if (queue2.isEmpty() && !queue1.isEmpty()) {
			//把1的数据往2导，留下最后一个
			final int s = queue1.size();
			for (int i=0; i<s-1; i++) {
				queue2.add(queue1.get(0));
				queue1.remove(0);
			}
			int v = queue1.get(0);
			queue1.remove(0);
			return v;
		}else {
			return -1;
		}
    }
    
    /** Get the top element. */
    public int top() {
    	if (queue1.isEmpty() && !queue2.isEmpty()) {
			//把2的数据往1导，留下最后一个
			final int s = queue2.size();
			for (int i=0; i<s-1; i++) {
				queue1.add(queue2.get(0));
				queue2.remove(0);
			}
			int v = queue2.get(0);
			queue2.remove(0);
			queue1.add(v);
			return v;
		}else if (queue2.isEmpty() && !queue1.isEmpty()) {
			//把1的数据往2导，留下最后一个
			final int s = queue1.size();
			for (int i=0; i<s-1; i++) {
				queue2.add(queue1.get(0));
				queue1.remove(0);
			}
			int v = queue1.get(0);
			queue1.remove(0);
			queue2.add(v);
			return v;
		}else {
			return -1;
		}
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}
