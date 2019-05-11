package sort;

public class InsertSort {
	
	//由小到大
	private static void insertSort(int[] array) {
		for (int k=1; k<array.length; k++) {
			int start = 0;
			if (array[start] > array[k]) {
				//把start到p-1位置的数字向后挪动一位，给需要插入的值腾地
				int tmp = array[k];
				for (int i=k; i>start; i--) {
					array[i] = array[i-1];
				}
				array[start] = tmp;
				start = 0;
			}else {
				start++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] t1 = {9,8,7,6,5,4,3,2,1};
        printArray(t1);
        insertSort(t1);
        printArray(t1);
	}
	
	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

}
