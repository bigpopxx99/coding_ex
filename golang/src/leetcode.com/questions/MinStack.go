package questions

import (
	"container/list"
)

type MinStack struct {
	list *list.List
	minList *list.List
}

/** initialize your data structure here. */
func Constructor() MinStack {
	sList := list.New()
	minList := list.New()
	return MinStack{sList, minList}
}


func (this *MinStack) Push(x int)  {
	if this.minList.Len() == 0 {
		this.minList.PushBack(x)
	}else{
		if x <= this.minList.Back().Value.(int) {
			this.minList.PushBack(x)
		}
	}
	this.list.PushBack(x)
}


func (this *MinStack) Pop()  {
	e := this.list.Back()
	if e != nil {
		if e.Value.(int) == this.minList.Back().Value.(int) {
			this.minList.Remove(this.minList.Back())
		}
		this.list.Remove(e)
	}
}


func (this *MinStack) Top() int {
	e := this.list.Back()
	return e.Value.(int)
}


func (this *MinStack) GetMin() int {
	return this.minList.Back().Value.(int)
}

/*
func main() {
	minStack := Constructor()
	minStack.Push(-2)
	minStack.Push(0)
	minStack.Push(-3)
	fmt.Println(minStack.GetMin())
	minStack.Pop()
	fmt.Println(minStack.Top())
	fmt.Println(minStack.GetMin())
	fmt.Println(minStack)
}
*/
