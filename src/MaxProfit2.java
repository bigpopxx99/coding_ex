import java.security.PermissionCollection;

public class MaxProfit2 {

	/**
	 * 这个题目和MaxProfit那道题很类似，但是只可以交易一手，算出最大的profit，相当于是找出最小值和最大值，且最大值的索引大于最小值，算法并不比MaxProfit简单
	 * 思路是使用3个指针，从左到右遍历一次数组，一个总是指向最小值，一个总是指向最大值，一个用来探路，在三个值之间判断该何时记录最大值，何时结束。
	 * 
	 * @param prices
	 * @return
	 */
//    public int maxProfit(int[] prices) {
//		if (prices == null || prices.length == 0) {
//			return 0;
//		}
//		int maxV = 0;
//		int pIdx = 0;
//		while (pIdx < prices.length - 1) {
//			if (prices[pIdx + 1] <= prices[pIdx]) {
//				pIdx++;
//			} else {
//				int rightMaxIdx = getMaxValueIndex(prices, pIdx + 1, prices.length - 1);
//				int diff = prices[rightMaxIdx] - prices[pIdx];
//				if (diff > maxV) {
//					maxV = diff;
//				}
//				int leftMinIdx = getMinValueIndex(prices, pIdx+2, rightMaxIdx-1);
//				if (leftMinIdx != -1 && prices[leftMinIdx] < prices[pIdx]) {
//					diff = prices[rightMaxIdx] - prices[leftMinIdx];
//					if (diff > maxV) {
//						maxV = diff;
//					}
//				}
//				pIdx = rightMaxIdx+1;
//			}
//		}
//		return maxV;
//    }
//    
//    public int getMinValueIndex(int[] prices, int left, int right) {
//    	if (left > right) {
//    		return -1;
//    	}
//    	if (left == right) {
//    		return left;
//    	}
//    	int minIdx = left;
//    	for (int i=left; i<= right; i++) {
//    		if (prices[i] < prices[minIdx]) {
//    			minIdx = i;
//    		}
//    	}
//    	return minIdx;
//    }
//    
//    public int getMaxValueIndex(int[] prices, int left, int right) {
//    	if (left > right) {
//    		return -1;
//    	}
//    	if (left == right) {
//    		return left;
//    	}
//    	int maxIdx = left;
//    	for (int i=left; i<= right; i++) {
//    		if (prices[i] >= prices[maxIdx]) {
//    			maxIdx = i;
//    		}
//    	}
//    	return maxIdx;
//    }
	
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length < 2) {
			return 0;
		}
		int maxV = 0;
		int minP = 0;
		int maxP = 0;
		int curP = 1;
		int lastIdx = prices.length - 1;
		while(curP <= lastIdx) {
			if (prices[curP] <= prices[minP]) {
				if (maxP > minP) {
					int diff = prices[maxP] - prices[minP];
					if (diff > maxV) {
						maxV = diff;
					}
				}
				minP = curP;
				maxP = curP;
				curP++;
			}else if (prices[curP] >= prices[maxP]) {
				maxP = curP;
				curP++;
			}else {
				curP++;
			}
		}
		int diff = prices[maxP] - prices[minP];
		if (diff > maxV) {
			maxV = diff;
		}
		return maxV;
	}

	public static void main(String[] args) {
		int[] t1 = { 7, 1, 5, 3, 6, 4 };
		int[] t2 = { 7, 6, 4, 3, 1 };
		int[] t3 = { 2, 4, 1, 7 };
		int[] t4 = { 3, 3 };
		int[] t5 = {2,1,2,1,0,1,2};
		int[] t6 = {3,3,5,0,0,3,1,4};
		int[] t7 = {0,8,5,7,4,7};
		MaxProfit2 maxProfit2 = new MaxProfit2();
		System.out.println(maxProfit2.maxProfit(t1));
		System.out.println(maxProfit2.maxProfit(t2));
		System.out.println(maxProfit2.maxProfit(t3));
		System.out.println(maxProfit2.maxProfit(t4));
		System.out.println(maxProfit2.maxProfit(t5));
		System.out.println(maxProfit2.maxProfit(t6));
		System.out.println(maxProfit2.maxProfit(t7));
	}

}
