package questions

func hasPathSum(root *TreeNode, sum int) bool {
	if root == nil {
		return false
	}
    if root.Left == nil && root.Right == nil {
    	return root.Val == sum
	}
	bL := false
	if root.Left != nil{
		bL = hasPathSum(root.Left, sum - root.Val)
	}
	bR := false
	if root.Right != nil {
		bR = hasPathSum(root.Right, sum - root.Val)
	}

	return bL || bR
}