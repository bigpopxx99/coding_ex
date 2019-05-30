
public class MaxSubArray {
	
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
        	return 0;
        }
        if (nums.length == 1) {
        	return nums[0];
        }
        int pIdx = 0;
        int sum = 0;
        int max = nums[0];
        while (pIdx < nums.length) {
        	int v = nums[pIdx];
        	int tmp = sum + v;
        	if (tmp > 0) {
        		sum = sum + v;
        		max = max >= sum ? max : sum;
        	}else {
        		sum = 0;
        		max = max >= v ? max: v;
        	}
        	pIdx++;
        }
        return max;
    }
    
    public int maxSubArray2(int[] nums) {
        
        return dq(nums, 0, nums.length-1);
    }
    
    private int dq(int[] nums, int left, int right) {
    	if (left == right) {
    		return nums[left];
    	}
    	int mid = (left+right)/2;
    	int leftMax = dq(nums, left, mid);
    	int rightMax = dq(nums,mid+1, right);
    	int sum = 0;
    	int leftV = nums[mid];
    	int rightV = nums[mid+1];
    	for (int i=mid; i>=left; i--) {
    		sum += nums[i];
    		if (sum > leftV) {
    			leftV = sum;
    		}
    	}
    	sum = 0;
    	for (int i=mid+1; i<=right; i++) {
    		sum += nums[i];
    		if (sum > rightV) {
    			rightV = sum;
    		}
    	}
    	return Math.max(Math.max(leftMax, rightMax), leftV+rightV);
    }

	public static void main(String[] args) {
		MaxSubArray m = new MaxSubArray();
		System.out.println(m.maxSubArray2(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
		System.out.println(m.maxSubArray2(new int[] {-6,-5,10,-1,12}));

	}

}
