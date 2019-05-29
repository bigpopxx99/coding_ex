import java.util.HashMap;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//Example:
//
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].

public class TwoSum2 {
	
    public int[] twoSum(int[] nums, int target) {
    	if (nums == null || nums.length <= 1) {
    		return new int[] {};
    	}
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(nums[0], 0);
        for (int i=1; i<nums.length; i++) {
        	if (hashMap.containsKey(target-nums[i])) {
        		return new int[] {hashMap.get(target-nums[i]), i};
        	}else {
        		hashMap.put(nums[i], i);
        	}
        }
        return new int[] {};
    }

	public static void main(String[] args) {
        TwoSum2 t = new TwoSum2();
        int[] ret = t.twoSum(new int[] {2,7,11,15}, 13);
        Utils.printArray(ret);
	}

}
