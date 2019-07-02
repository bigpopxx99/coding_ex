package main

import (
	"golang.org/x/tour/pic"
	"image/color"
	"image"
)

type Image struct{}

func (IMG Image) ColorModel() color.Model {
	return color.RGBAModel
}

func (IMG Image) Bounds() image.Rectangle {
    return image.Rect(0, 0, 100, 100)
}

func (IMG Image) At(x, y int) color.Color {
	pic := Pic(100, 400)
	return color.RGBA{pic[x][y*4], pic[x][y*4+1], pic[x][y*4+2], pic[x][y*4+3]}
}

func Pic(dx, dy int) [][]uint8 {
	var retArray [][]uint8
	for i:=0; i<dx; i++ {
		tmp := make([]uint8, dy)
		for j:=0; j<dy; j++ {
			tmp[j] = uint8(i*j)
		}
		retArray = append(retArray, tmp)
	}
	return retArray
}

func main() {
	m := Image{}
	pic.ShowImage(m)
}