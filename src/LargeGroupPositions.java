import java.util.ArrayList;
import java.util.List;

public class LargeGroupPositions {
	
    public List<List<Integer>> largeGroupPositions(String S) {
    	if (S == null || S.length() == 0) {
    		return null;
    	}
    	List<List<Integer>> lists = new ArrayList<List<Integer>>();
    	int start = 0;
    	int end = 0;
    	char curChar = S.charAt(0);
    	
    	for (int i=1; i<S.length(); i++) {
    		if (S.charAt(i) == curChar) {
    			end = i;
    		}else {
    			if (end - start >= 2) {
    				List<Integer> list = new ArrayList<>();
    				list.add(start);
    				list.add(end);
    				lists.add(list);
    			}
				start = i;
				end = i;
				curChar = S.charAt(i);
    		}
    	}
		if (end - start >= 2) {
			List<Integer> list = new ArrayList<>();
			list.add(start);
			list.add(end);
			lists.add(list);
		}
    	return lists;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LargeGroupPositions largeGroupPositions = new LargeGroupPositions();
        List<List<Integer>> ret = largeGroupPositions.largeGroupPositions("aaa");
	}

}
