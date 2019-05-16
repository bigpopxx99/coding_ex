import java.util.Arrays;

public class MinMoves {
	
//    public static int minMoves(int[] nums) {
//        if (nums == null || nums.length < 2) {
//        	return 0;
//        }
//        Arrays.sort(nums);
//        int distSum = 0;
//        for (int i=1; i<nums.length; i++) {
//        	distSum += (nums[i]-nums[0]);
//        }
//        return distSum;
//    }
    
	//先遍历一次，找出最小值O(n),在用所有数减去最小值求和O(n),综合下来还是O(n), 
	//而采用先排序，再遍历数组，用所有值减去第一个的时间复杂度，因为排序被拉到了至少O(nlgn)的时间复杂度，所以会慢一些
    public static int minMoves(int[] nums) {
        if (nums == null || nums.length < 2) {
        	return 0;
        }
        if (nums.length == 2) {
        	return Math.abs(nums[1]-nums[0]);
        }
        int minV = nums[0];
        for (int i=1; i<nums.length; i++) {
        	minV = Math.min(minV, nums[i]);
        }
        int disSum = 0;
        for (int j=0; j<nums.length; j++) {
        	disSum += (nums[j] - minV);
        }
        return disSum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] t1 = {1,2,3};
        int[] t2 = {1,2,3,4};
        int[] t3 = {1,3,5,7};
        
        System.out.println(minMoves(t1));
        System.out.println(minMoves(t2));
        System.out.println(minMoves(t3));
        
	}

}
