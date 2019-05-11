import java.util.List;
import java.util.Stack;

public class Tree2str {

	public static String tree2str(T2STreeNode t) {
		if (t== null) return "";
		StringBuffer sb = new StringBuffer();
		traversing(t, sb);
		String ret =  sb.toString().replace("()())", ")");
		ret = ret.replace("())", ")");
		return ret.substring(1, ret.length()-1);
	}
	
	public static void traversing(T2STreeNode root, StringBuffer sb) {
		if (root == null) return;
		sb.append("(");
 		sb.append(root.val);
 		if (root.left != null) {
 			traversing(root.left, sb);
 		}else {
 			sb.append("()");
 		}
 		if (root.right != null) {
 			traversing(root.right, sb);
 		}else {
 			sb.append("()");
 		}
 		sb.append(")");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T2STreeNode t1 = new T2STreeNode(1);
		T2STreeNode t2 = new T2STreeNode(2);
		T2STreeNode t3 = new T2STreeNode(3);
		T2STreeNode t4 = new T2STreeNode(4);

		t1.left = t2;
		t1.right = t3;
		t2.right = t4;

		System.out.println(tree2str(t1));

	}

}

class T2STreeNode {
	int val;
	T2STreeNode left;
	T2STreeNode right;

	T2STreeNode(int x) {
		val = x;
	}
}
