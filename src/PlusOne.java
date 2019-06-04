
public class PlusOne {
	
    public int[] plusOne(int[] digits) {
    	if (digits == null || digits.length == 0) {
    		return digits;
    	}
    	int r = digits.length - 1;
    	int plusone = digits[r] + 1;
    	int carry = plusone > 9 ? 1 : 0;
    	digits[r] = plusone > 9 ? plusone-10 : plusone;
    	r--;
        while (carry == 1 && r >= 0) {
        	plusone = digits[r] + carry;
        	carry = plusone > 9 ? 1 : 0;
        	digits[r] = plusone > 9 ? plusone-10 : plusone;
        	r--;
        }
        if (carry == 1) {
        	int[] ret = new int[digits.length+1];
        	for (int i=1; i<ret.length; i++) {
        		ret[i] = digits[i-1];
        	}
        	ret[0] = 1;
        	return ret;
        }
        return digits;
        
    }

	public static void main(String[] args) {
		int[] t = {};
		PlusOne po = new PlusOne();
		Utils.printArray((po.plusOne(t)));
	}

}
