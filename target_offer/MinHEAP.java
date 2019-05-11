import java.util.ArrayList;
import java.util.List;

public class MinHEAP {

	public static void makeUpMinHeap(List<Integer> list) {
		int lastChildIndex = list.size() - 1;
		int lastParentIndex = (lastChildIndex + 1) / 2 - 1;
        int parentIndex = lastParentIndex;
		while (parentIndex >= 0) {
			int oneTimeIndex = parentIndex;
			while (oneTimeIndex <= lastParentIndex) {
				int leftIndex = oneTimeIndex * 2 + 1;
				int rightIndex = oneTimeIndex * 2 + 2;
				int maxChildIndex = 0;
				if (rightIndex > list.size() - 1) {
					// 无右节点
					maxChildIndex = leftIndex;
				} else {
					maxChildIndex = list.get(leftIndex) > list.get(rightIndex) ? leftIndex : rightIndex;
				}
				if (list.get(oneTimeIndex) < list.get(maxChildIndex)) {
					// 交换父节点和最大的子节点
					int tmp = list.get(oneTimeIndex);
					list.set(oneTimeIndex, list.get(maxChildIndex));
					list.set(maxChildIndex, tmp);
					oneTimeIndex = maxChildIndex;
				} else {
					// 不需要交换
					break;
				}
			}
			parentIndex--;
		}
	}
	
	public static void insert(List<Integer> list, int newOne) {
		if (list == null) return;
		list.add(newOne);
		makeUpMinHeap(list);
	}
	
	public static void delete(List<Integer> list, int delIndex) {
		if (delIndex > list.size() - 1) return;
		list.set(delIndex, list.get(list.size()-1));
		list.remove(list.size()-1);
		makeUpMinHeap(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < t.length; i++) {
			list.add(t[i]);
		}
		makeUpMinHeap(list);
		System.out.println(list);
		
		insert(list, 100);
		System.out.println(list);
		
		delete(list, 0);
		System.out.println(list);
	}

}
