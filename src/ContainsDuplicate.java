import java.util.HashSet;

public class ContainsDuplicate {
/**
 * 利用hashset的唯一性，如果后续插入的前面已经有了，说明至少有一个是重复的，最差O(n)
 * @param nums
 * @return
 */
	public static boolean containsDuplicate(int[] nums) {
		if (nums == null || nums.length < 2) {
			return false;
		}
		HashSet<Integer> hashSet = new HashSet<>();
		for (int i=0; i<nums.length; i++) {
			if (!hashSet.contains(nums[i])) {
				hashSet.add(nums[i]);
			}else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] t1 = {1,1,1,3,3,4,3,2,4,2};
        int[] t2 = {1,2,3,4};
        int[] t3 = {1,2,3,1};
        System.out.println(containsDuplicate(t1));
        System.out.println(containsDuplicate(t2));
        System.out.println(containsDuplicate(t3));
	}

}
