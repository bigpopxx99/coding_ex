
public class ReverseVowels {

	public String reverseVowels(String s) {
		if (s == null || s.length() <= 1) {
			return s;
		}
		int left = 0;
		int right = s.length() - 1;
		char[] array = s.toCharArray();
		while (left < right) {
			char l = array[left];
			char r = array[right];
			if (isVowels(l) && isVowels(r)) {
				if (l != r) {
					array[left] = r;
					array[right] = l;
				}
				left++;
				right--;
				continue;
			}
			if (!isVowels(l)) {
				left++;
			}
			if (!isVowels(r)) {
				right--;
			}
		}
		return String.valueOf(array);
	}

	private boolean isVowels(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
				|| c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
	}

	public static void main(String[] args) {
		String[] t = { "hello", "leetcode", "", null, "a", "a E" };
		ReverseVowels rv = new ReverseVowels();
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i] + " -> " + rv.reverseVowels(t[i]));
		}
	}
}
