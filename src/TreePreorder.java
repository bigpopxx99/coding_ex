//import java.util.ArrayList;
//import java.util.List;
//
//public class TreePreorder {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<Node> lv3List = new ArrayList<Node>();
//		lv3List.add(new Node(5, null));
//		lv3List.add(new Node(6, null));
//		List<Node> lv2List = new ArrayList<Node>();
//		lv2List.add(new Node(3, lv3List));
//		lv2List.add(new Node(2, null));
//		lv2List.add(new Node(4, null));
//		Node rootNode = new Node(1, lv2List);
//		
//        SolutionTreePreorder solutionTreePreorder = new SolutionTreePreorder();
//        List<Integer> ret = solutionTreePreorder.preorder(null);
//        System.out.println(ret);
//	}
//
//}
//
//// Definition for a Node.
//class Node {
//	public int val;
//	public List<Node> children;
//
//	public Node() {
//	}
//
//	public Node(int _val, List<Node> _children) {
//		val = _val;
//		children = _children;
//	}
//};
//
//class SolutionTreePreorder {
//	public List<Integer> preorder(Node root) {
//		List<Integer> retList = new ArrayList<>();
//		if (root == null) {
//			return retList;
//		}
//		retList.add(root.val);
//        if (root.children != null) {
//        	for (int i=0; i<root.children.size(); i++) {
//        		retList.addAll(preorder(root.children.get(i)));
//        	}
//        }
//        return retList;
//	}
//}
