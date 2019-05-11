import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
	
    public static List<Integer> findDisappearedNumbers(int[] nums) {
    	List<Integer> ret = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
        	nums[Math.abs(nums[i])-1] = - Math.abs(nums[Math.abs(nums[i])-1]);
        }
        
        for (int j=0; j<nums.length; j++) {
        	if (nums[j] > 0) {
        		ret.add(j+1);
        	}
        }
        return ret;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] t1 = new int[]{1,1,1,1,1,1,1,1};
        List<Integer> ret = findDisappearedNumbers(t1);
        for (int i=0; i<ret.size(); i++) {
        	System.out.print(ret.get(i)+" ");
        }
	}

}
