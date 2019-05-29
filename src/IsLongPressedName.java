
public class IsLongPressedName {

	public boolean isLongPressedName(String name, String typed) {
		if (name == null && typed == null) {
			return true;
		}
		if ((name == null && typed != null) || (name != null && typed == null)) {
			return false;
		}
		if (name.length() > typed.length()) {
			return false;
		}
		if (name.equals(typed)) {
			return true;
		}
		if (name.charAt(name.length()-1) != typed.charAt(typed.length()-1)) {
			return false;
		}

		int nIdx = 0;
		int tIdx = 0;
		int tLstIdx = 0;

		while (nIdx < name.length() && tIdx < typed.length()) {
			if (name.charAt(nIdx) == typed.charAt(tIdx)) {
				tLstIdx = tIdx;
				nIdx = nIdx == name.length()-1 ? nIdx : nIdx+1;
				tIdx++;
			} else {
				if (typed.charAt(tIdx) == typed.charAt(tLstIdx)) {
					tIdx++;
				} else {
					return false;
				}
			}
		}
		if (nIdx < name.length()-1) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		IsLongPressedName  i = new IsLongPressedName();
		System.out.println(i.isLongPressedName("alex", "aaleex"));
		System.out.println(i.isLongPressedName("saeed", "ssaaedd"));
		System.out.println(i.isLongPressedName("leelee", "lleeelee"));
		System.out.println(i.isLongPressedName("laiden", "laidennnnna"));
		System.out.println(i.isLongPressedName("pyplrz", "ppyypllr"));
	}

}
