
public class FindMaxAverage {

	int max = Integer.MIN_VALUE;

	public double findMaxAverage(int[] nums, int k) {
	    int maxSum = 0, n = nums.length;
	    for (int i=0;i<k;i++) maxSum += nums[i];
	    int curSum = maxSum;
	    for (int i=k;i<n;i++) {
	        curSum = curSum -  nums[i-k] + nums[i];
	        maxSum = Math.max(maxSum, curSum);
	    }
	    return ((double) maxSum)/((double) k);
	}

	public static void main(String[] args) {
		int[] t = {-1};
		int k = 1;
		FindMaxAverage fma = new FindMaxAverage();
		System.out.println(fma.findMaxAverage(t, k));

	}

}
