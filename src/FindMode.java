import java.util.ArrayList;
import java.util.HashMap;

public class FindMode {
//	private HashMap<Integer, Integer> hashMap = new HashMap<>();
//	private ArrayList<Integer> list = new ArrayList<>();
//	private int max = 0;
//
//	public int[] findMode(TreeNode root) {
//		if (root == null)
//			return new int[] {};
//		traversing(root);
//
//		int[] ret = new int[list.size()];
//		for (int i = 0; i < list.size(); i++) {
//			ret[i] = list.get(i);
//		}
//		return ret;
//	}
//
//	private void putHashMap(int val) {
//		int v = 0;
//		if (hashMap.containsKey(val)) {
//			v = hashMap.get(val) + 1;
//			hashMap.put(val, v);
//		} else {
//			hashMap.put(val, 1);
//			v = 1;
//		}
//		if (v > max) {
//			max = v;
//			list.clear();
//			list.add(val);
//		} else if (v == max) {
//			list.add(val);
//		}
//	}
//
//	private void traversing(TreeNode root) {
//		if (root == null)
//			return;
//		putHashMap(root.val);
//		if (root.left != null) {
//			traversing(root.left);
//		}
//		if (root.right != null) {
//			traversing(root.right);
//		}
//	} 
	
	ArrayList<Integer> list2 = new ArrayList<>();
	ArrayList<Integer> retList = new ArrayList<>();
	int max2 = 0;
	
	public int[] findMode(TreeNode root) {
		if (root == null) return new int[] {};
		traversing(root);
		if (list2.size() > max2) {
			max2 = list2.size();
			retList.clear();
			retList.add(list2.get(list2.size()-1));
		}else if (list2.size() == max2){
			retList.add(list2.get(list2.size()-1));
		}
		int[] ret = new int[retList.size()];
		for (int i = 0; i < retList.size(); i++) {
			ret[i] = retList.get(i);
		}
		return ret;
	}
	
	private void traversing(TreeNode root) {
		if (root.left != null) {
			traversing(root.left);
		}
		if (list2.size() == 0) {
			list2.add(root.val);
		}else {
			if (list2.get(list2.size()-1) == root.val) {
				list2.add(root.val);
			}else {
				if (list2.size() > max2) {
					max2 = list2.size();
					retList.clear();
					retList.add(list2.get(list2.size()-1));
				}else if (list2.size() == max2){
					retList.add(list2.get(list2.size()-1));
				}
				list2.clear();
				list2.add(root.val);
			}
		}
		if (root.right != null) {
			traversing(root.right);
		}
	}
	

	public static void main(String[] args) {
		TreeNode t = TreeUtils.makeUpATree(new Integer[] { 2,2,3,2,2,3,3 });
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t22 = new TreeNode(2);
		t1.right = t2;
		t2.left = t22;
		FindMode fm = new FindMode();
		Utils.printArray(fm.findMode(t));
	}

}
