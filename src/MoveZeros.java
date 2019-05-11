import java.util.ArrayList;

public class MoveZeros {
	
    public static void moveZeroes(int[] nums) {
    	if (nums.length == 1) {
    		return;
    	}
    	int zeroNum = 0;
    	int len = nums.length;
    	int index = 0;
    	int exIndex = 0;
        while(exIndex < len) {
        	while (nums[exIndex] == 0 && exIndex < len - 1) {
        		zeroNum++;
        		exIndex++;
        	}
    		if (exIndex >= len) {
    			break;
    		}
        	if (index != exIndex) {
        		nums[index] = nums[exIndex];
        	}
    	    index++;
    	    exIndex++;
        }
        if (zeroNum > 0) {
            for (int j=0; j<zeroNum; j++) {
            	nums[len-1-j] = 0;
            }
        }
    }
    
    private static void printArray(int[] array) {
    	for (int i=0; i<array.length; i++) {
    		System.out.print(array[i]+" ");
    	}
    	System.out.println("");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] t1 = new int[]{0,1,0,3,12};
        moveZeroes(t1);
        printArray(t1);
	}

}
