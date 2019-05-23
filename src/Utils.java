import java.util.List;

public class Utils {
	public static <T> void printList(List<T> list) {
        for (int i=0; i<list.size(); i++) {
        	System.out.print(list.get(i) + " ");
        }
	}
}
