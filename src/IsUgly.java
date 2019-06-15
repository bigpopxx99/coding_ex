
public class IsUgly {

	public boolean isUgly(int num) {
		if (num <= 0) return false;
		while (num > 0 && num != 1) {
			if (num == getResult(num)) {
				return false;
			} else {
				num = getResult(num);
			}
		}
		return true;
	}

	private int getResult(int num) {
		if (num % 5 == 0) {
			return num / 5;
		}
		if (num % 3 == 0) {
			return num / 3;
		}
		if (num % 2 == 0) {
			return num / 2;
		}
		return num;
	}

	public static void main(String[] args) {
		int[] t = { 0, 1, 2, 6, 11, 21, 45, -2147483648 };
		IsUgly iu = new IsUgly();
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i] + " " + iu.isUgly(t[i]));
		}
	}

}
