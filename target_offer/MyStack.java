import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class MyStack {
	
	public MyStack() {
		queue1 = new LinkedBlockingQueue<>();
		queue2 = new LinkedBlockingQueue<>();
	}
	
	public void push(int v) {
		if (!queue1.isEmpty()) {
			queue1.add(v);
		}else if (!queue2.isEmpty()) {
			queue2.add(v);
		}else {
			queue1.add(v);
		}
	}
	
	public int pop() {
		if (queue1.isEmpty() && !queue2.isEmpty()) {
			//把2的数据往1导，留下最后一个
			final int s = queue2.size();
			for (int i=0; i<s-1; i++) {
				queue1.add(queue2.poll());
			}
			return queue2.poll();
		}else if (queue2.isEmpty() && !queue1.isEmpty()) {
			//把1的数据往2导，留下最后一个
			final int s = queue1.size();
			for (int i=0; i<s-1; i++) {
				queue2.add(queue1.poll());
			}
			return queue1.poll();
		}else {
			return -1;
		}
	}

	private Queue<Integer> queue1;
	private Queue<Integer> queue2;
}
