import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] test1 = {"Hello", "Alaska", "Dad", "Peace"};
        String[] test2 = {"abdfs", "cccd", "a", "qwwewm"};
        String[] test3 = {"asdfghjkl", "qwertyuiop", "zxcvbnm"};
        String[] ret1 = findWords(test1);
        String[] ret2 = findWords(test2);
        String[] ret3 = findWords(test3);
}
	
    public static String[] findWords(String[] words) {
        HashMap<Character, Integer> wordMap = new HashMap<>();
        wordMap.put('a', 2);
        wordMap.put('b', 3);
        wordMap.put('c', 3);
        wordMap.put('d', 2);
        wordMap.put('e', 1);
        wordMap.put('f', 2);
        wordMap.put('g', 2);
        wordMap.put('h', 2);
        wordMap.put('i', 1);
        wordMap.put('j', 2);
        wordMap.put('k', 2);
        wordMap.put('l', 2);
        wordMap.put('m', 3);
        wordMap.put('n', 3);
        wordMap.put('o', 1);
        wordMap.put('p', 1);
        wordMap.put('q', 1);
        wordMap.put('r', 1);
        wordMap.put('s', 2);
        wordMap.put('t', 1);
        wordMap.put('u', 1);
        wordMap.put('v', 3);
        wordMap.put('w', 1);
        wordMap.put('x', 3);
        wordMap.put('y', 1);
        wordMap.put('z', 3);
        List<String> retList = new ArrayList<>();
        for (int i=0; i<words.length; i++) {
        	boolean isSame = true;
        	for (int j=0; j<words[i].length()-1; j++) {
        		if (wordMap.get(words[i].toLowerCase().charAt(j)) != wordMap.get(words[i].toLowerCase().charAt(j+1))) {
        			isSame = false;
        			break;
        		}
        	}
        	if (isSame) {
        		retList.add(words[i]);
        	}
        }
        String[] ret = new String[retList.size()];
        for (int k=0; k<retList.size(); k++) {
        	ret[k] = retList.get(k);
        }
        return ret;
    }

}
