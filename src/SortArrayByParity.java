import java.awt.List;
import java.util.ArrayList;

public class SortArrayByParity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[] test1 = {3, 1, 2, 4};
	    int[] test2 = {0, 1};
	    SolutionSortArrayByParity solution = new SolutionSortArrayByParity();
	    int[] test1_result = solution.sortArrayByParity(test1);
	    int[] test2_result = solution.sortArrayByParity(test2);
	}

}


class SolutionSortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        if (A == null || A.length == 0) {
        	return A;
        }
        int[] result_array = new int[A.length];
        int[] odd_array = new int[A.length];
        int even_index = 0;
        int odd_index = 0;
        for (int i=0; i<A.length; i++) {
        	if (A[i] % 2 == 0) {
        		result_array[even_index++] = A[i];
        	}else {
        		odd_array[odd_index++] = A[i];
        	}
        }
        if (odd_index > 0) {
        	for (int j=0; j<odd_index; j++) {
        		result_array[even_index++] = odd_array[j];
        	}
        }
        return result_array;
        
    }
}