
public class ImageSmoother {

	public int[][] imageSmoother(int[][] M) {
		if (M == null || M.length == 0) {
			return null;
		}
		int[][] newArray = new int[M.length][M[0].length];
		countToNewArray(M, newArray);
        return newArray;
	}

	public void countToNewArray(int[][] oldArray, int[][] newArray) {
		for (int i = 0; i < oldArray.length; i++) {
			for (int j = 0; j < oldArray[0].length; j++) {
                newArray[i][j] = getCount(oldArray, i, j);
			}
		}
	}

	public int getCount(int[][] array, int row, int column) {
		int numbers = 1;
		int sum = array[row][column];
		int rowNums = array.length;
		int colNums = array[0].length;
		if (row > 0) {
			sum += array[row - 1][column];
			numbers++;
			if (column > 0) {
				sum += array[row - 1][column - 1];
				numbers++;
			}
			if (column < colNums - 1) {
				sum += array[row - 1][column + 1];
				numbers++;
			}
		}
		if (row < rowNums - 1) {
			sum += array[row + 1][column];
			numbers++;
			if (column > 0) {
				sum += array[row + 1][column - 1];
				numbers++;
			}
			if (column < colNums - 1) {
				sum += array[row + 1][column + 1];
				numbers++;
			}
		}
		if (column > 0) {
			sum += array[row][column - 1];
			numbers++;
		}
		if (column < colNums - 1) {
			sum += array[row][column + 1];
			numbers++;
		}
		return (int) Math.floor(sum*1.0/numbers);
	}

	public static void main(String[] args) {
		int[][] t = {{10,10,10},{10,0,10},{10,10,10}};
		ImageSmoother img = new ImageSmoother();
		int[][] newArray = img.imageSmoother(t);
	}

}
