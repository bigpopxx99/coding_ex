import java.util.Arrays;

public class DominantIndex {

	public int dominantIndex(int[] nums) {
		if (nums.length == 1) {
			return 0;
		}
		int index = 1;
		int maxV = nums[0];
		int maxIdx = 0;
		boolean isValid = true;
		while (index < nums.length) {
			int v = nums[index];
			if (v > maxV) {
				isValid = v >= maxV * 2;
				maxV = v;
				maxIdx = index;
			} else {
				if (v*2 > maxV) {
					isValid = false;
				}
			}
			index++;
		}
		if (isValid) {
			return maxIdx;
		}else {
			return -1;
		}
	}

	public static void main(String[] args) {
        int[] t = {0,2,3,0};
        DominantIndex di = new DominantIndex();
        System.out.println(di.dominantIndex(t));
	}

}
