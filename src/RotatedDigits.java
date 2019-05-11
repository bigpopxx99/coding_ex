import java.util.ArrayList;
import java.util.HashSet;

public class RotatedDigits {

	public static int rotatedDigits(int N) {
		int ret = 0;
		for (int k = 1; k < N + 1; k++) {
			String string = String.valueOf(k);
			if (string.contains("3") 
					|| string.contains("4") 
					|| string.contains("7")) {
				continue;
			}else if (string.contains("2") 
					|| string.contains("5") 
					|| string.contains("6") 
					|| string.contains("9")) {
				ret++;
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int t1 = 10;
        System.out.println(rotatedDigits(t1));
	}

}
