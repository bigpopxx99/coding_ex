package questions

import (
	"testing"
)

func TestCompress(t *testing.T) {
	cases := [] struct {
		chars     []byte
		wantNums  int
		wantArray []byte
	}{
		{[]byte{'a', 'a', 'b', 'b', 'c', 'c', 'c'}, 6, []byte{'a', '2', 'b', '2', 'c', '3'}},
		{[]byte{'a','b','b','b','b','b','b','b','b','b','b','b','b'}, 4, []byte{'a','b','1','2'}},
		{[]byte{'a'}, 1, []byte{'a'}},
	}
	for _, c := range cases {
		got := compress(c.chars)
		if got != c.wantNums {
			t.Errorf("got==(%v), want==(%v)", got, c.wantNums)
		} else {
			for i := 0; i < got; i++ {
                if c.chars[i] != c.wantArray[i] {
                	t.Errorf("got==(%v), want==(%v)", c.chars[i], c.wantArray[i])
				}
			}

		}
	}
}
