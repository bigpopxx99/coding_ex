import java.util.ArrayList;

public class AllPossibleCombins {

	
	public void listCombins(char[] array, int start, int[] count) {
		if (start == array.length-1) {
			System.out.print(count[0]+":");
			printArray(array);
			count[0] += 1;
		}
		for (int i=start; i<array.length; i++) {
			char tmp = array[i];
			array[i] = array[start];
			array[start] = tmp;
			listCombins(array, start+1, count);
			tmp = array[i];
			array[i] = array[start];
			array[start] = tmp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] t = {'a', 'b', 'c'};
        AllPossibleCombins allPossibleCombins = new AllPossibleCombins();
        int[] count = {1};
        allPossibleCombins.listCombins(t, 0,count);
	}
	
	private void printArray(char[] array) {
		String string = String.valueOf(array);
		System.out.println(string);
	}

}