import java.util.Arrays;
import java.util.HashMap;

public class IsAnagram {
	
    public static boolean isAnagram(String s, String t) {
    	if (s == null 
    			|| t == null
    			|| s.length() != t.length()) {
    		return false;
    	}
    	if (s.length() == 0) return true;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
        	if (hashMap.containsKey(s.charAt(i))) {
        		hashMap.put(s.charAt(i), hashMap.get(s.charAt(i))+1);
        	}else {
        		hashMap.put(s.charAt(i), 1);
        	}
        }
        for (int j=0; j<t.length(); j++) {
        	if (!hashMap.containsKey(t.charAt(j))) {
        		return false;
        	}else {
        		if (hashMap.get(t.charAt(j)) == 1) {
        			hashMap.remove(t.charAt(j));
        		}else {
        			hashMap.put(t.charAt(j), hashMap.get(t.charAt(j))-1);
        		}
        	}
        }
        return true;
    }
    
    public static boolean isAnagram2(String s, String t) {
    	if (s == null 
    			|| t == null
    			|| s.length() != t.length()) {
    		return false;
    	}
    	if (s.length() == 0) return true;
    	char[] sArray = s.toCharArray();
    	char[] tArray = t.toCharArray();
    	Arrays.sort(sArray);
    	Arrays.sort(tArray);
    	String sNew = new String(sArray);
    	String tNew = new String(tArray);
    	return sNew.equals(tNew);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "aabb";
        String t = "bbaa";
        
        System.out.println(isAnagram2(s, t));
	}

}
