
public class SearchInsert {

	public int searchInsert(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		return search(nums, target, 0, nums.length - 1);
	}

	private int search(int[] nums, int target, int left, int right) {
		if (target <= nums[left]) {
			return left;
		}
		if (target > nums[right]) {
			return right+1;
		}
		int mid = (left + right) / 2;
		if (target == nums[mid]) {
			return mid;
		} else if (target < nums[mid]) {
			if (left == right) {
				return left;
			} else {
				return search(nums, target, left, mid - 1);
			}
		} else {
			if (left == right) {
				return right + 1;
			} else {
				return search(nums, target, mid + 1, right);
			}
		}
	}

	public static void main(String[] args) {
		int[] t = {1,3,5,6};
		int[] t1 = {3,5,7,9,10};
		SearchInsert si = new SearchInsert();
		System.out.println(si.searchInsert(t, 5));
		System.out.println(si.searchInsert(t, 2));
		System.out.println(si.searchInsert(t, 7));
		System.out.println(si.searchInsert(t1, 8));
		

	}

}
