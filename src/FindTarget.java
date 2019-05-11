import java.util.HashSet;

public class FindTarget {

	private static boolean isFind = false;

	private static void goToFind(FTTreeNode root, int k, HashSet<Integer> hashSet) {
		if (isFind)
			return;

		if (hashSet.contains((k - root.val))) {
			isFind = true;
			return;
		} else {
			hashSet.add(root.val);
			if (root.left != null) {
				goToFind(root.left, k, hashSet);
				if (isFind)
					return;
			}
			if (root.right != null) {
				goToFind(root.right, k, hashSet);
				if (isFind)
					return;
			}
		}
	}

	public static boolean findTarget(FTTreeNode root, int k) {
		HashSet<Integer> hashSet = new HashSet<>();
		goToFind(root, k, hashSet);
		return isFind;
	}

	public static void main(String[] args) {
		 FTTreeNode t5 = new FTTreeNode(5);
		 FTTreeNode t3 = new FTTreeNode(3);
		 FTTreeNode t6 = new FTTreeNode(6);
		 FTTreeNode t2 = new FTTreeNode(2);
		 FTTreeNode t4 = new FTTreeNode(4);
		 FTTreeNode t7 = new FTTreeNode(7);
		
		 t5.left = t3;
		 t5.right = t6;
		 t3.left = t2;
		 t3.right = t4;
		 t6.right = t7;
		
		System.out.println(findTarget(t5, 28));

//		FTTreeNode t2 = new FTTreeNode(2);
//		FTTreeNode t0 = new FTTreeNode(0);
//		FTTreeNode t3 = new FTTreeNode(3);
//		FTTreeNode tm4 = new FTTreeNode(-4);
//		FTTreeNode t1 = new FTTreeNode(1);
//
//		t2.left = t0;
//		t2.right = t3;
//		t0.left = tm4;
//		t0.right = t1;
//
//		System.out.println(findTarget(t2, -1));
	}
}

class FTTreeNode {
	int val;
	FTTreeNode left;
	FTTreeNode right;

	FTTreeNode(int x) {
		val = x;
	}
}
