
public class RemoveElement {

	public int removeElement(int[] nums, int val) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return nums[0] == val ? 0 : 1;
		}
		int left = 0;
		int right = nums.length - 1;
		int ret = 0;
		while (left < right) {
			if (nums[left] != val) {
				left++;
				ret++;
			} else {
				while (right > left && nums[right] == val) {
					right--;
				}
				if (right > left) {
					int tmp = nums[left];
					nums[left] = nums[right];
					nums[right] = tmp;
					left++;
					right--;
					ret++;
				}
			}
		}
		if (nums[left] != val) {
			ret++;
		}
		return ret;
	}

	public static void main(String[] args) {
		RemoveElement r = new RemoveElement();
		int[] t = new int[] { 3,2,2,3,3,1,4,2 };
		System.out.println(r.removeElement(t, 2));
	}

}
