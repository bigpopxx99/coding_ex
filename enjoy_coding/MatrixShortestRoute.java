
public class MatrixShortestRoute {
	
	private static int getShortestRoute(int[][] array, int rIndex, int cIndex) {
		
		if (rIndex == 0 && cIndex == 0) {
			return array[0][0];
		}		
		int top = Integer.MAX_VALUE;
		int left = Integer.MAX_VALUE;
		if (cIndex -1 >= 0) {
			top = getShortestRoute(array, rIndex, cIndex-1);
		}
        if (rIndex -1 >= 0) {
        	left = getShortestRoute(array, rIndex-1, cIndex);
        }
		return top < left ? top + array[rIndex][cIndex] : left + array[rIndex][cIndex];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] t1 = new int[][]{{1,3,5,9},{8,1,3,4},{5,0,6,1},{8,8,4,0}};
        System.out.println(getShortestRoute(t1, t1.length-1, t1[0].length-1));
	}

}
