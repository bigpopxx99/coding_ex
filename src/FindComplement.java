
public class FindComplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findComplement(5));
		System.out.println(findComplement(1));

	}

	public static int findComplement(int num) {
		int ret = 0;
		int pos = 0;
        while (num != 0) {
        	if (num % 2 == 0) {
        		ret += Math.pow(2, pos);
        	}
        	pos++;
        	num = num >> 1;
        }
        return ret;
	}

}
