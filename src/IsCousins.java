
public class IsCousins {
	
	/***
	 * 递归遍历二叉树，一次遍历，同时找到x和y的深度，并且排除x和y同根的情况，并且因为题目的特殊性，如果根节点是其中一个，那肯定不满足条件，做剪枝处理。
	 * 当x和y的深度都探测到以后，就停止递归，返回。
	 * @param root
	 * @param x
	 * @param y
	 * @param deeps
	 * @param curDeep
	 */
	
	private static void getDeep(ICTreeNode root, int x, int y, int[] deeps, int curDeep) {
		if (deeps[0] == -2 || (deeps[0] > 0 && deeps[1] > 0)) return;
		if ( root.left != null && root.right != null && ((root.left.val == x && root.right.val == y)
				|| (root.left.val == y && root.right.val == x))) {
			deeps[0] = -2;
			return;
		}
		if ((root.left != null && root.left.val == x)
				|| (root.right != null && root.right.val == x)) {
			deeps[0] = curDeep + 1;
		}else if ((root.left != null && root.left.val == y)
				|| (root.right != null && root.right.val == y)) {
			deeps[1] = curDeep + 1;
		}
		if (root.left != null) {
			getDeep(root.left, x, y, deeps, curDeep+1);
		}
		if (deeps[0] == -2 || (deeps[0] > 0 && deeps[1] > 0)) return;
		if (root.right != null) {
			getDeep(root.right, x, y, deeps, curDeep+1);
		}
	}

	public static boolean isCousins(ICTreeNode root, int x, int y) {
		if (root == null || root.val == x || root.val == y) {
			return false;
		}
		int[] deeps = new int[2];
		deeps[0] = 0;
		deeps[1] = 0;
        getDeep(root, x, y, deeps, 0);
        if (deeps[0] == -2) {
        	return false;
        }
        if (deeps[0] == deeps[1]) {
        	return true;
        }
        return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ICTreeNode t1 = new ICTreeNode(1);
        ICTreeNode t2 = new ICTreeNode(2);
        ICTreeNode t3 = new ICTreeNode(3);
        ICTreeNode t4 = new ICTreeNode(4);
        ICTreeNode t5 = new ICTreeNode(5);
        t2.right = t4;
//        t3.right = t5;
        t1.left = t2;
        t1.right = t3;
        System.out.println(isCousins(t1, 2, 3));
	}

}


class ICTreeNode {
	int val;
	ICTreeNode left;
	ICTreeNode right;

	ICTreeNode(int x) {
		val = x;
	}
}