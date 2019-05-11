import java.util.ArrayList;

public class TreeUtils {

	public static TreeNode makeUpATree(int[] nodes) {
		if (nodes == null || nodes.length == 0) {
			return null;
		}
		ArrayList<TreeNode> list = new ArrayList<>();
		int pIndex = 0;
		TreeNode root = new TreeNode(nodes[0]);
		list.add(root);
		int lastPIndex = (nodes.length) / 2 - 1;
		while (pIndex <= lastPIndex) {
			TreeNode lNode = new TreeNode(nodes[pIndex * 2 + 1]);
			list.add(lNode);
			list.get(pIndex).left = lNode;
			if (pIndex * 2 + 2 < nodes.length) {
				TreeNode rNode = new TreeNode(nodes[pIndex * 2 + 2]);
				list.add(rNode);
				list.get(pIndex).right = rNode;
			}
			pIndex++;
		}

		return root;
	}

}
