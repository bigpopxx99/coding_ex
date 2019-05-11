import java.util.ArrayList;
import java.util.List;

public class MaxDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node lv3Node1 = new Node(5, null);
		Node lv3Node2 = new Node(6, null);
		List<Node> lv3List = new ArrayList<>();
		lv3List.add(lv3Node1);
		lv3List.add(lv3Node2);
		Node lv2Node1 = new Node(3, lv3List);
		Node lv2Node2 = new Node(2, null);
		Node lv2Node3 = new Node(4, null);
		List<Node> lv2List = new ArrayList<>();
		lv2List.add(lv2Node1);
		lv2List.add(lv2Node2);
		lv2List.add(lv2Node3);
		Node head = new Node(1, lv2List);
		SolutionMaxDepth solution = new SolutionMaxDepth();
		System.out.println(solution.maxDepth(head));
	}
}

class Node {
	public int val;
	public List<Node> children;

	public Node() {
	}

	public Node(int _val, List<Node> _children) {
		val = _val;
		children = _children;
	}
};

class SolutionMaxDepth {
	public int maxDepth(Node root) {
		if (root == null) {
			return 0;
		}
		if (root.children == null) {
			return 1;
		}
		int count = 1;
		int max = 1;
		for (int i = 0; i < root.children.size(); i++) {
			count = 1;
			count += maxDepth(root.children.get(i));
			if (count > max) {
				max = count;
			}
		}
		return max;
	}
}
