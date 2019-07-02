package questions

import "testing"

func TestMinStack(t *testing.T) {
	cases := [] struct {
		funcs []string
		params [][]int
        want []interface{}
	}{
		{[]string{"MinStack","push","push","push","getMin","pop","top","getMin"},
		[][]int{{}, {-2},{0},{-3},{},{},{},{}},
		[]interface{}{nil,nil,nil,nil,-3,nil,0,-2}},
	}
	p := MinStack{}
	for _, get := range cases {
		result := make([]interface{}, 0)
        for i:=0; i<len(get.funcs); i++ {
        	switch get.funcs[i] {
			case "MinStack":
				p = Constructor()
				result = append(result, nil)
				break
			case "push":
				p.Push(get.params[i][0])
				result = append(result, nil)
				break
			case "getMin":
				result = append(result, p.GetMin())
				break
			case "pop":
				p.Pop()
				result = append(result, nil)
				break
			case "top":
				result = append(result, p.Top())
				break
			}
		}
		for i:=0; i<len(result); i++ {
			if result[i] != get.want[i] {
				t.Errorf("get:%v want:%v",result, get.want)
			}
		}
	}
}
