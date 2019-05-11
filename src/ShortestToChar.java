import java.util.ArrayList;
import java.util.List;

public class ShortestToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] ret = shortestToChar("loveleetcode", 'e');
        for (int i=0; i<ret.length; i++) {
        	System.out.print(ret[i]+" ");
        }
	}

	public static int[] shortestToChar(String S, char C) {
		List<Integer> indexList = new ArrayList<>();
		int[] retList = new int[S.length()];
        for (int i=0; i<S.length(); i++) {
        	if (S.charAt(i) == C) {
        		indexList.add(i);
        	}
        }
        for (int j=0; j<S.length(); j++) {
            if (indexList.size() == 1) {
            	retList[j] = Math.abs(indexList.get(0) - j);
            }else {
            	if (Math.abs(indexList.get(1) - j) < Math.abs(indexList.get(0) - j)) {
            		retList[j] = Math.abs(indexList.get(1) - j);
            		indexList.remove(0);
            	}else {
            		retList[j] = Math.abs(indexList.get(0) - j);
            	}
            }
        }
        return retList;
	}

}
