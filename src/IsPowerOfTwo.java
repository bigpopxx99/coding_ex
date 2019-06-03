
public class IsPowerOfTwo {
	
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
        	return false;
        }
        return (n&(n-1)) == 0;
    }

	public static void main(String[] args) {
		IsPowerOfTwo ipot = new IsPowerOfTwo();
		for (int i=0; i<1000000000; i++) {
			if (ipot.isPowerOfTwo(i)) {
				System.out.println(i);
			}
		}
	}

}
