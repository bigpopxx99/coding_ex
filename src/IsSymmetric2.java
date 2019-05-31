import java.util.ArrayList;
import java.util.Stack;

public class IsSymmetric2 {
	ArrayList<Integer> mList = new ArrayList<>();
	ArrayList<Integer> mListL = new ArrayList<>();
	ArrayList<Integer> mListR = new ArrayList<>();

	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}
		makeIterative(root);
		int lp = 0;
		int rp = mList.size() - 1;
		while (lp < rp) {
			if (mList.get(lp) != mList.get(rp)) {
				return false;
			}
			lp++;
			rp--;
		}
		checkSharpLeft(root);
		checkSharpRight(root);
		if (mListL.size() != mListR.size()) {
			return false;
		}
		return true;
	}

	private void makeIterative(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode current = root;
		while(current != null || !stack.isEmpty()) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			}else {
				current = stack.pop();
				mList.add(current.val);
				current = current.right;
			}
		}
	}
	
	private void checkSharpLeft(TreeNode root) {
		TreeNode current = root;
		while (current != null) {
			mListL.add(current.val);
			current = current.left;
		}
	}
	
	private void checkSharpRight(TreeNode root) {
		TreeNode current = root;
		while (current != null) {
			mListR.add(current.val);
			current = current.right;
		}
	}

	public static void main(String[] args) {
		IsSymmetric2 i = new IsSymmetric2();
		TreeNode t = TreeUtils.makeUpATree(new Integer[] {1,2,2,3,4,4,3});
		TreeNode t1 = TreeUtils.makeUpATree(new Integer[] {5,4,1,null,1,null,4,2,null,2,null});
		System.out.println(i.isSymmetric(t));
		System.out.println(i.isSymmetric(t1));
	}

}
