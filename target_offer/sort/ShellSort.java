package sort;

public class ShellSort {
	
	private static void shellSort(int[] array) {
		if (array == null || array.length <= 1) {
			return;
		}
		int span = array.length/2;
		
		while (true) {
			int p = span;
			for (int i=p; i<array.length; i=i+span) {
				for (int j=0; j<i; j=j+span) {
					if (array[j] > array[i]) {
						int tmp = array[i];
						for (int k=i; k>j; k=k-span) {
							array[k] = array[k-span];
						}
						array[j] = tmp;
					}
				}
			}
			if (span == 1) {
				break;
			}else {
				span = span / 2;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortUtils.printArray(SortUtils.T);
        shellSort(SortUtils.T);
        SortUtils.printArray(SortUtils.T);
        
	}

}
