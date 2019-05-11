
public class TitleToNumber {

	public static int titleToNumber(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		int sum = 0;
        for (int i=0; i<s.length(); i++) {
        	int v = s.charAt(s.length() - i - 1) - 'A' + 1;
        	sum += v * Math.pow(26, i);
        }
        return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] t = { "", "A", "B", "C", "AB", "ZY" };

		for (int i = 0; i < t.length; i++) {
			System.out.print(titleToNumber(t[i]) + " ");
		}
	}

}
