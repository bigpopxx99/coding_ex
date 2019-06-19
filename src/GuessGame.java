
public class GuessGame {
	int pick = 1;

	public int guessNumber(int n) {
		return search(1, n);
	}

	private int search(int left, int right) {
		if (left > right)
			return -1;
		if (left == right) return left;
		int mid = left/2 + right/ 2;
		System.out.println("left:"+left+" right:"+right+" mid:"+mid);
		int result = guess(mid);
		if (result == 0) {
			return mid;
		} else if (result == -1) {
			return search(left, mid - 1);
		} else {
			return search(mid + 1, right);
		}
	}

	private int guess(int t) {
		if (t == pick) {
			return 0;
		} else if (t > pick) {
			return -1;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		GuessGame gg = new GuessGame();
		System.out.println(gg.guessNumber(1));
	}
}