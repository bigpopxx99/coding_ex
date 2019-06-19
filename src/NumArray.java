import java.util.ArrayList;

public class NumArray {
	
    private ArrayList<Integer> mList;

    public NumArray(int[] nums) {
        mList = new ArrayList<>();
        int start = 0;
        for (int i=0; i<nums.length; i++){
            mList.add(start+nums[i]);
            start = mList.get(i);
        }
    }
    
    public int sumRange(int i, int j) {
        if (i == 0){
            return mList.get(j);
        }else{
            return mList.get(j) - mList.get(i-1); 
        }
    }

	public static void main(String[] args) {
        NumArray na = new NumArray(new int[] {-2, 0, 3, -5, 2, -1});
        System.out.println(na.sumRange(0, 5));
	}

}
