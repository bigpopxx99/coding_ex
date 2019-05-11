
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test1 = "hello";
		String test2 = "A man, a plan, a canal: Panama";
        SolutionReverseString solutionReverseString = new SolutionReverseString();
        System.out.println(solutionReverseString.reverseString(test1));
        System.out.println(solutionReverseString.reverseString(test2));
	}

}


class SolutionReverseString {
    public String reverseString(String s) {
        if (s == null || s.length() == 0) {
        	return s;
        }
        StringBuffer buffer = new StringBuffer();
        for (int i=s.length()-1; i>=0; i--) {
        	buffer.append(s.charAt(i));
        }
        return buffer.toString();
    }
}