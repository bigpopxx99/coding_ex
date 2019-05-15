import java.util.ArrayList;
import java.util.HashMap;

public class FindShortestSubArray {
	
    public static int findShortestSubArray(int[] nums) {
    	if (nums == null || nums.length == 0) {
    		return 0;
    	}
    	if (nums.length == 1) {
    		return 1;
    	}
        HashMap<Integer, int[]> hashMap = new HashMap<>();
        int maxV = 1;
        ArrayList<Integer> maxList = new ArrayList<>();
        int maxKey = nums[0];
        maxList.add(nums[0]);
        for (int i=0; i<nums.length; i++) {
        	if (hashMap.containsKey(nums[i])) {
        		int key = nums[i];
        		int[] keyInfo = hashMap.get(key);
        		keyInfo[1] = i;
        		int times = keyInfo[2] + 1;
        		if (times > maxV) {
        			maxV = times;
        			maxKey = key;
        		}else if (times == maxV) {
        			int[] oldInfo = hashMap.get(maxKey);
        			int[] newInfo = hashMap.get(key);
        			if (oldInfo[1] - oldInfo[0] > newInfo[1] - newInfo[0]) {
        				maxKey = key;
        			}
        		}
        		keyInfo[2] = times;
        		hashMap.put(nums[i], keyInfo);
        	}else {
        		int[] info = {i, i, 1};
        		hashMap.put(nums[i], info);
        	}
        }
        int[] finalInfo = hashMap.get(maxKey);
        
        return finalInfo[1] - finalInfo[0] + 1;
    }

	public static void main(String[] args) {
        int[] t1 = {1, 2, 2, 3, 1};
        int[] t2 = {1,2,2,3,1,4,2};
        int[] t3 = {2,1,1,2,1,3,3,3,1,3,1,3,2};
        int[] t4 = {2,1};
//        System.out.println(findShortestSubArray(t1));
//        System.out.println(findShortestSubArray(t2));
//        System.out.println(findShortestSubArray(t3));
        System.out.println(findShortestSubArray(t4));
	}

}
