public class SumRootToLeaf {

	// public static int sumRootToLeaf(TreeNode root) {
	// StringBuffer sBuffer = new StringBuffer();
	// int[] result = { 0 };
	// travering(root, sBuffer, result);
	// return result[0];
	// }

	// public static void travering(TreeNode root, StringBuffer sBuffer, int[]
	// result) {
	// if (root == null)
	// return;
	// sBuffer.append(root.val);
	// if (root.left == null && root.right == null) {
	// result[0] += binStrToInt(sBuffer.toString());
	// } else {
	// if (root.left != null) {
	// travering(root.left, sBuffer, result);
	// }
	// if (root.right != null) {
	// travering(root.right, sBuffer, result);
	// }
	// }
	// sBuffer.deleteCharAt(sBuffer.length() - 1);
	// }
	//
	// public static int binStrToInt(String binStr) {
	// int ret = 0;
	// for (int i = binStr.length() - 1; i >= 0; i--) {
	// ret += Integer.parseInt(binStr.substring(i, i + 1)) * Math.pow(2,
	// binStr.length() - i - 1);
	// }
	// return ret;
	// }

	public static int sumRootToLeaf(TreeNode root) {
		int[] total = { 0 };
		int oneTerm = 0;
		travering(root, oneTerm, total);
		return total[0];
	}

	public static void travering(TreeNode root, int oneTerm, int[] total) {
		if (root == null)
			return;
		int cur = oneTerm * 2 + root.val;
		if (root.left == null && root.right == null) {
			total[0] = total[0] + cur;
			return;
		}
		if (root.left != null) {
			travering(root.left, cur, total);
		}
		if (root.right != null) {
			travering(root.right, cur, total);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t1 = new TreeNode(1);
		TreeNode t21 = new TreeNode(0);
		TreeNode t22 = new TreeNode(1);
		TreeNode t31 = new TreeNode(0);
		TreeNode t32 = new TreeNode(1);
		TreeNode t33 = new TreeNode(0);
		TreeNode t34 = new TreeNode(1);
		t1.left = t21;
		t1.right = t22;
		t21.left = t31;
		t21.right = t32;
		t22.left = t33;
		t22.right = t34;

		System.out.println(sumRootToLeaf(t1));
	}

}
