
public class FindTilt {

	public int findTilt(TreeNode root) {
		if (root == null) {
			return 0;
		}
		getSum(root);
		return findTiltAfterSum(root);
	}

	public int findTiltAfterSum(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int sum = 0;
		int leftValue = 0;
		int rightValue = 0;
		if (root.left != null) {
			leftValue = root.left.val;
		}
		if (root.right != null) {
			rightValue = root.right.val;
		}
		sum += Math.abs(leftValue - rightValue);
		if (root.left != null) {
			sum += findTiltAfterSum(root.left);
		}
		if (root.right != null) {
			sum += findTiltAfterSum(root.right);
		}
		return sum;
	}

	public int getSum(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int sum = root.val;
		if (root.left != null) {
			sum += getSum(root.left);
		}
		if (root.right != null) {
			sum += getSum(root.right);
		}
		root.val = sum;
		return sum;
	}

	/**
	 * 后序遍历
	 * 
	 * @param root
	 * @return
	 */
	public int findTilt2(TreeNode root) {
		int[] diffSum = {0};
		traversing(root, diffSum);
		return diffSum[0];
	}
	public int traversing(TreeNode root, int[] diffSum) {
		if (root == null) {
			return 0;
		}
		int leftSum = 0;
		int rightSum = 0;
		if (root.left != null) {
			leftSum += traversing(root.left, diffSum);
		}
		if (root.right != null) {
			rightSum += traversing(root.right, diffSum);
		}
		diffSum[0] += Math.abs(leftSum - rightSum);
		root.val += leftSum + rightSum;
		return root.val;
	}

	public static void main(String[] args) {
		TreeNode head = TreeUtils.makeUpATree(new Integer[] {1,2,3,4,5});
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		t1.left = t2;
		t2.left = t3;
		t3.right = t4;
		t4.right = t5;

		FindTilt f = new FindTilt();
//		System.out.println(f.findTilt(t1));
		System.out.println(f.findTilt2(head));
		System.out.println(f.findTilt2(t1));
	}

}
