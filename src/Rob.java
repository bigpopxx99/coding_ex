
public class Rob {
	
	private int[] mArray; 
	
    public int rob(int[] nums) {
    	if (nums == null || nums.length == 0) {
    		return 0;
    	}
    	if (nums.length == 1) {
    		return nums[0];
    	}
    	if (nums.length == 2) {
    		return Math.max(nums[0], nums[1]);
    	}
    	mArray = new int[nums.length];
    	for (int i=0; i<nums.length; i++) {
    		mArray[i] = -1;
    	}
    	for (int i=0; i<nums.length; i++) {
    		getValue(nums, i);
    	}
        return Math.max(mArray[nums.length-1], mArray[nums.length-2]);
    }
    
    private int getValue(int[] nums, int index) {
    	if (index < 0) {
    		return 0;
    	}
    	if (mArray[index] >= 0) {
    		return mArray[index];
    	}
        int sum =  nums[index] + Math.max(getValue(nums, index-2), getValue(nums, index-3));
        mArray[index] = sum;
        return sum;
    }

	public static void main(String[] args) {
        Rob r = new Rob();
        int[] t1 = {1,3,1};
        int[] t2 = {2,7,9,3,1};
        int[] t3 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(r.rob(t1));
        System.out.println(r.rob(t2));
        System.out.println(r.rob(t3));
	}

}
