import java.util.ArrayList;
import java.util.List;

public class LevelOrderBottom {
	
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	if (root == null) {
    		List<List<Integer>> ret = new ArrayList<>();
    		return ret;
    	}
        List<List<TreeNode>> nodeLists = new ArrayList<>();
        List<TreeNode> nodeList = new ArrayList<>();
        nodeList.add(root);
        nodeLists.add(nodeList);
        List<List<Integer>> retNodeLists = new ArrayList<>();
        List<Integer> retNodeList = new ArrayList<>();
        retNodeList.add(root.val);
        retNodeLists.add(retNodeList);
        boolean hasLeaf = true;
        while (hasLeaf) {
        	hasLeaf = false;
        	List<TreeNode> head = nodeLists.get(0);
        	List<TreeNode> newNodeList = new ArrayList<>();
        	List<Integer> newRetNodeList = new ArrayList<>();
        	for (int i=0; i<head.size(); i++) {
        		if (head.get(i).left != null) {
        			TreeNode leftNode = head.get(i).left;
        			newNodeList.add(leftNode);
        			newRetNodeList.add(leftNode.val);
        		}
        		if (head.get(i).right != null) {
        			TreeNode rightNode = head.get(i).right;
        			newNodeList.add(rightNode);
        			newRetNodeList.add(rightNode.val);
        		}
        	}
        	if (newNodeList.size() > 0) {
        		hasLeaf = true;
        		nodeLists.add(0, newNodeList);
        		retNodeLists.add(0, newRetNodeList);
        	}
        }
        return retNodeLists;
        
    }

	public static void main(String[] args) {
		TreeNode t = TreeUtils.makeUpATree(new Integer[] {3,9,20,null,null,15,7});
		LevelOrderBottom l = new LevelOrderBottom();
        List<List<Integer>> ret = l.levelOrderBottom(t);
	}

}
