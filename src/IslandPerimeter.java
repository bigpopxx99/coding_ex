
public class IslandPerimeter {

	public static int islandPerimeter(int[][] grid) {
		int ret = 0;
		int rowL = grid.length;
		int colL = grid[0].length;
		for (int row = 0; row < rowL; row++) {
			for (int col = 0; col < colL; col++) {
				if (grid[row][col] == 1) {
					if (row - 1 < 0 || grid[row - 1][col] == 0)
						ret++;
					if (col - 1 < 0 || grid[row][col - 1] == 0)
						ret++;
					if (row + 1 >= rowL || grid[row + 1][col] == 0)
						ret++;
					if (col + 1 >= colL || grid[row][col + 1] == 0)
						ret++;
				}
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] t1 = new int[][] { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		int[][] t2 = new int[][] { { 1 }, { 0 } };
		System.out.println(islandPerimeter(t1));
		System.out.println(islandPerimeter(t2));
	}

}
