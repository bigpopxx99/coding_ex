
public class IsHappy {

	public boolean isHappy(int n) {
		int start = n;
		while(true) {
			if (start < 10) {
				return start == 1 || start == 7;
			}else {
				start = getNewInt(start);
			}
		}
	}

	public int getNewInt(int n) {
		if (n < 10) {
			return (int) Math.pow(n, 2);
		} else {
			int sum = (int) Math.pow(n % 10, 2);
			int t = n / 10;
			while (t > 0) {
				sum += Math.pow(t % 10, 2);
				t = t / 10;
			}
			return sum;
		}
	}

	public static void main(String[] args) {
		int[] t = {19,232,2342,2342,1,0,8765};
		IsHappy ih = new IsHappy();
		for (int i=0; i<t.length; i++) {
			System.out.println(ih.isHappy(t[i]));
		}
	}

}
