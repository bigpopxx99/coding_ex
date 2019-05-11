import java.util.ArrayList;

public class BST {

	// 删除某一个节点
	private static MyTreeNode deleteBST(MyTreeNode root, int val) {
		if (root == null) {
			return null;
		}
		if (root.val == val) {
			if (root.left != null && root.right != null) {
				// 左右子树都存在，则把当前节点换成右子树最小值，然后删除右子树最小值
				MyTreeNode minNode = searchMinBST(root.right);
				root.val = minNode.val;
				root.right = deleteBST(root.right, minNode.val);
			} else if (root.left == null && root.right == null) {
				// 叶节点，直接删掉
				return null;
			} else {
				if (root.left != null) {
					// 只有左子树，把根节点设置到左子树
					root = root.left;
				} else {
					// 只有右子树，把根节点设置到右子树
					root = root.right;
				}
			}
		} else if (root.val > val) {
			// 在左子树中寻找
			root.left = deleteBST(root.left, val);
		} else {
			// 在右子树中寻找
			root.right = deleteBST(root.right, val);
		}
		return root;
	}


	// 找到二叉搜索树中的最小值
	private static MyTreeNode searchMinBST(MyTreeNode root) {
		if (root == null) {
			return null;
		}
		if (root.left != null) {
			return searchMinBST(root.left);
		} else {
			return root;
		}
	}

	private static MyTreeNode searchBST(MyTreeNode root, int val) {
		if (root == null) {
			return null;
		}
		if (val < root.val) {
			return searchBST(root.left, val);
		} else if (val > root.val) {
			return searchBST(root.right, val);
		} else {
			return root;
		}
	}

	// 递归在二叉搜索树中插入一个值
	private static void insertBST(MyTreeNode root, int val) {
		if (root == null) {
			MyTreeNode newNode = new MyTreeNode(val);
			root = newNode;
			return;
		}
		if (root.val < val) {
			if (root.right != null) {
				// 插入一个比根节点大的值，递归添加到右子树
				insertBST(root.right, val);
			} else {
				MyTreeNode newNode = new MyTreeNode(val);
				root.right = newNode;
			}
		} else if (root.val > val) {
			if (root.left != null) {
				// 插入一个比根节点小的值，递归添加到左子树
				insertBST(root.left, val);
			} else {
				MyTreeNode newNode = new MyTreeNode(val);
				root.left = newNode;
			}
		} else {
			// 对于搜索二叉树，不应该有相同的值，抛弃处理
			return;
		}
	}

	// 建立二叉搜索树
	private static void makeUpBST(MyTreeNode root, int[] vals) {
		for (int i = 0; i < vals.length; i++) {
			insertBST(root, vals[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] seed = { 63, 55, 90, 42, 58, 70, 10, 45, 67, 83 };
		MyTreeNode root = new MyTreeNode(seed[0]);
		makeUpBST(root, seed);
		ArrayList<Integer> list = new ArrayList<>();
		MyTree.inOrderTraversal(root, list);
		System.out.println(list);
		System.out.println("min:"+searchMinBST(root).val);
		deleteBST(root, 63);
		list.clear();
		MyTree.inOrderTraversal(root, list);
		System.out.println(list);
	}

}
