
public class IsSubtree {
	
	
	
    public boolean isSubtree(TreeNode s, TreeNode t) {
        boolean ret = isTreeSame(s, t);
        if (ret) return true;
        if (s.left != null) {
        	boolean retL =isSubtree(s.left, t);
        	if (retL) return true;
        }
        if (s.right != null) {
        	boolean retR = isSubtree(s.right, t);
        	if (retR) return true;
        }
        return false;       
    }
    
    private boolean isTreeSame(TreeNode s, TreeNode t) {
    	if (s == null && t == null) {
    		return true;
    	}
    	if (s == null && t != null) {
    		return false;
    	}
    	if (s != null && t == null) {
    		return false;
    	}
    	if (s.val != t.val) {
    		return false;
    	}
    	boolean left = isTreeSame(s.left, t.left);
    	boolean right = isTreeSame(s.right, t.right);
    	return left && right;
    }

	public static void main(String[] args) {
        TreeNode s = TreeUtils.makeUpATree(new Integer[] {3,4,5,1,2});
        TreeNode a = new TreeNode(0);
//        s.left.right.left = a;
        TreeNode t = TreeUtils.makeUpATree(new Integer[] {4,1,2});
        IsSubtree is = new IsSubtree();
        System.out.println(is.isSubtree(s, t));
	}

}
