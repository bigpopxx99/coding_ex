
public class MaxDistToClosest {

	public int maxDistToClosest(int[] seats) {
		int firstOne = 0;
		int lastOne = seats.length - 1;
		while (seats[firstOne] == 0) {
			firstOne++;
		}
		while (seats[lastOne] == 0) {
			lastOne--;
		}
		int maxZeroNum = 0;
		int curZeroNum = 0;
		for (int i = firstOne + 1; i < lastOne; i++) {
			if (seats[i] == 0) {
				curZeroNum++;
				maxZeroNum = maxZeroNum < curZeroNum ? curZeroNum : maxZeroNum;
			} else {
				curZeroNum = 0;
			}
		}
		int left = firstOne;
		int right = seats.length - 1 - lastOne;
		int mid = (maxZeroNum + 1) / 2;
		if (left >= right) {
			return Math.max(left, mid);
		} else {
			return Math.max(right, mid);
		}
	}

	public static void main(String[] args) {
		int[][] t = { {0,1}, {1,0,0,0,1,0,1}, {1,0,0,0}, {1,0,0,1} , {0,0,1,0,1,0,0,0}};
		MaxDistToClosest m = new MaxDistToClosest();
		for (int i = 0; i < t.length; i++) {
			System.out.println(m.maxDistToClosest(t[i]));
		}
	}

}
