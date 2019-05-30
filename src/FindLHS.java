import java.util.Arrays;
import java.util.HashMap;

public class FindLHS {

	public int findLHS(int[] nums) {
		if (nums == null || nums.length <= 1) {
			return 0;
		}
		int max = 0;
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int key = nums[i];
			if (hashMap.containsKey(key)) {
				hashMap.put(key, hashMap.get(key) + 1);
			} else {
				hashMap.put(key, 1);
			}
			if (hashMap.containsKey(key + 1)) {
				int tmp = hashMap.get(key) + hashMap.get(key + 1);
				max = max < tmp ? tmp : max;
			}
			if (hashMap.containsKey(key - 1)) {
				int tmp = hashMap.get(key) + hashMap.get(key - 1);
				max = max < tmp ? tmp : max;
			}
		}

		return max;
	}

	public int findLHS1(int[] nums) {
		if (nums == null || nums.length <= 1) {
			return 0;
		}
		int max = 0;
		Arrays.sort(nums);
		int p1 = 0;
		int p2 = 0;
		int p3 = 1;
		while (p3 < nums.length) {
			if (nums[p3] - nums[p1] == 0) {
				p3++;
			} else if (nums[p3] - nums[p1] == 1) {
				if (p2 == p1) {
					p2 = p3;
				}
				p3++;
			} else {
				if (p2 != p1) {
					int tmp = p3 - p1;
					max = max < tmp ? tmp : max;
				}
				if (nums[p3] - nums[p2] == 1) {
					p1 = p2;
					p2 = p3;
					p3++;
				} else {
					p1 = p3;
					p2 = p3;
					p3++;
				}
			}
		}
		if (nums[p3 - 1] - nums[p1] == 1) {
			int tmp = p3 - p1;
			max = max < tmp ? tmp : max;
		}

		return max;
	}

	public static void main(String[] args) {
		FindLHS findLHS = new FindLHS();
		System.out.println(findLHS.findLHS1(new int[] { 1, 3, 5,5,4 }));
	}

}
