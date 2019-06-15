
public class RemoveDuplicates {

	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return 1;
		}
		int prev = 0;
		int index = 0;
		int ret = 1;
		while (index < nums.length) {
			if (nums[index] != nums[prev]) {
				ret++;
				if (index != prev + 1) {
					int tmp = nums[index];
					nums[index] = nums[prev + 1];
					nums[prev + 1] = tmp;
				}
				prev++;
			}
			index++;
		}
		return ret;
	}

	public static void main(String[] args) {
		int[][] t = { { 1, 2, 2 }, { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }, { 1, 1, 1 },{},{1,2},{1,1},{1} };
		RemoveDuplicates rd = new RemoveDuplicates();
		for (int i = 0; i < t.length; i++) {
			System.out.print(rd.removeDuplicates(t[i])+" ");
			Utils.printArray(t[i]);
		}

	}

}
