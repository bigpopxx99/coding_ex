
public class FlipAndInvertArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] test1 = new int[][] {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] test2 = new int[][] {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        SolutionFlipAndInvertArray solutionFlipAndInvertArray = new SolutionFlipAndInvertArray();
        int[][] testResult1 = solutionFlipAndInvertArray.flipAndInvertImage(test1);
        int[][] testResult2 = solutionFlipAndInvertArray.flipAndInvertImage(test2);
	}

}

class SolutionFlipAndInvertArray {
    public int[][] flipAndInvertImage(int[][] A) {
        if (A == null || A.length == 0 || A[0].length == 0) {
            return A;
        }
        int y = 0;
        while (y < A.length) {
            int x = 0;
            while (x < A[y].length - 1 - x) {
                int tmp = A[y][x];
                A[y][x] = A[y][A[y].length - 1 - x];
                A[y][A[y].length - 1 - x] = tmp;
                x++;
            }
            for (int i = 0; i < A[y].length; i++) {
                A[y][i] = Math.abs(A[y][i] - 1);
            }
            y++;
        }
        return A;
    }
}
