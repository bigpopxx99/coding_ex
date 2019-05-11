import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class Intersesection {
	
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i=0; i<nums1.length; i++) {
        	set1.add(nums1[i]);
        }
        for (int j=0; j<nums2.length; j++) {
        	if (set1.contains(nums2[j])) {
        		set2.add(nums2[j]);
        	}
        }
        int[] ret = new int[set2.size()];
        Iterator<Integer> iterator = set2.iterator();
        for (int k=0; k<ret.length; k++) {
        	ret[k] = iterator.next().intValue();
        }
    	
        return ret;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] t1 = new int[]{1,2,2,1};
        int[] t2 = new int[]{2,2};
        int[] ret1 = intersection(t1, t2);
        
        int[] t3 = new int[]{4,9,5};
        int[] t4 = new int[]{9,4,9,8,4};
        int[] ret2 = intersection(t3, t4);
	}

}
