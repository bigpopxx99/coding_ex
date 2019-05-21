import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Intersect {

//	public int[] intersect(int[] nums1, int[] nums2) {
//		if (nums1 == null || nums2 == null)  {
//			return null;
//		}
//		if (nums1.length == 0 || nums2.length == 0) {
//			return new int[]{};
//		}
//		ArrayList<Integer> list = new ArrayList<>();
//		Arrays.sort(nums1);
//		Arrays.sort(nums2);
//		int p1 = 0;
//		int p2 = 0;
//		while (p1 < nums1.length && p2 < nums2.length) {
//            if (nums1[p1] == nums2[p2]) {
//            	list.add(nums1[p1]);
//            	p1++;
//            	p2++;
//            }else if (nums1[p1] > nums2[p2]) {
//            	p2++;
//            }else if (nums1[p1] < nums2[p2]) {
//            	p1++;
//            }
//		}
//		int[] ret = new int[list.size()];
//		for (int j=0; j<list.size(); j++) {
//			ret[j] = list.get(j);
//		}
//		return ret;
//	}
	
	public int[] intersect(int[] nums1, int[] nums2) {
		if (nums1 == null || nums2 == null)  {
			return null;
		}
		if (nums1.length == 0 || nums2.length == 0) {
			return new int[]{};
		}
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i=0; i<nums1.length; i++) {
			int key = nums1[i];
			if (hashMap.containsKey(key)) {
				hashMap.put(key, hashMap.get(key)+1);
			}else {
				hashMap.put(key, 1);
			}
		}
		for (int j=0; j<nums2.length; j++) {
			int key = nums2[j];
			if (hashMap.containsKey(key)) {
				list.add(key);
				int v = hashMap.get(key);
				if (v > 1) {
					hashMap.put(key, v-1);
				}else {
					hashMap.remove(key);
				}
			}
		}
		int[] ret = new int[list.size()];
		for (int k=0; k<list.size(); k++) {
			ret[k] = list.get(k);
		}
		return ret;
	}

	public static void main(String[] args) {
        int[] t1 = {1,2,2,1};
        int[] t2 = {2,2};
        int[] t3 = {4,9,5};
        int[] t4 = {9,4,9,8,4};
        Intersect intersect = new Intersect();
        int[] ret1 = intersect.intersect(t1, t2);
        int[] ret3 = intersect.intersect(t3, t4);
	}

}
