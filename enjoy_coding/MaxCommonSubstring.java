
public class MaxCommonSubstring {
	
	private static String getMaxCommonSubstring(String a, String b) {
		if (a.length() == 0 || b.length() == 0) {
			return "";
		}
		String lastA = a.substring(a.length()-1, a.length());
		String lastB = b.substring(b.length()-1, b.length());
		if (lastA.equals(lastB)) {
			return getMaxCommonSubstring(a.substring(0, a.length()-1), b.substring(0, b.length()-1)) + lastA;
		}else {
			String aMinusOne = getMaxCommonSubstring(a.substring(0, a.length()-1), b);
			String bMinusOne = getMaxCommonSubstring(a, b.substring(0, b.length()-1));
			return aMinusOne.length() > bMinusOne.length() ? aMinusOne : bMinusOne;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a = "sudjxidjs";
        String b = "xidjxidpolkj";
        System.out.println(getMaxCommonSubstring(a, b));
	}

}
