
public class BigNumPlus {

	public static String add(String s1, String s2) {
		int carry = 0;
		char[] result = new char[Math.max(s1.length(), s2.length()) + 1];
		for (int k = 0; k < result.length; k++) {
			result[k] = 0;
		}
		int p1 = s1.length() - 1;
		int p2 = s2.length() - 1;
		int rIndex = result.length - 1;
		while (p1 >= 0 || p2 >= 0) {
			int i1 = 0;
			int i2 = 0;
			if (p1 >= 0) {
				i1 = s1.charAt(p1) - '0';
				p1--;
			}
			if (p2 >= 0) {
				i2 = s2.charAt(p2) - '0';
				p2--;
			}
			int addResult = i1 + i2 + carry;
			carry = addResult > 9 ? 1 : 0;
			result[rIndex] = Integer.toString(addResult % 10).charAt(0);
			rIndex--;
		}
		if (carry == 1) {
			result[0] = '1';
		}
		return String.valueOf(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t1 = "999999999999999999999999999999999999999999999999999999999";
		String t2 = "999999999999999999999999999999999999999999999999999999999";
		System.out.println(add(t1, t2));
	}

}
