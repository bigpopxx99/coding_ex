public class ProjectionArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] test1 = { { 2 } };
		int[][] test2 = { { 1, 2 }, { 3, 4 } };
		int[][] test3 = { { 1, 0 }, { 0, 2 } };
		int[][] test4 = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		int[][] test5 = { { 2, 2, 2 }, { 2, 1, 2 }, { 2, 2, 2 } };
		ProjectionAreaSolution projectionAreaSolution = new ProjectionAreaSolution();
		System.out.println(projectionAreaSolution.projectionArea(test1));
		System.out.println(projectionAreaSolution.projectionArea(test2));
		System.out.println(projectionAreaSolution.projectionArea(test3));
		System.out.println(projectionAreaSolution.projectionArea(test4));
		System.out.println(projectionAreaSolution.projectionArea(test5));
	}

}

class ProjectionAreaSolution {
	public int projectionArea(int[][] grid) {
		int row_best_sum = 0;
		int col_best_sum = 0;
		int ground_sum = 0;
		for (int col = 0; col < grid.length; col++) {
			int best_row_one = grid[col][0];
			for (int row = 0; row < grid[0].length; row++) {
				if (grid[col][row] > 0) {
					ground_sum++;
				}
				if (grid[col][row] > best_row_one) {
					best_row_one = grid[col][row];
				}
				if (col == 0) {
					int best_col_one = grid[0][row];
					for (int i = 0; i < grid.length; i++) {
						if (grid[i][row] > best_col_one) {
							best_col_one = grid[i][row];
						}
					}
					col_best_sum += best_col_one;
				}
			}
			row_best_sum += best_row_one;
		}
		
		return row_best_sum + col_best_sum + ground_sum;

	}
}
