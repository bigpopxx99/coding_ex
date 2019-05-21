
public class Search {
	
    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
        	return -1;
        }
        if (target < nums[0] || target > nums[nums.length-1]) {
        	return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
        	int mid = (right+left)/2;
        	if (nums[mid] == target) {
        		return mid;
        	}else if (nums[mid] > target) {
        		right = mid - 1;
        	}else {
        		left = mid + 1;
        	}
        }
        return -1;
    }

	public static void main(String[] args) {
        int[] t1 = {-1,0,3,5,9,12};
        System.out.println(search(t1, 9));
        System.out.println(search(t1, 2));
	}

}
