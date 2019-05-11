import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlipPies {

	private static int findMaxIndex(List<Integer> _list) {
		int maxIndex = 0;
		for (int i = 0; i < _list.size(); i++) {
			if (_list.get(i) > _list.get(maxIndex)) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	private static void flip(List<Integer> _list) {
		int start = 0;
		int end = _list.size() - 1;
		while (start < end) {
			int tmp = _list.get(start);
			_list.set(start, _list.get(end));
			_list.set(end, tmp);
			start++;
			end--;
		}
	}

	private static void printPieList(List<Integer> _list) {
		// for (int i=0; i<_list.size(); i++) {
		System.out.println(_list);
		// }
	}

	public static void main(String[] args) {
		ArrayList<Integer> pieList = new ArrayList<Integer>();

		for (int i = 10; i > 0; i--) {
			pieList.add(i);
		}

		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			int rIndex = random.nextInt(pieList.size());
			if (rIndex != 0) {
				int tmp = pieList.get(rIndex);
				pieList.set(rIndex, pieList.get(rIndex - 1));
				pieList.set(rIndex - 1, tmp);
			}
		}

		System.out.print("before flip");
		printPieList(pieList);

		int unSortListLength = pieList.size();
		int time = 1;
		while (unSortListLength > 1) {
			int maxIndex = findMaxIndex(pieList.subList(0, unSortListLength));
			if (maxIndex != unSortListLength - 1) {
				flip(pieList.subList(0, maxIndex + 1));
				flip(pieList.subList(0, unSortListLength));
				System.out.println("time" + time + " maxIndex:" + maxIndex + " after flip:" + pieList);
				time++;
			}
			unSortListLength--;
		}

		System.out.print("after flip");
		printPieList(pieList);

	}
}
