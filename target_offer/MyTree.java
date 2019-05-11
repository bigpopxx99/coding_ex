import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyTree {

	// 递归方式
	public static void preOrderTraversal(MyTreeNode root, List<Integer> list) {
		if (root == null)
			return;
		list.add(root.val);
		if (root.left != null) {
			preOrderTraversal(root.left, list);
		}
		if (root.right != null) {
			preOrderTraversal(root.right, list);
		}
	}

	// 循环方式
	public static void preOrderTraversal2(MyTreeNode root, List<Integer> list) {
		if (root == null)
			return;
		Stack<MyTreeNode> stack = new Stack<>();
		MyTreeNode current = root;
		while (current != null || !stack.isEmpty()) {
			if (current != null) {
				list.add(current.val);
				stack.push(current);
				current = current.left;
			} else {
				current = stack.pop().right;
			}
		}
	}

	// 递归方式
	public static void inOrderTraversal(MyTreeNode root, List<Integer> list) {
		if (root == null)
			return;
		if (root.left != null) {
			inOrderTraversal(root.left, list);
		}
		list.add(root.val);
		if (root.right != null) {
			inOrderTraversal(root.right, list);
		}
	}

	// 循环方式
	public static void inOrderTraversal2(MyTreeNode root, List<Integer> list) {
		if (root == null)
			return;

		Stack<MyTreeNode> stack = new Stack<>();
		MyTreeNode current = root;
		while (current != null || !stack.isEmpty()) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				current = stack.pop();
				list.add(current.val);
				current = current.right;
			}
		}
	}

	// 递归方式
	public static void postOrderTraversal(MyTreeNode root, List<Integer> list) {
		if (root == null)
			return;
		if (root.left != null) {
			postOrderTraversal(root.left, list);
		}
		if (root.right != null) {
			postOrderTraversal(root.right, list);
		}
		list.add(root.val);
	}

	// 循环方式
	public static void postOrderTraversal2(MyTreeNode root, List<Integer> list) {
		if (root == null)
			return;

		Stack<MyTreeNode> stack = new Stack<>();
		MyTreeNode current = root;
		stack.push(current);
		stack.push(current);
		while (!stack.isEmpty()) {
			current = stack.pop();
			if (!stack.isEmpty() && current == stack.peek()) {
				if (current.right != null) {
					stack.push(current.right);
					stack.push(current.right);
				}
				if (current.left != null) {
					stack.push(current.left);
					stack.push(current.left);
				}
			}else {
				list.add(current.val);
			}
		}
	}

	//递归方式
	public static void widthFirstTraversal(MyTreeNode root, List<Integer> list) {
		if (root == null)
			return;
		int[] layer = { 0 };
		while (true) {
			int lastTimeListLength = list.size();
			getLayerNodes(root, list, 0, layer);
			if (list.size() == lastTimeListLength) {
				return;
			} else {
				layer[0] += 1;
			}
		}
	}

	public static void getLayerNodes(MyTreeNode root, List<Integer> list, int curLayer, int[] layer) {
		if (curLayer > layer[0]) {
			return;
		}
		if (curLayer == layer[0]) {
			list.add(root.val);
			return;
		}
		if (curLayer < layer[0]) {

			if (root.left != null) {
				getLayerNodes(root.left, list, curLayer + 1, layer);
			}
			if (root.right != null) {
				getLayerNodes(root.right, list, curLayer + 1, layer);
			}
		}
	}
	
	//循环方式，借助列表
	public static void widthFirstTraversal2(MyTreeNode root, List<Integer> list) {
		if (root == null)
			return;
		ArrayList<MyTreeNode> arrayList = new ArrayList<>();
		arrayList.add(root);
		while(arrayList != null && arrayList.size() > 0) {
			ArrayList<MyTreeNode> newArrayList = new ArrayList<>();
			for (int i=0; i<arrayList.size(); i++) {
				list.add(arrayList.get(i).val);
				if (arrayList.get(i).left != null) {
				    newArrayList.add(arrayList.get(i).left);
				}
				if (arrayList.get(i).right != null) {
				    newArrayList.add(arrayList.get(i).right);
				}
			}
			arrayList = newArrayList;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyTreeNode t1 = new MyTreeNode(1);
		MyTreeNode t2 = new MyTreeNode(2);
		MyTreeNode t3 = new MyTreeNode(3);
		MyTreeNode t4 = new MyTreeNode(4);
		MyTreeNode t5 = new MyTreeNode(5);
		MyTreeNode t6 = new MyTreeNode(6);
		MyTreeNode t7 = new MyTreeNode(7);

		ArrayList<Integer> list = new ArrayList<>();

		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		preOrderTraversal(t1, list);
		System.out.print("preorder: ");
		System.out.println(list);
		list.clear();
		preOrderTraversal2(t1, list);
		System.out.print("preorder2: ");
		System.out.println(list);

		list.clear();
		inOrderTraversal(t1, list);
		System.out.print("inorder: ");
		System.out.println(list);
		list.clear();
		inOrderTraversal2(t1, list);
		System.out.print("inorder2: ");
		System.out.println(list);

		list.clear();
		postOrderTraversal(t1, list);
		System.out.print("postorder: ");
		System.out.println(list);
		list.clear();
		postOrderTraversal2(t1, list);
		System.out.print("postorder2: ");
		System.out.println(list);

		list.clear();
		widthFirstTraversal(t1, list);
		System.out.print("widthfirstorder: ");
		System.out.println(list);
		list.clear();
		widthFirstTraversal2(t1, list);
		System.out.print("widthfirstorder2: ");
		System.out.println(list);
	}
}
