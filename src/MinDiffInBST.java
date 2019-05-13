
public class MinDiffInBST {

	public static int minDiffInBST(TreeNode root) {
		int[] array = { 0, -1 };
		travering(root, array); // array[0] stores last number, array[1] stores min diff
		return array[1];
	}

	public static void travering(TreeNode root, int[] array) {
		// 中序遍历BST，如果遇到需要写入的值，则判断这个值和上一个值的差，如果最小，记录，然后把自己存起来，用来和下一个数字比较，
		// 时间复杂度就是遍历BST的时间
		if (root.left != null) {
			travering(root.left, array);
		}
		if (array[1] == -1) {
			array[0] = root.val;
			array[1] = Integer.MAX_VALUE;
		} else {
			int diff = Math.abs(root.val - array[0]);
			if (diff < array[1]) {
				array[1] = diff;
			}
			array[0] = root.val;
		}
		if (root.right != null) {
			travering(root.right, array);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t = { 61, 50, 80, 20, 60 };
		TreeNode root = TreeUtils.makeUpATree(t);
		System.out.println(minDiffInBST(root));
	}

}
