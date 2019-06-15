
public class IsPerfectSquare {
    public boolean isPerfectSquare(int num) {
    	double result = Math.pow(10, Math.log10(num)/2);
    	return (Math.ceil(result)-result < 0.00000001) 
    			|| (result - Math.floor(result) < 0.00000001);
    }

	public static void main(String[] args) {
		IsPerfectSquare ipfs = new IsPerfectSquare();
		for (int i=14; i<=14; i++) {
			if (ipfs.isPerfectSquare(i)) {
				System.out.println(i);
			}
		}

	}

}
