
public class AddStrings {

    public String addStrings(String num1, String num2) {
        if (num1.length() == 0) return num2;
		if (num2.length() == 0) return num1;
		int carry = 0;
		int p1 = num1.length() - 1;
		int p2 = num2.length() - 1;
		StringBuffer sb = new StringBuffer();
		while (p1 >= 0 || p2 >= 0) {
			int v1 = (p1 >= 0) ? num1.charAt(p1) - '0' : 0;
			int v2 = (p2 >= 0) ? num2.charAt(p2) - '0' : 0;
			int result = v1 + v2 + carry;
			if (result > 9) {
				carry = 1;
				result = result - 10;
			}else{
                carry = 0;
            }
			sb.append(result);
			p1--;
			p2--;
		}
		if (carry > 0) {
			sb.append(1);
		}
		return sb.reverse().toString();
    }

	public static void main(String[] args) {
		AddStrings a = new AddStrings();
		System.out.println(a.addStrings("88", "1"));
	}

}
