
public class NumberOfLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] widths1 = new int[] {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        int[] widths2 = new int[] {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        String s2 = "bbbcccdddaaa";
        SolutionNumberOfLines solutionNumberOfLines = new SolutionNumberOfLines();
        printArray(solutionNumberOfLines.numberOfLines(widths1, s1));
        printArray(solutionNumberOfLines.numberOfLines(widths2, s2));
	}
	
	private static void printArray(int[] array) {
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

}


class SolutionNumberOfLines {
    public int[] numberOfLines(int[] widths, String S) {
        if (widths == null || widths.length == 0 || S == null || S.length() == 0){
            return new int[]{0, 0};
        }
        int lines = 1;
        int lst_ln_nums = 0;
        for (int i=0; i<S.length(); i++) {
        	int length = widths[S.charAt(i) - 'a'];
        	if (lst_ln_nums == 100 || 100 - lst_ln_nums % 100 < length) {
        		lines++;
        		lst_ln_nums = length;
        	}else {
        		lst_ln_nums += length;
        	}
        }
        return new int[] {lines, lst_ln_nums};
    }
}