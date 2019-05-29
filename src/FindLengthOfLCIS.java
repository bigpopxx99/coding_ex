
public class FindLengthOfLCIS {
	
    public int findLengthOfLCIS(int[] nums) {
    	if (nums == null || nums.length == 0) {
    		return 0;
    	}
    	if (nums.length == 1) {
    		return 1;
    	}
        int maxLen = 1;
        
        int pIdx = 0;
        int maxOne = 1;
        while (pIdx < nums.length-1) {
        	
        	if (nums[pIdx+1] > nums[pIdx]) {
        		maxOne++;
        		if (maxOne > maxLen) {
        			maxLen = maxOne;
        		}
        		pIdx++;
        	}else {
        		if (maxOne > maxLen) {
        			maxLen = maxOne;
        		}
        		maxOne = 1;
        		pIdx++;   		
        	}
        }
        return maxLen;
    }

	public static void main(String[] args) {
		FindLengthOfLCIS f = new FindLengthOfLCIS();
		System.out.println(f.findLengthOfLCIS(new int[] {1,3,5,7}));
		System.out.println(f.findLengthOfLCIS(new int[] {2,2,2,2,2}));
	}

}
