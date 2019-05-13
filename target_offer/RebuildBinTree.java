
public class RebuildBinTree {

	/**
	 * 问题：给出前序和中序遍历结果，恢复二叉树
	 * 思路：从前序遍历中，第一个元素就是root，有个root以后，从中序遍历里能够知道左子树和右子树的成员，然后就可以对左子树和右子树分别使用递归，创建左右子树，并返回子树的
	 * 根节点，直到递归结束，根节点就是整棵树的根。
	 * @param proArray
	 * @param inArray
	 * @param proLeft
	 * @param proRight
	 * @param inLeft
	 * @param inRight
	 * @return
	 */
	public static TreeNode makeUpBinTree(int[] proArray, int[] inArray, int proLeft, int proRight, int inLeft,
			int inRight) {
		TreeNode root = new TreeNode(proArray[proLeft]);
		int rootIndexOfInorderArray = getRootIndex(inArray, inLeft, inRight, root.val);
		int leftNum = rootIndexOfInorderArray - inLeft;
		int rightNum = inRight - rootIndexOfInorderArray;
		if (rootIndexOfInorderArray > inLeft) {
			root.left = makeUpBinTree(proArray, inArray, proLeft + 1, proLeft + leftNum, inLeft, inLeft + leftNum - 1);
		}
		if (rootIndexOfInorderArray < inRight) {
			root.right = makeUpBinTree(proArray, inArray, proRight - rightNum + 1, proRight,
					rootIndexOfInorderArray + 1, inRight);
		}

		return root;
	}

	public static int getRootIndex(int[] inArray, int inLeft, int inRight, int rootV) {
		for (int i = inLeft; i <= inRight; i++) {
			if (inArray[i] == rootV) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] proArray = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] inArray = { 4, 7, 2, 1, 5, 3, 8, 6 };
		TreeNode ret = makeUpBinTree(proArray, inArray, 0, proArray.length - 1, 0, inArray.length - 1);
	}

}
