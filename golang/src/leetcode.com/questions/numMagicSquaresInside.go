package questions

func numMagicSquaresInside(grid [][]int) int {
	if len(grid) < 3 || len(grid[0]) < 3 {
		return 0
	}
	ret := 0
    for row:=0; row < len(grid)-2; row ++ {
    	for col:=0; col < len(grid[0])-2; col++ {
    		if isMagicSquare(grid, row, col) {
    			ret++
			}
		}
	}
	return ret
}

func isMagicSquare(grid [][]int, rowStart int, colStart int) bool {
	numMap := make(map[int]int)

	//row check
	sum := 0
	sumRow := 0
	for row := rowStart; row < rowStart + 3; row++ {
		sumRow = 0
		for col := colStart; col < colStart + 3; col++ {
            v := grid[row][col]
            if v > 9 || v < 1 {
            	return false
			}
			if _,ok:=numMap[v]; ok == true {
                return false
			}else{
				numMap[v] = 1
			}
			sumRow += v
		}
		if sum != 0 && sum != sumRow {
			return false
		}
		if sum == 0 {
			sum = sumRow
		}
	}

	//column check
	sumCol := 0
	for col := colStart; col < colStart + 3; col++ {
		sumCol = 0
		for row := rowStart; row < rowStart + 3; row++ {
			v := grid[row][col]
			sumCol += v
		}
		if sum != sumCol {
			return false
		}
	}

	//diagonals check
	sumLR := grid[rowStart][colStart] + grid[rowStart+1][colStart+1] + grid[rowStart+2][colStart+2]
	if sumLR != sum {
		return false
	}
	sumRL := grid[rowStart][colStart+2] + grid[rowStart+1][colStart+1] + grid[rowStart+2][colStart]
	if sumRL != sum {
		return false
	}

	return true
}
