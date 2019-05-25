import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

	public List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new ArrayList<>();
		if (root != null) {
			travering(root, list, "");
		}
		return list;
	}

	private void travering(TreeNode root, List<String> list, String curMap) {
		if (root == null) {
			return;
		}
		if (curMap != null && curMap.length() == 0) {
			curMap = "" + root.val;
		} else {
			curMap = curMap + "->" + root.val;
		}
		if (root.left == null && root.right == null) {
			// it's leaf
			list.add(curMap);
		}
		if (root.left != null) {
			travering(root.left, list, curMap);
		}
		if (root.right != null) {
			travering(root.right, list, curMap);
		}
	}

	public static void main(String[] args) {
		BinaryTreePaths b = new BinaryTreePaths();
		TreeNode t = TreeUtils.makeUpATree(new Integer[] {});
		Utils.printList(b.binaryTreePaths(t));
	}

}
