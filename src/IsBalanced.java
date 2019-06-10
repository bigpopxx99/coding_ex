
public class IsBalanced {

	public boolean isBalanced(TreeNode root) {
		if (root == null || (root.left == null && root.right == null)) {
			return true;
		}
		boolean r = checkOne(root);
		if (!r) return false;
		boolean left  = true;
		boolean right = true;
		if (root.left != null) {
			left = isBalanced(root.left);
			if (!left) return false;
		}
		if (root.right != null) {
			right = isBalanced(root.right);
			if (!right) return false;
		}
		return true;
	}
	
	private boolean checkOne(TreeNode root) {
		if (root == null || (root.left == null && root.right == null)) {
			return true;
		}
		int left = 0;
		int right = 0;
        if (root.left != null) {
        	left = getLayer(root.left, 1);
        }
        if (root.right != null) {
        	right = getLayer(root.right, 1);
        }
        return Math.abs(left-right) <= 1;
	}

	private int getLayer(TreeNode root, int curLayer) {
		if (root.left == null && root.right == null) {
			return curLayer;
		}
		int leftMax = 0;
		int rightMax = 0;
		if (root.left != null) {
			leftMax = getLayer(root.left, curLayer + 1);
		}
		if (root.right != null) {
			rightMax = getLayer(root.right, curLayer + 1);
		}
		return Math.max(leftMax, rightMax);
	}

	public static void main(String[] args) {
		TreeNode t = TreeUtils.makeUpATree(new Integer[] {3,9,20,null,null,15,7});
		IsBalanced ib = new IsBalanced();
        System.out.println(ib.isBalanced(t));
        
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t22 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t33 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t44 = new TreeNode(4);
        t1.left = t2;
        t1.right = t22;
        t2.left = t3;
        t2.right = t33;
        t3.left = t4;
        t3.right = t44;
        System.out.println(ib.isBalanced(t1));
        
	}

}
