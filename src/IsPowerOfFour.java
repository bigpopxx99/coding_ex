import java.util.HashSet;

public class IsPowerOfFour {
	
    public boolean isPowerOfFour(int num) {
        if (num <= 0) return false;
        if (num == 1) return true;
        double r = Math.log10(num)/Math.log10(4);
        return  r - (int)r < 0.000000001;
    }

	public boolean isPowerOfFour2(int num) {
    	return num == 1 
    			|| num == 4
    			|| num == 16
    			|| num == 64
    			|| num == 256
    			|| num == 1024
    			|| num == 4096
    			|| num == 16384
    			|| num == 65536
    			|| num == 262144 
    			|| num == 1048576 
    			|| num == 4194304 
    			|| num == 16777216 
    			|| num == 67108864 
    			|| num == 268435456 
    			|| num == 1073741824;
    }

	public static void main(String[] args) {
		int[] t = { -1, 0, 1, 2, 3, 4, 8, 16, 32, 64, Integer.MAX_VALUE };
		IsPowerOfFour ipof = new IsPowerOfFour();
		 for (int i=0; i<t.length; i++) {
		 System.out.println(t[i]+" "+ipof.isPowerOfFour(t[i]));
		 }
		ipof.isPowerOfFour(0);
	}

}
