import java.util.ArrayList;
import java.util.List;

public class PrefixesDivBy5 {

	public List<Boolean> prefixesDivBy5(int[] A) {
		List<Boolean> ret = new ArrayList<>();
		int remainder = A[0] % 5;
		ret.add(remainder == 0 ? true : false);
		for (int i = 1; i < A.length; i++) {
			remainder =  (remainder*2 + A[i]) % 5;
			ret.add(remainder == 0 ? true : false);
		}
		return ret;
	}

	public static void main(String[] args) {
        int[] t1 = {0,1,1};
        int[] t2 = {1,1,1};
        int[] t3 = {0,1,1,1,1,1};
        int[] t4 = {1,1,1,0,1};
        int[] t5 = {1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1};
        PrefixesDivBy5 p = new PrefixesDivBy5();
//        List<Boolean> l1 = p.prefixesDivBy5(t1);
//        List<Boolean> l2 = p.prefixesDivBy5(t2);
//        List<Boolean> l3 = p.prefixesDivBy5(t3);
//        List<Boolean> l4 = p.prefixesDivBy5(t4);
        List<Boolean> l5 = p.prefixesDivBy5(t5);
        Utils.printList(l5);
	}

}
