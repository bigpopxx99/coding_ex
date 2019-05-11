
public class RBTree {

	public static void insert(RBTreeNode root, RBTreeNode node) {
		RBTreeNode parent = findInsertnode(root, node);
		if (parent == null)
			return;
		if (parent.val > node.val) {
			parent.left = node;
		} else {
			parent.right = node;
		}
		node.parent = parent;
		adjust(node);
	}

	public static void adjust(RBTreeNode node) {
		if (node.isBlack == true)
			return;
		if (node.parent.isBlack == true)
			return;
		if (node.parent.parent.left == node.parent) {
			// 父节点是左孩子
			if (node.parent.right == node) {
				// 是父节点的右孩子，则父节点做一次左旋，变为处理左孩子
				leftRotate(node.parent);
				adjust(node.left);
			} else {
				// 是左孩子，开始判断各种条件
				if (node.parent.parent.right == null || node.parent.parent.right.isBlack == false) {
					// 叔父节点是空或者红色，则把父节点和叔父节点变为黑色，并把爷爷节点变为红色，然后再check爷爷节点
					node.parent.isBlack = true;
					if (node.parent.parent.right != null) {
						node.parent.parent.right.isBlack = true;
					}
					if (node.parent.parent.parent != null) {
						// 不是根节点，染成红色
						node.parent.parent.isBlack = false;
					}
					adjust(node.parent.parent);
				} else if (node.parent.parent.right != null && node.parent.parent.right.isBlack == false) {
					// 叔父节点是黑色，则把爷爷节点右旋，并把爷爷节点变为红色，父亲节点变为黑色
					node.parent.isBlack = true;
					node.parent.parent.isBlack = false;
					rightRotate(node.parent.parent);
				}
			}
		} else {
			// 父节点是右孩子，做和上面对称的操作
			if (node.parent.left == node) {
				// 是父节点的左孩子，做一次右旋，变为处理右孩子
				rightRotate(node.parent);
				adjust(node.right);
			} else {
				// 是右孩子，开始判断各种条件
				if (node.parent.parent.left == null || node.parent.parent.left.isBlack == false) {
					// 叔父节点是红色，则把父节点和叔父节点变为黑色，并把爷爷节点变为红色，然后再check爷爷节点
					node.parent.isBlack = true;
					if (node.parent.parent.left != null) {
						node.parent.parent.left.isBlack = true;
					}
					if (node.parent.parent.parent != null) {
						// 不是根节点，染成红色
						node.parent.parent.isBlack = false;
					}
					adjust(node.parent.parent);
				} else if (node.parent.parent.left != null && node.parent.parent.left.isBlack == false) {
					// 叔父节点是黑色，则把爷爷节点左旋，并把爷爷节点变为红色，父亲节点变为黑色
					node.parent.isBlack = true;
					node.parent.parent.isBlack = false;
					leftRotate(node.parent.parent);
				}
			}
		}

	}

	public static void leftRotate(RBTreeNode node) {
		RBTreeNode rightChild = node.right;
		if (node.parent.left == node) {
			// 左孩子
			rightChild.parent = node.parent;
			node.parent.left = rightChild;

		} else {
			// 右孩子
			rightChild.parent = node.parent;
			node.parent.right = rightChild;
		}
		rightChild.left = node;
		node.parent = rightChild;
		node.right = rightChild.left;
	}

	public static void rightRotate(RBTreeNode node) {
		RBTreeNode leftChild = node.left;
		if (node.parent.left == node) {
			// 左孩子
			leftChild.parent = node.parent;
			node.parent.left = leftChild;

		} else {
			// 右孩子
			leftChild.parent = node.parent;
			node.parent.right = leftChild;
		}
		leftChild.right = node;
		node.parent = leftChild;
		node.left = leftChild.right;
	}

	public static RBTreeNode findInsertnode(RBTreeNode root, RBTreeNode node) {
		if (root.val == node.val)
			return null;
		if (root.val > node.val) {
			// 在左子树中查找
			if (root.left != null) {
				return findInsertnode(root.left, node);
			} else {
				return root;
			}
		} else {
			// 在右子树中查找
			if (root.right != null) {
				return findInsertnode(root.right, node);
			} else {
				return root;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t = { 63, 55, 90, 42, 58, 70, 10, 45, 67, 83 };
		RBTreeNode root = new RBTreeNode();
		root.val = t[0];
		root.isBlack = true;
		for (int i = 1; i < t.length; i++) {
			RBTreeNode node = new RBTreeNode();
			node.val = t[i];
			node.isBlack = false;
			insert(root, node);
		}
		System.out.println();
	}

}
