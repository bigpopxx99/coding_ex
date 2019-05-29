import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm {
	
    public List<Integer> addToArrayForm(int[] A, int K) {

        int carry = 0;
        int pIdx = A.length-1;
        List<Integer> retList = new ArrayList<>();
        while (pIdx >= 0 || K > 0) {
        	int v1 = pIdx >= 0 ? A[pIdx] : 0;
        	int v2 = K%10;
        	int result = v1 + v2 + carry;
        	if (result > 9) {
        		carry = 1;
        		result = result - 10;
        	}else {
        		carry = 0;
        	}
        	retList.add(result);
        	K = K/10;
        	pIdx--;
        }
        if (carry > 0) {
        	retList.add(1);
        }
        Collections.reverse(retList);
        return retList;
    }

	public static void main(String[] args) {
		AddToArrayForm a = new AddToArrayForm();
		Utils.printList(a.addToArrayForm(new int[] {0}, 23));
		Utils.printList(a.addToArrayForm(new int[] {2,7,4}, 181));
		Utils.printList(a.addToArrayForm(new int[] {2,1,5}, 806));
		Utils.printList(a.addToArrayForm(new int[] {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9}, 1));
		Utils.printList(a.addToArrayForm(new int[] {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3}, 516));
	}

}
