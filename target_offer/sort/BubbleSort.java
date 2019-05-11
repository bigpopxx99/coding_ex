package sort;

import javax.print.attribute.standard.PrinterLocation;

public class BubbleSort {
	
	//由小到大，当某一次交换次数为0时，退出,满足最优的O(n)情况
	private static void bubbleSort(int[] array) {
		for (int i=0; i<array.length; i++) {
			int exTimes = 0;
			for (int j=0; j<array.length-i-1; j++) {
				if (array[j] > array[j+1]) {
					exTimes++;
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
			if (exTimes == 0) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] t1 = {9,8,7,6,5,4,3,2,1};
        printArray(t1);
        bubbleSort(t1);
        printArray(t1);
	}
	
	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

}
