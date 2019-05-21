import java.util.Arrays;
import java.util.HashMap;

public class FindRelativeRanks {
	
    public String[] findRelativeRanks(int[] nums) {
    	String[] ret = new String[nums.length];
    	HashMap<Integer, Integer> hashMap = new HashMap<>();
    	for (int i=0; i<nums.length; i++) {
    		hashMap.put(nums[i], i);
    	}
        int[] numsSorted = nums;
        Arrays.sort(numsSorted);
        for (int j=0; j<numsSorted.length; j++) {
        	ret[hashMap.get(numsSorted[j])] = getDisplayString(numsSorted.length - j);
        }
        return ret;
    }
    
    public String getDisplayString(int rank) {
    	String ret = null;
    	switch (rank) {
		case 1:
			ret = "Gold Medal";
			break;
		case 2:
			ret = "Silver Medal";
			break;
		case 3:
			ret = "Bronze Medal";
			break;
		default:
			ret = ""+rank;
		}
    	return ret;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] test = {5, 4, 3, 2, 1};
        FindRelativeRanks findRelativeRanks = new FindRelativeRanks();
        String[] ret = findRelativeRanks.findRelativeRanks(test);
	}

}
