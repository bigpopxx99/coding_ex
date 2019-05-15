import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		// for (int i=0; i<numbers.length; i++) {
		// if (numbers[i] > target) {
		// break;
		// }
		// for (int j=i+1; j<numbers.length; j++) {
		// if (numbers[i] + numbers[j] == target) {
		// return new int[]{i+1, j+1};
		// }else if (numbers[i] + numbers[j] > target) {
		// break;
		// }
		// }
		// }
		// return null;

		// HashMap<Integer, Integer> hashMap = new HashMap<>();
		// for (int j = 0; j < numbers.length; j++) {
		// if (hashMap.containsKey(target - numbers[j])) {
		// return new int[] { hashMap.get(target - numbers[j]) + 1, j + 1 };
		// } else {
		// hashMap.put(numbers[j], j);
		// }
		//
		// }
		// return null;

		// int start = 0;
		// int end = numbers.length - 1;
		//
		// while(start < end) {
		// int sum = numbers[start] + numbers[end];
		// if (sum > target) {
		// end--;
		// }else if (sum < target) {
		// start++;
		// }else {
		// return new int[]{start+1, end+1};
		// }
		// }
		// return null;

		if (nums.length == 2)
			return new int[] { 1, 2 };
		int left = 0;
		int right = nums.length - 1;
		int mid;
		while (left < right) { // using binary search find the largetst number smaller than target
			mid = left + (right - left) / 2;
			if (nums[mid] == target) {
				left = mid;
				break;
			}
			if (nums[mid] < target)
				left = mid + 1;
			else
				right = mid - 1;
		}
		if (nums[left] == target && nums[left] != 0)
			left--; // in case duplicate 0s;
		right = left;
		left = 0;
		while (nums[left] + nums[right] != target) {
			if (nums[left] + nums[right] > target)
				right--;
			else
				left++;
		}
		int small = (left < right) ? left : right; // when target is zero, left will be larger than right
		int big = (left > right) ? left : right;
		return new int[]{ small + 1, big + 1 };
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t = { 2, 7, 11, 15 };
		int[] ret = twoSum(t, 9);
		System.out.println(ret[0] + " " + ret[1]);
	}

}
