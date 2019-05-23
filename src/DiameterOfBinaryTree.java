
public class DiameterOfBinaryTree {
	
	public int diameterOfBinaryTree(TreeNode root) {
		int[] maxSum = {0};
		countNode(root, maxSum);
		return maxSum[0];
	}
	
    public void countNode(TreeNode root, int[] maxSum) {
    	if (root == null) {
    		return;
    	}
    	int maxV = 0;
    	int[] maxLayers = {1};
    	int left = 0;
    	int right = 0;
    	if (root.left != null) {
    		getLayers(root.left, 1, maxLayers);
    		left = maxLayers[0];
    	}
    	maxLayers[0] = 1;
    	if (root.right != null) {
    		getLayers(root.right, 1, maxLayers);
    		right = maxLayers[0];
    	}
    	maxV = left + right;
    	if (maxSum[0] < maxV) {
    		maxSum[0] = maxV;
    	}
    	if (root.left != null) {
    		countNode(root.left, maxSum);
    	}
    	if (root.right != null) {
    		countNode(root.right, maxSum);
    	}
    }
    
    private void getLayers(TreeNode root, int curLayer, int[] maxLayers) {
    	if (curLayer > maxLayers[0]) {
    		maxLayers[0] = curLayer;
    	}
    	if (root.left != null) {
    		getLayers(root.left, curLayer+1, maxLayers);
    	}
    	if (root.right != null) {
    		getLayers(root.right, curLayer+1, maxLayers);
    	}
    }
    
    int max = 0;
    
    public int diameterOfBinaryTree2(TreeNode root) {
        maxDepth(root);
        return max;
    }
    
    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        max = Math.max(max, left + right);
        
        return Math.max(left, right) + 1;
    }
    
    

	public static void main(String[] args) {
		TreeNode t1 = TreeUtils.makeUpATree(new Integer[]{1,2,3,4,5});
		DiameterOfBinaryTree d = new DiameterOfBinaryTree();
		System.out.println(d.diameterOfBinaryTree2(t1));
	}

}
