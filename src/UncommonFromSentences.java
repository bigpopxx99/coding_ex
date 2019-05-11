import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class UncommonFromSentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a1 = "this apple is sweet";
        String b1 = "this apple is sour";
        String a2 = "apple apple";
        String b2 = "banana";
        String[] ret1 = uncommonFromSentences(a1, b1);
        String[] ret2 = uncommonFromSentences(a2, b2);
	}

	public static String[] uncommonFromSentences(String A, String B) {
        if (A.length() == 0 && B.length() == 0) {
        	return new String[]{};
        }
        String total = A + " " + B;
        String[] list = total.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i<list.length; i++) {
        	if (map.containsKey(list[i])) {
        		map.put(list[i], map.get(list[i])+1);
        	}else {
        		map.put(list[i], 1);
        	}
        }
        List<String> retList = new ArrayList<>();
        for (String key: map.keySet()) {
        	if (map.get(key) == 1) {
        		retList.add(key);
        	}
        }
        String[] ret = new String[retList.size()];
        for (int j=0; j<retList.size(); j++) {
        	ret[j] = retList.get(j);
        }
        return ret; 
	}

}
