package questions

import "testing"

func TestMinDepth(t *testing.T) {
	t1, t21, t22, t33, t34 := &TreeNode{}, &TreeNode{}, &TreeNode{}, &TreeNode{}, &TreeNode{}
	t1.Val, t21.Val, t22.Val, t33.Val, t34.Val = 3, 9, 20, 15, 7
	t1.Left = t21
	t1.Right = t22
	t22.Left = t33
	t22.Right = t34

	tt1 := &TreeNode{Val:1}
	tt2 := &TreeNode{Val:2}

	tt1.Left = tt2

	cases := [] struct {
		in   *TreeNode
		want int
	}{
		{t1, 2},
		{tt1, 2},
	}

	for idx, v := range cases {
		get := minDepth(v.in)
		if get != v.want {
			t.Errorf("No.%d fail, get:%d want:%d", idx, get, v.want)
		}
	}
}
