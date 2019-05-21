public class LongestPalindrome {

	public int longestPalindrome(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		if (s.length() == 1) {
			return 1;
		}
		int[] letters = new int['z' - 'A' + 1];
		int oddNums = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			letters[c - 'A'] += 1;
			if (letters[c-'A'] % 2 == 1) {
				oddNums++;
			}else {
				oddNums--;
			}
		}

		return s.length() - (oddNums > 0 ? (oddNums - 1) : 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindrome longestPalindrome = new LongestPalindrome();
		String tString = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
		System.out.println(longestPalindrome.longestPalindrome(tString));
	}

}
