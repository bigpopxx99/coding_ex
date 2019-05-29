
public class ClimbStairs {

	public int climbStairs(int n) {
		if (n==0) return 0;
		if (n==1) return 1;
		if (n==2) return 2;
		int[] history = new int[n+1];
		history[0] = 0;
		history[1] = 1;
		history[2] = 2;
		int pIdx = 3;
		while (pIdx <= n) {
			history[pIdx] = history[pIdx-1] + history[pIdx-2];
			pIdx++;
		}
		return history[n];
	}
	

	public static void main(String[] args) {
		ClimbStairs c = new ClimbStairs();
		System.out.println(c.climbStairs(1));
	}

}
