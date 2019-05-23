import java.util.function.IntPredicate;

public class ConvertBST {
	
    public static TreeNode convertBST(TreeNode root) {
    	int[] lastV = {0};
        travering(root, lastV);
        return root;
    }
    
    public static void travering(TreeNode root, int[] lastV) {
    	if (root == null) return;
    	if (root.right != null) {
    		travering(root.right, lastV);
    	}
    	root.val += lastV[0];
    	lastV[0] = root.val;
    	if (root.left != null) {
    		travering(root.left, lastV);
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer[] seed = {5,2,13,1,4};
        TreeNode root = TreeUtils.makeUpATree(seed);
        TreeNode ret = convertBST(root);
	}

}
