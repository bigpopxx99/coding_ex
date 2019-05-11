import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;

public class emailQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] testList = new String[3];
        testList[0] = "testS+emailalex@leetcode.com";
        testList[1] = "test.+e.mail+bob.cathy@leetcode.com";
        testList[2] = "test+email+david@leetcode.com";
        SolutionEmail solution = new SolutionEmail();
        System.out.println(solution.numUniqueEmails(testList));
	}

}

class SolutionEmail {
    public int numUniqueEmails(String[] emails) {
        if (emails == null || emails.length == 0) {
        	return 0;
        }
        int count = emails.length;
        HashSet<String> hashSet = new HashSet<>();
        for (int i=0; i<emails.length; i++) {
        	String emailAddress = emails[i];
        	int at_index = emailAddress.indexOf("@");
        	int plus_index = emailAddress.indexOf("+");
        	String local_name = emailAddress.substring(0, plus_index);
        	local_name =local_name.replace(".", "");
        	String parsed_str = local_name + "@" + emailAddress.substring(at_index+1);
        	if (hashSet.contains(parsed_str)) {
        		count--;
        	}else {
        		hashSet.add(parsed_str);
        	}
        }
        return count;
    }
}
