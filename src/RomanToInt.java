import java.util.HashMap;

public class RomanToInt {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
        int ret = 0;
        for (int i=s.length()-1; i>=0; i--) {
        	int v = hashMap.get(s.charAt(i));
        	if (i == s.length()-1) {
        		ret += v;
        	}else {
        		if (v < hashMap.get(s.charAt(i+1))) {
        			ret -= v;
        		}else {
        			ret += v;
        		}
        	}
        }
        return ret;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] t1 = {"III", "IV", "IX", "LVIII", "MCMXCIV"};
        
        for (int i = 0; i < t1.length; i++) {
			System.out.println(romanToInt(t1[i]));
		}
	}

}