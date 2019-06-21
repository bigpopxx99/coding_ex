
public class ArrangeCoins {
	
    public int arrangeCoins(int n) {
        return (int)(Math.pow(2.0*n+0.25, 0.5) - 0.5);
    }

	public static void main(String[] args) {
        int[] t = {0,5,8,10,1804289383};
        ArrangeCoins ac = new ArrangeCoins();
        for (int i=0; i<t.length; i++) {
        	System.out.println(ac.arrangeCoins(t[i]));
        }
	}

}
