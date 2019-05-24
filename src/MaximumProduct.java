import java.util.Arrays;

public class MaximumProduct {

	public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int lastIdx = nums.length - 1;
        return Math.max(nums[lastIdx]*nums[lastIdx-1]*nums[lastIdx-2], nums[0]*nums[1]*nums[lastIdx]);
    }

	public static void main(String[] args) {
        int[] t1 = {1,2,3};
        int[] t2 = {1,2,3,4};
        int[] t3 = {-10,0,3,4};
        MaximumProduct m = new MaximumProduct();
        System.out.println(m.maximumProduct(t1));
        System.out.println(m.maximumProduct(t2));
        System.out.println(m.maximumProduct(t3));
	}

}
