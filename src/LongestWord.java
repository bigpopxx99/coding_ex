import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class LongestWord {

	public String longestWord(String[] words) {
		if (words == null || words.length <= 1) {
			return "";
		}
		Arrays.sort(words, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.length() != s2.length()) {
					return s2.length() - s1.length();
				} else {
					if (s1.equals(s2)) {
						return 0;
					}
					for (int i = 0; i < s1.length(); i++) {
						if (s1.charAt(i) < s2.charAt(i)) {
							return -1;
						} else if (s1.charAt(i) > s2.charAt(i)) {
							return 1;
						}
					}
				}
				return 0;
			}
		});
		HashSet<String> hs = new HashSet<>();
		for (int i = 0; i < words.length; i++) {
			hs.add(words[i]);
		}
		for (int j = 0; j < words.length; j++) {
			String str = words[j];
			int endIdx = str.length() - 1;
			boolean isWrong = false;
			while (endIdx >= 1) {
				if (!hs.contains(str.substring(0, endIdx))) {
					isWrong = true;
					break;
				}
				endIdx--;
			}
			if (!isWrong) {
				return str;
			}
		}
		return "";
	}

	public static void main(String[] args) {
		LongestWord l = new LongestWord();
		System.out.println(l.longestWord(new String[] { "w", "wo", "wor", "worl", "world" }));
		System.out.println(l.longestWord(new String[] { "ts", "e", "x", "pbhj", "opto", "xhigy", "erikz", "pbh", "opt",
				"erikzb", "eri", "erik", "xlye", "xhig", "optoj", "optoje", "xly", "pb", "xhi", "x", "o" }));
	}

}
