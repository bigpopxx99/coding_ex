
@Deprecated
public class FindLUSlength {
	
    public static int findLUSlength(String a, String b) {
    	int ret = -1;
    	if (a.length() == 0) return b.length();
    	if (b.length() == 0) return a.length();
        if (!a.contains(b) && !b.contains(a)) {
        	ret = a.length() > b.length() ? a.length() : b.length();
        }
        return ret;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String t11 = "aefawfawfawfaw";
        String t22 = "aefawfeawfwafwaef";
        System.out.println(findLUSlength(t11, t22));
	}

}
