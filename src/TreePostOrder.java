import java.util.ArrayList;
import java.util.List;

public class TreePostOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Node> lv3List = new ArrayList<Node>();
		lv3List.add(new Node(5, null));
		lv3List.add(new Node(6, null));
		List<Node> lv2List = new ArrayList<Node>();
		lv2List.add(new Node(3, lv3List));
		lv2List.add(new Node(2, null));
		lv2List.add(new Node(4, null));
		Node rootNode = new Node(1, lv2List);
		
		SolutionPostOrder solutionPostOrder = new SolutionPostOrder();
        List<Integer> ret = solutionPostOrder.postorder(null);
        System.out.println(ret);
        List<Integer> ret2 = solutionPostOrder.postorder(rootNode);
        System.out.println(ret2);
	}

}

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

class SolutionPostOrder {
    public List<Integer> postorder(Node root) {
    	List<Integer> retList = new ArrayList<>();
        if (root == null) {
        	return retList;
        }
        if (root.children == null) {
        	retList.add(root.val);
        	return retList;
        }else {
        	for (int i=0; i<root.children.size(); i++) {
        		retList.addAll(postorder(root.children.get(i)));
        	}
        	retList.add(root.val);
        	return retList;
        }
    }
}