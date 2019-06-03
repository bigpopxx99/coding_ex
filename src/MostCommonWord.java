import java.util.Arrays;
import java.util.HashMap;

public class MostCommonWord {

	public String mostCommonWord(String paragraph, String[] banned) {
		String lc = paragraph.toLowerCase();
		String[] symbols = { "!", "?", "'", ",", ";", ".", " " };
		for (int i = 0; i < symbols.length; i++) {
			lc = lc.replace(symbols[i], "  ");
		}
		lc = " " + lc + " ";
		for (int j = 0; j < banned.length; j++) {
			lc = lc.replace(" " + banned[j] + " ", " ");
		}
		String[] result = lc.split(" ");
		if (result == null || result.length == 0) {
			return null;
		}
		HashMap<String, Integer> hashMap = new HashMap<>();
		int max = 1;
		String ret = null;
		for (int k = 0; k < result.length; k++) {
			String key = result[k].trim();
			if (key.length() == 0)
				continue;
			if (ret == null) {
				ret = key;
			}
			if (hashMap.containsKey(key)) {
				int count = hashMap.get(key);
				count++;
				if (count >= max) {
					max = count;
					ret = key;
				}
				hashMap.put(key, count);
			} else {
				hashMap.put(key, 1);
			}
		}
		return ret;
	}

	public String mostCommonWord2(String paragraph, String[] banned) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		int start = 0;
		int end = 0;
		while (end < paragraph.length()) {
			char tmp = paragraph.charAt(end);
			if (isLetter(tmp)) {
				end++;
			} else {
				if (end > start) {
					String key = paragraph.substring(start, end).toLowerCase();
					if (hashMap.containsKey(key)) {
						hashMap.put(key, hashMap.get(key) + 1);
					} else {
						hashMap.put(key, 1);
					}
					end++;
					start = end;
				} else if (end == start) {
					start++;
					end++;
				}
			}
		}
		if (end > start) {
			String key = paragraph.substring(start, end).toLowerCase();
			if (hashMap.containsKey(key)) {
				hashMap.put(key, hashMap.get(key) + 1);
			} else {
				hashMap.put(key, 1);
			}
		}
		for (int i = 0; i < banned.length; i++) {
			hashMap.remove(banned[i].toLowerCase());
		}
		int maxV = 1;
		String ret = null;
		for (String key : hashMap.keySet()) {
			if (ret == null) {
				ret = key;
				maxV = hashMap.get(key);
			} else {
				int v = hashMap.get(key);
				if (v > maxV) {
					maxV = v;
					ret = key;
				}
			}
		}
		return ret;
	}

	private boolean isLetter(char c) {
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
	}

	public static void main(String[] args) {
		String t = "abc abc? abcd the jeff!";
		String t2 = "a,a,a,a,b,b,b,c,c";
		String[] banned = { "abc", "abcd", "jeff" };
		String[] banned2 = {"a"};
		MostCommonWord m = new MostCommonWord();
		System.out.println(m.mostCommonWord2(t2, banned2));
	}
}
