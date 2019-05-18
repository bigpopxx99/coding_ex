package sort;

public class HeapSort {

	public void heapSort(int[] array) {

		int lastIndex = array.length - 1;
		while (lastIndex > 0) {
			int lastParentIndex = (lastIndex + 1) / 2 - 1;
			for (int i = lastParentIndex; i >= 0; i--) {
				adjust(array, lastIndex, i);
			}
			// exchange top and tail, and discount the tail node from next round 
			int tmp = array[0];
			array[0] = array[lastIndex];
			array[lastIndex] = tmp;
			lastIndex--;
		}

	}

	public void adjust(int[] array, int lastIndex, int pIndex) {
		int leftIndex = pIndex * 2 + 1;
		int rightIndex = pIndex * 2 + 2;
		int lastParentIndex = (lastIndex + 1) / 2 - 1;
		int maxIndex = leftIndex;
		if (rightIndex <= lastIndex && array[rightIndex] > array[leftIndex]) {
			// have right node and right node bigger than left
			maxIndex = rightIndex;
		}
		if (array[pIndex] < array[maxIndex]) {
			// exchange parent and max child node
			int tmp = array[pIndex];
			array[pIndex] = array[maxIndex];
			array[maxIndex] = tmp;
			if (maxIndex <= lastParentIndex) {
				adjust(array, lastIndex, maxIndex);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortUtils.printArray(SortUtils.T);
		HeapSort heapSort = new HeapSort();
		heapSort.heapSort(SortUtils.T);
		SortUtils.printArray(SortUtils.T);
	}

}
