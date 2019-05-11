package sort;

public class MergeSort {

	// 由小到大
	public static void mergeSort(int[] array) {
		int[] newArray = new int[array.length];
		sort(array, 0, array.length - 1, newArray);
		for (int i = 0; i < array.length; i++) {
			array[i] = newArray[i];
		}
	}

	public static void sort(int[] array, int left, int right, int[] newArray) {
		int mid = (left + right) / 2;
		if (mid < right) {
			sort(array, left, mid, newArray);
			sort(array, mid + 1, right, newArray);
			merge(array, left, mid, right, newArray);
		}
	}

	public static void merge(int[] array, int left, int mid, int right, int[] newArray) {
		int l = left;
		int r = mid + 1;
		int n = l;
		while (l <= mid || r <= right) {
			if (l > mid) {
				newArray[n++] = array[r++];
			}else if (r > right) {
				newArray[n++] = array[l++];
			}else {
				newArray[n++] = array[l] < array[r] ? array[l++] : array[r++];
			}
		}
		for (int i = left; i <= right; i++) {
			array[i] = newArray[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortUtils.printArray(SortUtils.T);
		mergeSort(SortUtils.T);
		SortUtils.printArray(SortUtils.T);
	}

}
