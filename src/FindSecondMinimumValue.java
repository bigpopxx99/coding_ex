import java.util.Stack;

public class FindSecondMinimumValue {
	public int findSecondMinimumValue(TreeNode root) {
		if (root == null ) {
			return -1;
		}
		int ret = travering(root);
		return ret != root.val ? ret : -1;
	}

	public int travering(TreeNode root) {
		if (root.left == null) {
			return root.val;
		}
        int lv = root.left.val;
        int rv = root.right.val;
		if (root.left.val == root.val) {
			lv = travering(root.left);
		}
		if (root.right.val == root.val){
			rv = travering(root.right);
		}
		if (lv > rv) {
			if (rv != root.val) {
				return rv;
			}else {
				return lv;
			}
		}else if (lv < rv) {
			if (lv != root.val) {
				return lv;
			}else {
				return rv;
			}
		}else {
			if (lv != root.val) {
				return lv;
			}else {
				return root.val;
			}
		}
	}

	public static void main(String[] args) {
		TreeNode t = TreeUtils.makeUpATree(new Integer[] { 1,1,2,1,1,2,2 });
		TreeNode t1 = TreeUtils.makeUpATree(new Integer[] { 1,1,3,1,1,3,4,3,1,1,1,3,8,4,8,3,3,1,6,2,1 });
		TreeNode t2 = TreeUtils.makeUpATree(new Integer[] { });
		FindSecondMinimumValue f = new FindSecondMinimumValue();
		System.out.println(f.findSecondMinimumValue(t));
		System.out.println(f.findSecondMinimumValue(t1));
		System.out.println(f.findSecondMinimumValue(t2));
	}

}