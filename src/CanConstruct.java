import java.security.cert.CertPathValidatorException.Reason;
import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;

public class CanConstruct {
	
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || magazine == null || ransomNote.length() > magazine.length()) {
        	return false;
        }
        int[] letters = new int[26];
        for (int i=0; i<magazine.length(); i++) {
        	letters[magazine.charAt(i)-'a'] += 1;
        }
        for (int j=0; j<ransomNote.length(); j++) {
        	int index = ransomNote.charAt(j) - 'a';
        	if (letters[index] == 0) {
        		return false;
        	}else {
            	letters[index] -= 1;
        	}
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
        System.out.println(canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
        
	}
}

