
public class LowestCommonAncestor {
	
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val == p.val 
        		|| root.val == q.val
        		|| (root.val < p.val && root.val > q.val) || (root.val > p.val && root.val < q.val)) {
        	return root;
        }
        if (root.val > p.val && root.val > q.val && root.left != null) {
        	return lowestCommonAncestor(root.left, p, q);
        }
        if (root.val < p.val && root.val < q.val && root.right != null) {
        	return lowestCommonAncestor(root.right, p, q);
        }
        return null;
        

    }	

	public static void main(String[] args) {
        TreeNode t = TreeUtils.makeUpATree(new Integer[]{6,2,8,0,4,7,9,null,null,3,5});
        LowestCommonAncestor l = new LowestCommonAncestor();
        System.out.println(l.lowestCommonAncestor(t, new TreeNode(2), new TreeNode(8)).val);
        System.out.println(l.lowestCommonAncestor(t, new TreeNode(2), new TreeNode(4)).val);
	}

}
