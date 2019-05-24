import java.util.ArrayList;
import java.util.Arrays;

public class KthLargest {

	private ArrayList<Integer> mList = new ArrayList<>();
	private int kth = 0;

	public KthLargest(int k, int[] nums) {
		if (nums == null || k < 0) {
			return;
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			mList.add(nums[i]);
		}
		kth = k;
	}

	public int add(int val) {		
		if (mList.size() == 0) {
			mList.add(val);
		} else {
			int left = mList.size() > kth ? mList.size() - kth : 0;
			int right = mList.size() - 1;
			while (left <= right) {
				if (left == right) {
					if (val <= mList.get(left)) {
						mList.add(left, val);
					} else {
						mList.add(left + 1, val);
					}
					break;
				}
				if (val >= mList.get(right)) {
					mList.add(right+1, val);
					break;
				} else if (val <= mList.get(left)) {
					mList.add(left, val);
					break;
				}
				int mid = (left + right) / 2;
				if (mList.get(mid) < val) {
					left = mid + 1;
				} else if (mList.get(mid) > val) {
					right = mid - 1;
				} else {
					mList.add(mid, val);
					break;
				}
			}

		}
		return mList.get(mList.size() - kth);
	}

	public static void main(String[] args) {
		int k = 7;
		int[] arr = { -10, 1, 3, 1, 4, 10, 3, 9, 4, 5, 1 };
		int[] ad = {3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
		KthLargest kthLargest = new KthLargest(k, arr);
		for (int i = 0; i < ad.length; i++) {
			System.out.print(kthLargest.add(ad[i])+",");
		}

	}

}
