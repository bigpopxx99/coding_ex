import java.security.KeyStore.PrivateKeyEntry;
import java.util.ArrayList;

import javax.tools.Tool;

public class MaxHEAP {

	private static void makeMaxHeap(MyTreeNode[] root, int parent) {
		MyTreeNode pNode = root[parent];
		if (pNode == null || (pNode.left == null && pNode.right == null)) {
			return;
		}
		if (pNode.left == null) {
			if (pNode.val < pNode.right.val) {
				int tmp = pNode.val;
				pNode.val = pNode.right.val;
				pNode.right.val = tmp;
				// 换完以后，要再以新的右子节点为父节点做一次最大堆操作
				makeMaxHeap(root, parent * 2 + 2);
			}
		} else if (pNode.right == null) {
			if (pNode.val < pNode.left.val) {
				int tmp = pNode.val;
				pNode.val = pNode.left.val;
				pNode.left.val = tmp;
				// 换完以后，要再以新的左子节点为父节点做一次最大堆操作
				makeMaxHeap(root, parent * 2 + 1);
			}
		} else {
			// 左右节点都不为空
			if (pNode.left.val > pNode.val && pNode.left.val > pNode.right.val) {
				// 左节点最大
				int tmp = pNode.val;
				pNode.val = pNode.left.val;
				pNode.left.val = tmp;
				// 换完以后，要再以新的左子节点为父节点做一次最大堆操作
				makeMaxHeap(root, parent * 2 + 1);
			} else if (pNode.right.val > pNode.val && pNode.right.val > pNode.left.val) {
				int tmp = pNode.val;
				pNode.val = pNode.right.val;
				pNode.right.val = tmp;
				// 换完以后，要再以新的右子节点为父节点做一次最大堆操作
				makeMaxHeap(root, parent * 2 + 2);
			}
		}
	}

	private static MyTreeNode[] insertNode(MyTreeNode[] root, MyTreeNode newNode) {
		MyTreeNode[] newArray = new MyTreeNode[root.length+1];
		for (int i=0; i<root.length; i++) {
			newArray[i] = root[i];
		}
		newArray[newArray.length-1] = newNode;
		root = newArray;
		int insertIndex = root.length - 1 + 1;
		int parentIndex = insertIndex / 2 - 1;
		if (root[parentIndex].val >= newNode.val) {
			if (root[parentIndex].left != null) {
				root[parentIndex].right = newNode;
			}else {
				root[parentIndex].left = newNode;
			}
		}else {
			if (root[parentIndex].left != null) {
				int tmp = root[parentIndex].val;
				root[parentIndex].val = newNode.val;
				root[parentIndex].right = newNode;
				newNode.val = tmp;
				sortUp(root, parentIndex);
				
			}else {
				root[parentIndex].left = newNode;
				int tmp = root[parentIndex].val;
				root[parentIndex].val = newNode.val;
				newNode.val = tmp;
				sortUp(root, parentIndex);
			}
		}
		return root;
	}
	
	private static void deleteNode(MyTreeNode[] root, int index) {
		if (root[index].left == null && root[index].right == null) {
			int parent = (index+1)/2 -1;
			if (parent*2+1 == index) {
				//左
				if (root[parent].right != null) {
					root[parent].left.val = root[parent].right.val;
					root[parent].right.val = 0;
					root[parent].right = null;
				}else {
					root[parent].val = root[parent].left.val;
					root[parent].left.val = 0;
					root[parent].left = null;
				}
			}else {
				root[parent].right.val = 0;
				root[parent].right = null;
			}
			return;
		}
		if (root[index].right != null) {
			if (root[index].left.val >= root[index].right.val) {
				root[index].val = root[index].left.val;
				deleteNode(root, index*2+1);
			}else {
				root[index].val = root[index].right.val;
				deleteNode(root, index*2+2);
			}
		}else {
			root[index].val = root[index].left.val;
			root[index].left.val = 0;
			root[index].left = null;
		}
		
	}
	
	public static void sortUp(MyTreeNode[] root, int index) {
		int pIndex = (index+1)/2-1;
		if (pIndex < 0) {
			return;
		}
		if (root[pIndex].val < root[index].val) {
			int tmp = root[pIndex].val;
			root[pIndex].val = root[index].val;
			root[index].val = tmp;
			sortUp(root, pIndex);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
		MyTreeNode[] nodes = new MyTreeNode[t.length];

		for (int i = 0; i < t.length; i++) {
			MyTreeNode oNode = new MyTreeNode(t[i]);
			nodes[i] = oNode;
		}
		int cIndex = 1;
		int pIndex = 0;
		while (cIndex < t.length) {
			nodes[pIndex].left = nodes[cIndex];
			cIndex++;
			if (cIndex < t.length) {
				nodes[pIndex].right = nodes[cIndex];
			}
			cIndex++;
			pIndex++;
		}

		ArrayList<Integer> list = new ArrayList<>();
		MyTree.widthFirstTraversal(nodes[0], list);
		System.out.println(list);

		int lastParentIndex = (t.length) / 2 - 1;
		for (int i = lastParentIndex; i >= 0; i--) {
			makeMaxHeap(nodes, i);
			list.clear();
			MyTree.widthFirstTraversal(nodes[0], list);
//			System.out.println(list);
		}

		list.clear();
		System.out.println("after max heap process");
		MyTree.widthFirstTraversal(nodes[0], list);
		System.out.println(list);
		
		list.clear();
		MyTreeNode newNode = new MyTreeNode(100);
		MyTreeNode[] newArray = insertNode(nodes, newNode);
		MyTree.widthFirstTraversal(nodes[0], list);
		System.out.println(list);
		
		list.clear();
		deleteNode(newArray, 0);
		MyTree.widthFirstTraversal(newArray[0], list);
		System.out.println(list);
	}

}
