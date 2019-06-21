package questions

import (
	"testing"
	"leetcode.com/common"
)

func TestHasPathSum(t *testing.T) {

	var t1, t21, t22, t31, t32, t33, t41,t42,t43 common.TreeNode
	t1.Val, t21.Val, t22.Val, t31.Val, t32.Val, t33.Val, t41.Val,t42.Val,t43.Val = 5, 4, 8, 11, 13, 4, 7, 2, 1
	t1.Left, t1.Right, t21.Left, t22.Left, t22.Right, t31.Left, t31.Right, t33.Right =&t21, &t22, &t31, &t32, &t33, &t41, &t42, &t43

	var k1 common.TreeNode
	k1.Val = 10

	//var m1 common.TreeNode

	cases := [] struct{
		root *common.TreeNode
		sum int
		want bool
	}{
		{&t1, 22,true},
		{&k1, 0, false},
		{nil, 1, false},
	}
	for _, c := range cases {
		got := hasPathSum(c.root, c.sum)
		if got != c.want {
			t.Errorf("sum(%v) got==(%v), want==(%v)", c.sum, got, c.want)
		}


	}
}

