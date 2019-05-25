import java.util.ArrayList;
import java.util.List;

public class Generate {

	// public List<List<Integer>> generate(int numRows) {
	// List<List<Integer>> resultLists = new ArrayList<>();
	// if (numRows == 0) {
	// return resultLists;
	// }
	// int layer = 0;
	// while (layer < numRows) {
	// List<Integer> oneLayer = new ArrayList<>();
	// int total = layer + 1;
	// for (int i=0; i<total; i++) {
	// int num = getNum(resultLists, layer, i);
	// oneLayer.add(num);
	// }
	// resultLists.add(oneLayer);
	// layer++;
	// }
	//
	// return resultLists;
	// }
	//
	// private int getNum(List<List<Integer>> lists, int curLayer, int curIdx) {
	// int prevLayer = curLayer - 1;
	// if (prevLayer < 0) {
	// return 1;
	// }
	// int upIdxLeft = curIdx - 1;
	// int upIdxRight = curIdx;
	// if (upIdxLeft < 0 || upIdxRight > lists.get(prevLayer).size() - 1) {
	// return 1;
	// }
	// return lists.get(prevLayer).get(upIdxLeft) +
	// lists.get(prevLayer).get(upIdxRight);
	// }

	public List<List<Integer>> generate(int numRows) {
		int layer = 0;
		List<List<Integer>> resultLists = new ArrayList<>();
		while (layer < numRows) {
			List<Integer> list = new ArrayList<>();
			if (layer == 0) {
				list.add(1);
			} else {
				list.add(1);
				List<Integer> prev = resultLists.get(layer - 1);
				int idx = 0;
				while (idx < prev.size() - 1) {
					list.add(prev.get(idx) + prev.get(idx + 1));
					idx++;
				}
				list.add(1);
			}
			resultLists.add(list);
			layer++;
		}

		return resultLists;
	}

	public static void main(String[] args) {
		Generate g = new Generate();
		List<List<Integer>> ret = g.generate(2);
	}

}
