
public class FindMaxConsecutiveOnes {
	
    public static int findMaxConsecutiveOnes(int[] nums) {
    	int cstTimes = 0;
    	int max = 0;
        for (int i=0; i<nums.length; i++) {
        	if (nums[i] == 1) {
        		cstTimes++;
        		if (cstTimes > max) {
        			max = cstTimes;
        		}
        	}else {
        		cstTimes = 0;
        	}
        }
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] t1 = new int[] {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(t1));
	}

}
