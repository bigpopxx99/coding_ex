import javax.print.attribute.standard.PrinterLocation;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class ColumnDeleteQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test1 = {"cba","daf","ghi"};
		String[] test2 = {"a","b"};
		String[] test3 = {"zyx","wvu","tsr"};
		SolutionColumnDeleteQ solution = new SolutionColumnDeleteQ();
        println(solution.minDeletionSize(test1));
        println(solution.minDeletionSize(test2));
        println(solution.minDeletionSize(test3));
        
	}
	
	private static void println(int s) {
		System.out.println(s);
	}

}

class SolutionColumnDeleteQ {
    public int minDeletionSize(String[] A) {
        if (A == null || A.length == 0 || A[0] == null || A[0].length() == 0) {
        	return 0;
        }
        int string_length = A[0].length();
        int count = 0;
        for (int i=0; i<string_length; i++) {
        	for (int j=0; j<A.length-1; j++) {
        		if (A[j].charAt(i) > A[j+1].charAt(i)) {
        			count++;
        			break;
        		}
        	}
        }
        return count;
    }
}


