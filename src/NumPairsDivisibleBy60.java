public class NumPairsDivisibleBy60 {
	public int numPairsDivisibleBy60(int[] time) {
		if (time == null || time.length <= 1) {
			return 0;
		}
		int[] array = new int[60];
		int ret = 0;
		for (int i = 0; i < time.length; i++) {
			int v = time[i] % 60;
			int pair = (v == 0 ? 0 : 60 - v);
			ret += array[pair];
			array[v] += 1;
		}
		return ret;
	}

	public static void main(String[] args) {
		int[] t1 = { 30, 20, 150, 100, 40};
		int[] t2 = { 60, 60, 60 };
		NumPairsDivisibleBy60 n = new NumPairsDivisibleBy60();
		System.out.println(n.numPairsDivisibleBy60(t1));
		System.out.println(n.numPairsDivisibleBy60(t2));
	}

}
