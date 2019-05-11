
public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] test1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] test2 = {{1,2,3},{4,5,6}};
        SolutionTranspose solutionTranspose = new SolutionTranspose();
        int[][] ret1 = solutionTranspose.transpose(test1);
        int[][] ret2 = solutionTranspose.transpose(test2);
	}

}

class SolutionTranspose {
    public int[][] transpose(int[][] A) {
        if (A == null || A.length == 0) {
        	return A;
        }
        int[][] ret = new int[A[0].length][A.length];
        for (int row=0; row<A.length; row++) {
        	for (int col=0; col<A[0].length; col++) {
        		ret[col][row] = A[row][col];
        	}
        }
        return ret;
    }
}
