package sort;

public class SimpleSelectSort {

	// 由小到大
	private static void selectSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int maxIndex = 0;
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[maxIndex]) {
					maxIndex = j;
				}
			}
			if (maxIndex != array.length - i - 1) {
				int tmp = array[array.length - i - 1];
				array[array.length - i - 1] = array[maxIndex];
				array[maxIndex] = tmp;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t1 = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		printArray(t1);
		selectSort(t1);
		printArray(t1);
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
