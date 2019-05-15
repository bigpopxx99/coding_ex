import java.util.HashMap;
import java.util.HashSet;

public class FirstUniqChar {

	// public static int firstUniqChar(String s) {
	// HashMap<Character, Integer> hashMap = new HashMap<>();
	// for (int i=0; i<s.length(); i++) {
	// if (hashMap.containsKey(s.charAt(i))) {
	// hashMap.put(s.charAt(i), 0);
	// }else {
	// hashMap.put(s.charAt(i), 1);
	// }
	// }
	// for (int j=0; j<s.length(); j++) {
	// if (hashMap.get(s.charAt(j)) == 1) {
	// return j;
	// }
	// }
	// return -1;
	// }

	public static int firstUniqChar(String s) {
		int[] tmp = new int[26];
		for (int i = 0; i < s.length(); i++) {
			tmp[s.charAt(i) - 'a'] += 1;
		}
		for (int k = 0; k < s.length(); k++) {
			if (tmp[s.charAt(k) - 'a'] == 1) {
				return k;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String t1 = "leetcode";
		String t2 = "loveleetcode";
		System.out.println(firstUniqChar(t1));
		System.out.println(firstUniqChar(t2));
	}

}
