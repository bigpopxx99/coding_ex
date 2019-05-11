import java.util.regex.Pattern;

public class ZhengceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content = "www.ip138.com";

		String pattern = "(^|\\.)ip138\\.com$";

		boolean isMatch = Pattern.matches(pattern, content);
		
		System.out.println(isMatch);
	}

}
