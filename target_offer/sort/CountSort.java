package sort;

public class CountSort {
	
	public static void countSort(int[] array) {
		int limit = 100;
		int[] tmp = new int[limit];
		for (int i=0; i<limit; i++) {
			tmp[i] = 0;
		}
		for (int j=0; j<array.length; j++) {
			tmp[array[j]] += 1;
		}
		int start = 0;
		for (int k=0; k<limit; k++) {
			while (tmp[k] != 0) {
				array[start++] = k;
				tmp[k] -= 1;
			}
		}
	}

	public static void main(String[] args) {
		SortUtils.printArray(SortUtils.T);
		countSort(SortUtils.T);
		SortUtils.printArray(SortUtils.T);
	}

}
