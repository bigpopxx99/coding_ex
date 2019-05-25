import java.util.List;

public class Utils {
	public static <T> void printList(List<T> list) {
		if (list == null) {
			System.out.println("list is null");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
		}
	}
}
