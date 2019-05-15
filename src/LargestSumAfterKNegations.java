import java.util.Arrays;

public class LargestSumAfterKNegations {
	
    public static int largestSumAfterKNegations(int[] A, int K) {
    	Arrays.sort(A);
    	int p = 0;
        while (K > 0) {
        	A[p] = (-1)*A[p];
        	if (A[p] > A[p+1]) {
        		p++;
        	}
        	K--;
        }
        int sum = 0;
        for (int i=0; i<A.length; i++) {
        	sum += A[i];
        }
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] t1 = {4,2,3};
        int[] t2 = {3,-1,0,2};
        int[] t3 = {2,-3,-1,5,-4};
        int[] t4 = {1,3,2,6,7,9};
        System.out.println(largestSumAfterKNegations(t1, 1));
        System.out.println(largestSumAfterKNegations(t2, 3));
        System.out.println(largestSumAfterKNegations(t3, 2));
        System.out.println(largestSumAfterKNegations(t4, 3));
	}

}
