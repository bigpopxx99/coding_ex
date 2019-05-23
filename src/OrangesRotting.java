
public class OrangesRotting {

	public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
        	return -1;
        }
		int time = 0;
		boolean hasChange = false;
		while (true) {
			time++;
			hasChange = false;
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					if (grid[i][j] == 1) {
						if ((i > 0 && grid[i - 1][j] == 2) 
								|| (i < grid.length - 1 && grid[i + 1][j] == 2)
								|| (j > 0 && grid[i][j - 1] == 2) 
								|| (j < grid[i].length - 1 && grid[i][j + 1] == 2)) {
							grid[i][j] = -2;
							hasChange = true;
						}
					}
				}
			}
			if (!hasChange) {
				if (hasFresh(grid)) {
					return -1;
				} else {
					time--;
					break;
				}
			}else {
				for (int i = 0; i < grid.length; i++) {
					for (int j = 0; j < grid[i].length; j++) {
						if (grid[i][j] == -2) {
							grid[i][j] = 2;
						}
					}
				}
			}
		}
		return time;

	}

	private boolean hasFresh(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
        int[][] t1 = {{2,1,1},{1,1,0},{0,1,1}};
        int[][] t2 = {{2,1,1},{0,1,1},{1,0,1}};
        int[][] t3 = {{0,2}};
        OrangesRotting o = new OrangesRotting();
        System.out.println(o.orangesRotting(t1));
        System.out.println(o.orangesRotting(t2));
        System.out.println(o.orangesRotting(t3));
        
	}

}
