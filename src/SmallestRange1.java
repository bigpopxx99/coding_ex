import java.util.Arrays;

public class SmallestRange1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] test1 = {1};
        int[] test2 = {0, 10};
        int[] test3 = {1,3,6};
        SolutionSmallestRange1 solutionSmallestRange1 = new SolutionSmallestRange1();
        System.out.println(solutionSmallestRange1.smallestRangeI(test1, 0));
        System.out.println(solutionSmallestRange1.smallestRangeI(test2, 2));
        System.out.println(solutionSmallestRange1.smallestRangeI(test3, 3));
        
	}

}

class SolutionSmallestRange1 {
    public int smallestRangeI(int[] A, int K) {
        if (A == null || A.length == 0) {
        	return 0;
        }
        Arrays.sort(A);
        return A[A.length-1] - A[0] - K*2 > 0 ? A[A.length-1] - A[0] - K*2 : 0;
    }
}
