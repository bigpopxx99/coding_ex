import java.util.ArrayList;
import java.util.List;

public class GetRow {

	public List<Integer> getRow(int rowIndex) {
		ArrayList<Integer> ret = new ArrayList<>();
		if (rowIndex < 0) {
			return ret;
		}
		ret.add(1);
		if (rowIndex == 0) {
			return ret;
		}
		ret.add(0, 0);
		ret.add(0);
		int layer = 1;
		while (layer <= rowIndex) {
			int len = ret.size();
			for (int i = 0; i < len - 1; i++) {
				int v = ret.get(i) + ret.get(i + 1);
				ret.set(i, v);
			}
			ret.add(0, 0);
			layer++;
		}
		ret.remove(ret.size() - 1);
		ret.remove(0);
		return ret;
	}

	public static void main(String[] args) {
		GetRow g = new GetRow();
		for (int i =-1; i < 10; i++) {
			Utils.printList(g.getRow(i));
		}

	}

}
