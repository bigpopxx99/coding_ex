package sort;

public class QuickSort {

	public static void quickSort(int[] array, int left, int right) {
		if (array == null || array.length < 2) {
			return;
		}
		int target = array[left];
		int l = left;
		int r = right;
		while (l != r) {
			while (array[r] >= target && r > l) {
				r--;
			}
			while (array[l] <= target &&  r > l) {
				l++;
			}
			
			int tmp = array[r];
			array[r] = array[l];
			array[l] = tmp;
		}

		array[left] = array[l];
		array[l] = target;
		
		if (l > left + 1) {
			quickSort(array, left, l - 1);
		}
		if (l < right - 1) {
			quickSort(array, l + 1, right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortUtils.printArray(SortUtils.T);
		quickSort(SortUtils.T, 0, SortUtils.T.length - 1);
		SortUtils.printArray(SortUtils.T);
	}
}
