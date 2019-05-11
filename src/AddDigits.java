
public class AddDigits {
	
    public static int addDigits(int num) {
        if (num == 0) {
        	return 0;
        }else {
        	if (num % 9 == 0) {
        		return 9;
        	}else {
        		return num % 9;
        	}
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int t1 = 38;
        System.out.println(addDigits(t1));
	}

}
