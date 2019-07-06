package questions

func longestUnivaluePath(root *TreeNode) int {
	if root == nil {
		return 0
	}
	var maxLen = 0
    private_traversing(root, &maxLen)
    return maxLen
}

func private_traversing(root *TreeNode, maxLen *int) int {
    if root == nil {
    	return 0
	}
	var left = 0
	var right = 0
	var lRes = 0
	var rRes = 0
	left = private_traversing(root.Left, maxLen)
	right = private_traversing(root.Right, maxLen)
	if root.Left != nil && root.Left.Val == root.Val {
		lRes = left + 1
	}
	if root.Right != nil && root.Right.Val == root.Val {
		rRes = right + 1
	}
	if lRes + rRes > *maxLen {
		*maxLen = lRes + rRes
	}
	if lRes > rRes {
		return lRes
	}else{
		return rRes
	}
}