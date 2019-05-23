
public class MinCostClimbingStairs {

	/**
	 * 递归方式实现，仿照上楼梯左右可能性的思路，容易理解，但是时间太慢，需要优化。
	 * 优化方式主要是把其中已经计算出来的某一层台阶的最小成本记录起来，下次用就不需要再次递归求值了，这样可以满足要求
	 * 
	 * @param cost
	 * @return
	 */
	public int minCostClimbingStairs(int[] cost) {
		int[] minCost = new int[cost.length];
		for (int i=0; i<minCost.length; i++) {
			minCost[i] = -1;
		}
		minCost[0] = cost[0];
		minCost[1] = cost[1];
		return getMinSum(cost, minCost, cost.length);
	}

	public int getMinSum(int[] cost, int[] minCost, int layer) {
		if (layer == 0) {
			return minCost[0];
		}
		if (layer == 1) {
			return minCost[1];
		}
		if (minCost[layer-1] == -1) {
		minCost[layer-1] = getMinSum(cost, minCost, layer-1);
		}
		if (minCost[layer-2] == -2) {
		minCost[layer-2] = getMinSum(cost, minCost, layer-2);
		}
		if (layer == cost.length) {
			return 0 + Math.min(minCost[layer-1], minCost[layer-2]);
		} else {
			return cost[layer] + Math.min(minCost[layer-1], minCost[layer-2]);
		}
	}

	/**
	 * 贪婪算法,不可行，实际上看，还是正向的递归
	 * 
	 * @param cost
	 * @return
	 */
	public int minCostClimbingStairs2(int[] cost) {
		int sum = 0;
		int lastIdx = cost.length - 1;
		int pIdx = -1;
		while (pIdx <= lastIdx) {
			if (pIdx == lastIdx || pIdx == lastIdx - 1) {
				break;
			}
			int prob1 = Math.min(getCost(cost, pIdx + 2), getCost(cost, pIdx + 3));
			int prob2 = Math.min(getCost(cost, pIdx + 3), getCost(cost, pIdx + 4));
			if (cost[pIdx + 1] + prob1 < cost[pIdx + 2] + prob2) {
				sum += cost[pIdx + 1];
				pIdx += 1;
			} else {
				sum += cost[pIdx + 2];
				pIdx += 2;
			}

		}
		return sum;
	}

	private int getCost(int[] cost, int index) {
		if (index > cost.length - 1) {
			return 0;
		}
		return cost[index];
	}

	public static void main(String[] args) {
		int[] t1 = { 10, 15, 1 };
		int[] t2 = { 1, 0, 2, 2 };
		int[] t3 = { 841, 462, 566, 398, 243, 248, 238, 650, 989, 576, 361, 126, 334, 729, 446, 897, 953, 38, 195, 679,
				65, 707, 196, 705, 569, 275, 259, 872, 630, 965, 978, 109, 56, 523, 851, 887, 91, 544, 598, 963, 305,
				481, 959, 560, 454, 883, 50, 216, 732, 572, 511, 156, 177, 831, 122, 667, 548, 978, 771, 880, 922, 777,
				990, 498, 525, 317, 469, 151, 874, 202, 519, 139, 670, 341, 514, 469, 858, 913, 94, 849, 839, 813, 664,
				163, 3, 802, 21, 634, 944, 901, 446, 186, 843, 742, 330, 610, 932, 614, 625, 169, 833, 4, 81, 55, 124,
				294, 71, 24, 929, 534, 621, 543, 417, 534, 427, 327, 179, 90, 341, 949, 368, 692, 646, 290, 488, 145,
				273, 617, 596, 82, 538, 751, 80, 616, 763, 826, 932, 184, 630, 478, 163, 925, 259, 237, 839, 602, 60,
				786, 603, 413, 816, 278, 4, 35, 243, 64, 631, 405, 23, 638, 618, 829, 481, 877, 756, 482, 999, 973, 718,
				157, 262, 752, 931, 882, 741, 40, 77, 535, 542, 879, 607, 879, 321, 46, 210, 116, 244, 830, 591, 285,
				382, 925, 48, 497, 913, 203, 239, 696, 162, 623, 291, 525, 950, 27, 546, 293, 108, 577, 672, 354, 256,
				3, 671, 998, 22, 989, 557, 424, 251, 923, 542, 243, 46, 488, 80, 374, 372, 334, 190, 817, 150, 742, 362,
				196, 75, 193, 162, 645, 859, 758, 433, 903, 199, 289, 175, 303, 475, 818, 213, 576, 181, 668, 243, 297,
				572, 549, 840, 161, 29 };
		MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();
		System.out.println(minCostClimbingStairs.minCostClimbingStairs(t1));
		System.out.println(minCostClimbingStairs.minCostClimbingStairs(t2));
		System.out.println(minCostClimbingStairs.minCostClimbingStairs(t3));
	}

}
