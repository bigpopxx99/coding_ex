import java.util.Random;

public class CanThreePartsEqualSum {
	
	private static int getSum(int[] A, int start, int end) {
		int sum = 0;
		for (int i=start; i<end+1; i++) {
			sum += A[i];
		}
		return sum;
	}
	/**
	 * 如果采用遍历所有可能的分三组情况，时间成本是n的平方，根据问题特点，每一份应该都是总和除以3，加上剪枝操作，时间成本可以控制在n
	 * 
	 * */
    public static boolean canThreePartsEqualSum(int[] A) {
        int len = A.length;
        int totalSum = getSum(A, 0, len-1);
        if (totalSum % 3 != 0) {
        	return false;
        }
        int oneOfThree = totalSum / 3;
        int fIndex = 0;
        int bIndex = len-1;
        int fSum = 0;
        int bSum = 0;
        boolean isFrontOk = false;
        boolean isBackOk = false;
        while (fIndex <= bIndex - 2) {
        	if (!isFrontOk) {
        	    fSum = getSum(A, 0, fIndex);
        	    if (fSum != oneOfThree) {
        	    	fIndex++;
        	    }else {
        	    	isFrontOk = true;
        	    }
        	}
        	if (!isBackOk) {
        		bSum = getSum(A, bIndex, len-1);
        		if (bSum != oneOfThree) {
        			bIndex--;
        		}else {
        			isBackOk = true;
        		}
        	}
        	if (isFrontOk && isBackOk) {
        		return true;
        	}
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] t1 = new int[] {0,2,1,-6,6,-7,9,1,2,0,1};
        int[] t2 = new int[] {0,2,1,-6,6,7,9,-1,2,0,1};
        int[] t3 = new int[] {3,3,6,5,-2,2,5,1,-9,4};
        int[] t4 = new int[50000];
        Random random = new Random(System.currentTimeMillis());
        for (int i=0; i<50000; i++) {
        	t4[i] = random.nextInt(20000)-10000;
        }
        System.out.println(canThreePartsEqualSum(t1));
        System.out.println(canThreePartsEqualSum(t2));
        System.out.println(canThreePartsEqualSum(t3));
        long startTime = System.currentTimeMillis();
        System.out.println(canThreePartsEqualSum(t4));
        System.out.println("used time:"+(System.currentTimeMillis()-startTime));
	}

}
