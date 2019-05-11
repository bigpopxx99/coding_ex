
public class DetectCapitalUse {

	public static boolean detectCapitalUse(String word) {
        if (word != null 
        		&& (word.length() == 1
        		    || word.toUpperCase().equals(word) 
        		    || (word.substring(0, 1) + word.substring(1, word.length()).toLowerCase()).equals(word))) {
        	return true;
        }
        return false;
	}
	
	public static boolean detectCapitalUse2(String word) {
        int captialNum = 0;
        boolean isFirstCaptial = false;
        for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
				if (i == 0) { 
				    isFirstCaptial = true;
				}
				captialNum++;
			}
		}
        if ((isFirstCaptial && captialNum == 1)
        		|| captialNum == 0
        		|| captialNum == word.length()) {
        	return true;
        }
        return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test1 = { "USA", "leetcode", "Google", "FlaG", "aBUSE", "AcAe" };
		for (int i = 0; i < test1.length; i++) {
			System.out.println(test1[i] + " " + detectCapitalUse(test1[i]));
		}
	}

}
