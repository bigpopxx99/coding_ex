import java.util.HashSet;

public class MorseTranslate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test_words = { "gin", "zen", "gig", "msg" };
		SolutionMorse solutionMorse = new SolutionMorse();
		System.out.println(solutionMorse.uniqueMorseRepresentations(test_words));
	}

}

class SolutionMorse {
	public int uniqueMorseRepresentations(String[] words) {
		if (words == null || words.length == 0) {
			return 0;
		}
		String[] trans_list = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
				"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		HashSet resultSet = new HashSet<String>();
		int count = words.length;
        for (int i=0; i<words.length; i++) {
        	String word = words[i];
        	String morse = "";
        	for (int j=0; j<word.length(); j++) {
        		char letter = word.charAt(j);
        		int index = letter - 'a';
        		morse = morse + trans_list[index];
        	}
        	if (resultSet.contains(morse)) {
        		count--;
        	}else {
        		resultSet.add(morse);
        	}
        }
        return count;
	}
}
