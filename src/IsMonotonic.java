
public class IsMonotonic {
	
    public static boolean isMonotonic(int[] A) {
    	int type = 0; //0 means unkonw, 1 means increasing, 2 means decreasing
    	for (int i=0; i< A.length-1; i++) {
    		if (A[i] == A[i+1]) {
    			continue;
    		}else if (A[i] > A[i+1]) {
    			if (type == 0) {
    				type = 2;
    			}else if (type != 2) {
    				return false;
    			}
    		}else {
    			if (type == 0) {
    				type = 1;
    			}else if (type != 1) {
    				return false;
    			}
    		}
    	}
    	
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] t1 = new int[] {1,2,2,3};
        int[] t2 = new int[] {6,5,4,4};
        int[] t3 = new int[] {1,3,2};
        int[] t4 = new int[] {1,2,4,5};
        int[] t5 = new int[] {1,1,1};
        System.out.println(isMonotonic(t1));
        System.out.println(isMonotonic(t2));
        System.out.println(isMonotonic(t3));
        System.out.println(isMonotonic(t4));
        System.out.println(isMonotonic(t5));
	}

}
