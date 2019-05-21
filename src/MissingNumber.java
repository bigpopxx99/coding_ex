import java.lang.annotation.Target;
import java.util.function.IntPredicate;

public class MissingNumber {

	// public int missingNumber(int[] nums) {
	// if (nums == null || nums.length == 0) {
	// return -1;
	// }
	// boolean isContainMax = false;
	// boolean isContainZero = false;
	// for (int i = 0; i < nums.length; i++) {
	// int targetIndex = Math.abs(nums[i]) == nums.length + 1 ? 0 :
	// Math.abs(nums[i]);
	// if (targetIndex == nums.length) {
	// isContainMax = true;
	// } else {
	// if (nums[targetIndex] == 0) {
	// nums[targetIndex] = (nums.length + 1) * -1;
	// } else {
	// nums[targetIndex] *= -1;
	// }
	// }
	// }
	// if (!isContainMax) {
	// return nums.length;
	// } else {
	// for (int j = 0; j < nums.length; j++) {
	// if (nums[j] >= 0) {
	// return j;
	// }
	// }
	// }
	// return -1;
	// }

	public int missingNumber(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += i - nums[i];
		}
		return sum + nums.length;
	}

	public static void main(String[] args) {
		int[] t1 = { 3, 0, 1 };
		int[] t2 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };

		MissingNumber missingNumber = new MissingNumber();
		System.out.println(missingNumber.missingNumber(t1));
		System.out.println(missingNumber.missingNumber(t2));
	}

}
