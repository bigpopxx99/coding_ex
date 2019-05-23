import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GardenNoAdj {

	public int[] gardenNoAdj(int N, int[][] paths) {
		int[] ret = new int[N];
		for (int i = 0; i < N; i++) {
			ret[i] = 1;
		}
		HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
		for (int j = 0; j < paths.length; j++) {
			int v1 = Math.min(paths[j][0], paths[j][1]);
			int v2 = Math.max(paths[j][0], paths[j][1]);
			if (hashMap.containsKey(v1)) {
				List<Integer> list = hashMap.get(v1);
				list.add(v2);
			} else {
				List<Integer> list = new ArrayList<>();
				list.add(v2);
				hashMap.put(v1, list);
			}
		}
		boolean invalid = true;
		while (invalid) {
			invalid = false;
			for (int key : hashMap.keySet()) {
				List<Integer> list = hashMap.get(key);
				for (int k = 0; k < list.size(); k++) {
					if (ret[list.get(k) - 1] == ret[key - 1]) {
						ret[list.get(k) - 1] += 1;
						if (ret[list.get(k) - 1] > 4) {
							ret[list.get(k) - 1] = 1;
						}
						invalid = true;
					}
				}
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		int[][] paths1 = { { 1, 2 }, { 2, 3 }, { 3, 1 } };
		int[][] paths2 = { { 1, 2 }, { 3, 4 } };
		int[][] paths3 = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 1 }, { 1, 3 }, { 2, 4 } };
		int[][] paths4 = { { 3, 4 }, { 4, 2 }, { 3, 2 }, { 1, 3 } };
		int[][] paths5 = {{6,4},{6,1},{3,1},{4,5},{2,1},{5,6},{5,2}};
		GardenNoAdj g = new GardenNoAdj();
		int[] ret1 = g.gardenNoAdj(3, paths1);
		int[] ret2 = g.gardenNoAdj(4, paths2);
		int[] ret3 = g.gardenNoAdj(4, paths3);
		int[] ret4 = g.gardenNoAdj(4, paths4);
		int[] ret5 = g.gardenNoAdj(6, paths5);
	}

}
