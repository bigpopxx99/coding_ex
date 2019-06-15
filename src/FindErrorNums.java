import java.util.Arrays;
import java.util.HashSet;

public class FindErrorNums {

	public int[] findErrorNums(int[] nums) {
		int len = nums.length;
		int sumTotal = len * (len + 1) / 2;
		int sumCur = 0;
		int[] ret = { 0, 0 };
		HashSet<Integer> hashSet = new HashSet<Integer>();
		boolean isFind = false;
		for (int i = 0; i < nums.length; i++) {
			sumCur += nums[i];
			if (!isFind) {
				if (hashSet.contains(nums[i])) {
					ret[0] = nums[i];
					isFind = true;
				} else {
					hashSet.add(nums[i]);
				}
			}
		}
		ret[1] = sumTotal - sumCur + ret[0];
		return ret;
	}
	
	public int[] findErrorNums2(int[] nums) {
		int[] ret = {0,0};
		Arrays.sort(nums);
		if (nums[0] != 1) {
			ret[1] = 1;
		}
		for (int i=1; i<nums.length; i++) {
			if (nums[i] == nums[i-1]) {
				ret[0] = nums[i];
			}else if (nums[i] - nums[i-1] > 1) {
				ret[1] = nums[i] - 1;
			}
			if (ret[0] != 0 && ret[1] != 0) {
				break;
			}
		}
		if (ret[0] != 0 && ret[1] != 0) {
			return ret;
		}else {
			ret[1] = nums.length;
			return ret;
		}
	}
	
	public int[] findErrorNums3(int[] nums) {
		int[] ret = {0,0};
		int[] array = new int[nums.length];
		for (int i=0; i<nums.length; i++) {
			if (array[nums[i]-1] == 1) {
				ret[0] = nums[i];
			}else {
				array[nums[i]-1] = 1;
			}
		}
		for (int i=0; i<array.length; i++) {
			if (array[i] == 0) {
				ret[1] = i+1;
				return ret;
			}
		}
		return ret;
	}

	public static void main(String[] args) {
        int[] t = {1,2,2,3};
        FindErrorNums fen = new FindErrorNums();
        Utils.printArray(fen.findErrorNums3(t));
	}

}
