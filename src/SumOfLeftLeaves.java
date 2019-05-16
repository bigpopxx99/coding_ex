
public class SumOfLeftLeaves {
/**
 * 题目要求left leaves, 不包括又是根节点的左节点 
 * @param root
 * @return
 */
	public static int sumOfLeftLeaves(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int sum = 0;
		if (root.left != null) {
			if (root.left.left == null && root.left.right == null) {
				sum += root.left.val;
			}
			sum += sumOfLeftLeaves(root.left);
		}
		if (root.right != null) {
			sum += sumOfLeftLeaves(root.right);
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t3 = new TreeNode(3);
		TreeNode t9 = new TreeNode(9);
		TreeNode t20 = new TreeNode(20);
		TreeNode t15 = new TreeNode(15);
		TreeNode t7 = new TreeNode(7);

		t3.left = t9;
		t3.right = t20;
		t20.left = t15;
		t20.right = t7;

		System.out.println(sumOfLeftLeaves(t3));
	}

}
