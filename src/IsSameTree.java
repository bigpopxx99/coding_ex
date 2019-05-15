
public class IsSameTree {
	
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null)) {
        	return false;
        }
        if (p == null && q == null) {
        	return true;
        }
        if (p.val != q.val) {
        	return false;
        }
        if ((p.left != null && q.left == null) || (p.left == null && q.left != null)) {
        	return false;
        }
        if ((p.right != null && q.right == null) || (p.right == null && q.right != null)) {
        	return false;
        }
        boolean leftComp = isSameTree(p.left, q.left);
        boolean rightComp = isSameTree(p.right, q.right);
        
        return leftComp && rightComp;

    }

	public static void main(String[] args) {
        TreeNode p1 = new TreeNode(1);
        TreeNode p2 = new TreeNode(2);
        TreeNode p3 = new TreeNode(3);
        p1.left = p2;
        p1.right = p3;
        
        TreeNode q1 = new TreeNode(1);
        TreeNode q2 = new TreeNode(2);
        TreeNode q3 = new TreeNode(3);
        q1.left = q2;
        q1.right = q3;
        
        System.out.println(isSameTree(p1, q1));
        
	}

}
