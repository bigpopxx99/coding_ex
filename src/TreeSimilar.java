import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.PrinterLocation;
import javax.swing.RootPaneContainer;

public class TreeSimilar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(2);
        
        System.out.println(leafSimilar(t1, t2));
//		TreeNode root = new TreeNode(3);
//		TreeNode l21 = new TreeNode(5);
//		TreeNode l22 = new TreeNode(1);
//		TreeNode l31 = new TreeNode(6); 
//		TreeNode l32 = new TreeNode(7);
//		TreeNode l33 = new TreeNode(4);
//		TreeNode l34 = new TreeNode(2);
//		TreeNode l41 = new TreeNode(9);
//		TreeNode l42 = new TreeNode(8);
//		l34.left = l41;
//		l34.right = l42;
//		l21.left = l31;
//		l21.right = l32;
//		l22.left = l33;
//		l22.right = l34;
//		root.left = l21;
//		root.right = l22;
//		int[] ret = getLeafList(root, new ArrayList<>());

		
        
	}

	public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		getLeafList(root1, list1);
		getLeafList(root2, list2);
		return list1.equals(list2);
	}
	
	private static void getLeafList(TreeNode root, List<Integer> leafList) {
		if (root.left == null && root.right == null) {
			leafList.add(root.val);
		}
		if (root.left != null) {
			getLeafList(root.left, leafList);
		}
		if (root.right != null) {
			getLeafList(root.right, leafList);
		}
	}

}
