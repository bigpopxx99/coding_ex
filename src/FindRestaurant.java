import java.util.ArrayList;
import java.util.HashMap;

public class FindRestaurant {
	
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> result = new ArrayList<>();
        int minSum = list1.length + list2.length;
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i=0; i<list1.length; i++) {
        	hashMap.put(list1[i], i);
        }
        for (int j=0; j<list2.length; j++) {
        	if (hashMap.containsKey(list2[j])) {
        		int index1 = hashMap.get(list2[j]);
        		if ( index1 + j < minSum) {
        			minSum = index1 + j;
        			result.clear();
        			result.add(list2[j]);
        		}else if (index1+j == minSum) {
        			result.add(list2[j]);
        		}
        	}
        }
        String[] ret = new String[result.size()];
        for (int j=0; j<result.size(); j++) {
        	ret[j] = result.get(j);
        }
        return ret;
    }

	public static void main(String[] args) {
		String[] t1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
		String[] t2 = {"KFC", "The Grill at Torrey Pines", "KFC2", "Shogun"};
		FindRestaurant findRestaurant = new FindRestaurant();
		printArray(findRestaurant.findRestaurant(t1, t2));
	}
	
	private static <T> void printArray(T[] array) {
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
