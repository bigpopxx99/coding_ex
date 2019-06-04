public class PivotIndex {
	
    public int pivotIndex(int[] nums) {
    	if (nums == null || nums.length <= 2) {
    		return -1;
    	}
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
        	sum += nums[i];
        }
        int sum2 = 0;
        for (int j=0; j<nums.length; j++) {
        	if (Math.abs((sum-nums[j])/2.0 - sum2) < 0.000000001) {
        		return j;
        	}
        	sum2 += nums[j];
        }
        return -1;
    }

	public static void main(String[] args) {
		int[] t = {1,-1,1};
		PivotIndex pi = new PivotIndex();
		System.out.println(pi.pivotIndex(t));

	}

}
