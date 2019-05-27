
public class ConvertToBase7 {

	public String convertToBase7(int num) {
		if (num == 0) {
			return "0";
		}
		String prefix = num > 0 ? "" : "-";
		int val = Math.abs(num);
		if (val < 7) {
			return prefix + val;
		}
		String ret = "";
		while (val > 0) {
			ret = (val % 7) + ret;
			val = val / 7;
		}
		return prefix + ret;
	}

	public static void main(String[] args) {
        int[] t = {100,-7,101,200,1,-2};
        ConvertToBase7 ct = new ConvertToBase7();
        for (int i=0; i<t.length; i++) {
        	System.out.println(ct.convertToBase7(t[i]));
        }
	}

}
