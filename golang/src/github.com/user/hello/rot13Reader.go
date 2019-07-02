package main

import (
	"io"
	"os"
	"strings"
)

var INPUT  = []byte(" ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz")
var OUTPUT = []byte(" NOPQRSTUVWXYZABCDEFGHIJKLMnopqrstuvwxyzabcdefghijklm")

type rot13Reader struct {
	r io.Reader
}

func (R13 rot13Reader) Read(array []byte) (int, error) {
	n, err := R13.r.Read(array)
	if err != io.EOF {
		for i := 0; i < n; i++ {
			for j := 0; j < len(INPUT); j++ {
				if INPUT[j] == array[i] {
					array[i] = OUTPUT[j]
					break
				}
			}
		}
		return n, nil
	}
	return n, err
}

func main() {
	s := strings.NewReader("Lbh penpxrq gur pbqr!")
	r := rot13Reader{s}
	io.Copy(os.Stdout, &r)
}
