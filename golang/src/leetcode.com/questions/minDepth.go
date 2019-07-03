package questions

var minLayer = -1

func minDepth(root *TreeNode) int {
    if root == nil {
    	return 0
	}
	minLayer = -1
	search(root, 1)
    return minLayer
}

func search(root *TreeNode, layer int) {
	if minLayer != -1 && minLayer <= layer {
		return
	}
	if root.Left == nil && root.Right == nil {
		minLayer = layer
		return
	}
	if root.Left != nil {
		search(root.Left, layer+1)
	}
	if root.Right != nil {
		search(root.Right, layer+1)
	}
}