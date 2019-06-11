
public class LicenseKeyFormatting {
	public String licenseKeyFormatting(String S, int K) {
		StringBuffer sb = new StringBuffer();
		int index = S.length() - 1;
		int addNum = 0;
		while (index >= 0) {
			char c = S.charAt(index);
			if (c == '-') {
				index--;
				continue;
			}
			if (addNum == K) {
				sb.append("-");
				addNum = 0;
			} else {
				c = (c >= 'a' && c <= 'z') ? (char) (c - 32) : c;
				sb.append(c);
				addNum++;
				index--;
			}
		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		LicenseKeyFormatting lkf = new LicenseKeyFormatting();
		System.out.println(lkf.licenseKeyFormatting("5F3Z-2e-9-w", 4));
		System.out.println(lkf.licenseKeyFormatting("2-5g-3-J", 2));
		System.out.println(lkf.licenseKeyFormatting("--a-a-a-a--", 2));
	}

}
