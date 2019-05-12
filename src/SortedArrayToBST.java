import java.awt.Insets;

public class SortedArrayToBST {

	public static TreeNode sortedArrayToBST(int[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		int rIndex = nums.length / 2;
		TreeNode root = new TreeNode(nums[rIndex]);
		if (rIndex != 0) {
			insert(nums, root, 0, rIndex - 1);
		}
		if (rIndex != nums.length - 1) {
			insert(nums, root, rIndex + 1, nums.length - 1);
		}
		return root;
	}

	public static void insert(int[] nums, TreeNode root, int left, int right) {

		int mid = (left + right + 1) / 2;
		TreeNode newNode = new TreeNode(nums[mid]);

		if (nums[mid] < root.val) {
			root.left = newNode;
		} else {
			root.right = newNode;
		}

		if (mid != left) {
			insert(nums, newNode, left, mid - 1);
		}
		if (mid != right) {
			insert(nums, newNode, mid + 1, right);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] t = {-10,-3,0,5,9};
        TreeNode ret = sortedArrayToBST(t);
	}

}
