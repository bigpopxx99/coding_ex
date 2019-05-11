import java.util.ArrayList;

public class FindTheDifference {
	
    public static char findTheDifference(String s, String t) {
        if (s == null || t == null || t.length() == 0 || t.length()-s.length() != 1) {
        	return 0;
        }
        int sumS = 0;
        int sumT = 0;
        for (int i=0; i<t.length(); i++) {
        	if (i < t.length()-1) {
        		sumS += s.charAt(i) - 'a';
        	}
        	sumT += t.charAt(i) - 'a';
        }
        return (char) ((sumT-sumS) + 'a');
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1 = "abcd";
        String t1 = "abecd";
        System.out.println(findTheDifference(s1, t1));
	}

}
