
public class MaxProfit {
/**
 * 设置一个买入时间，一个卖出时间，卖出时间是当天价格低于前一天价格，则计算一次收益为前一天减去买入日，并将当天设置为买入日，下一天为卖出日
 * @param prices
 * @return
 */
	public static int maxProfit(int[] prices) {
		if (prices == null || prices.length < 2) {
			return 0;
		}
		int bIndex = 0;
		int sIndex = 1;
		int days = prices.length;
		int maxOne = 0;
		int sum = 0;
		while (bIndex < days - 1 && sIndex < days) {
			if (prices[sIndex] >= prices[sIndex - 1]) {
				if (sIndex == days - 1) {
					sum += prices[sIndex] - prices[bIndex];
					break;
				} else {
					sIndex++;
				}
			} else {
				sum += prices[sIndex - 1] - prices[bIndex];
				bIndex = sIndex;
				sIndex = bIndex + 1;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t1 = { 2, 1, 5, 4, 8, 9 };
		int[] t2 = { 1, 2, 3, 4, 5 };
		int[] t3 = { 7, 6, 4, 3, 1 };
		int[] t4 = { 7, 1, 5, 3, 6, 4 };
		int[] t5 = { 2, 4, 1 };

		System.out.println(maxProfit(t1));
		System.out.println(maxProfit(t2));
		System.out.println(maxProfit(t3));
		System.out.println(maxProfit(t4));
		System.out.println(maxProfit(t5));
	}

}
