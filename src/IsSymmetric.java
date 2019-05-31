import java.awt.List;
import java.util.ArrayList;

public class IsSymmetric {
	private ArrayList<Integer> mList = new ArrayList<>();
	private ArrayList<Integer> mListSharpL = new ArrayList<>();
	private ArrayList<Integer> mListSharpR = new ArrayList<>();

	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return false;
		}
		makeRecursive(root);
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
		if (mListSharpL.size() != mListSharpR.size()) {
			return false;
		}
		return true;
	}

	private void makeRecursive(TreeNode root) {
		if (root.left == null && root.right == null) {
			mList.add(root.val);
			return;
		}
		if (root.left != null) {
			makeRecursive(root.left);
		}else {
			mList.add(null);
		}
		mList.add(root.val);
		if (root.right != null) {
			makeRecursive(root.right);
		}else {
			mList.add(null);
		}
	}
	
	private void checkSharpLeft(TreeNode root) {
		mListSharpL.add(root.val);
		if (root.left != null) {
			checkSharpLeft(root.left);
		}
	}
	
	private void checkSharpRight(TreeNode root) {
		mListSharpR.add(root.val);
		if (root.right != null) {
			checkSharpRight(root.right);
		}
	}

	public static void main(String[] args) {
		IsSymmetric i = new IsSymmetric();
		TreeNode t = TreeUtils.makeUpATree(new Integer[] {1,2,2,3,4,4,3});
		System.out.println(i.isSymmetric(t));
	}

}
