
public class SearchBst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(4);
		TreeNode node21 = new TreeNode(2);
		TreeNode node22 = new TreeNode(7);
		TreeNode node31 = new TreeNode(1);
		TreeNode node32 = new TreeNode(3);
		node21.left = node31;
		node21.right = node32;
		root.left = node21;
		root.right = node22;
		SolutionSearchBst solutionSearchBst = new SolutionSearchBst();
		TreeNode ret = solutionSearchBst.searchBST(root, 2);
		System.out.println(ret.val);
		System.out.println(ret.left.val);
		System.out.println(ret.right.val);
		
		TreeNode ret2 = solutionSearchBst.searchBST(root,  5);
		System.out.println(ret2);

	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

class SolutionSearchBst {
	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null) {
			return root;
		}
		if (root.val == val) return root;
		if (root.left != null) {
			TreeNode ret_left = searchBST(root.left, val);
			if (ret_left != null) {
				return ret_left;
			}
		}
		if (root.right != null) {
			TreeNode ret_right = searchBST(root.right, val);
			if (ret_right != null) {
				return ret_right;
			}
		}
		return null;
	}
}
