import java.util.List;

public class Utils {
	public static <T> void printList(List<T> list) {
		if (list == null) {
			System.out.println("list is null");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + ",");
			}
		}
		System.out.println();
	}
	
	public static <T> void printArray(int[] array) {
		if (array == null) {
			System.out.println("Array is null");
		}else {
			for (int i=0; i<array.length; i++) {
				System.out.print(array[i]+",");
			}
		}
		System.out.println();
	}
}
