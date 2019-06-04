
public class IsPowerOfThree {

	public boolean isPowerOfThree(int n) {
		if (n<=0) return false;
		if (n==1) return true;
		double d = Math.log10(n)/Math.log10(3);
		return (d - (int)d) < 0.00000000000001;
	}
	
	public boolean isPowerOfThree2(int n) {
		return n > 0 && (1162261467 % n == 0);
	}

	public static void main(String[] args) {
		IsPowerOfThree is = new IsPowerOfThree();
		int[] t = {-1,0,1,2,3,45,99,81};
		for (int i=0; i<t.length; i++) {
			System.out.println(t[i] + ":" + is.isPowerOfThree2(t[i]));
		}
	}

}
