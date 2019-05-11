
public class FindNumberOfOneInBinaryNumber0201 {
	
	private static int getNumberOfOne(int num) {
		int ret = 0;
		while (num != 0) {
			num &= (num-1);
			ret++;
		}
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t1 = 111;
		System.out.println("test num:"+Integer.toBinaryString(t1));
        System.out.println(getNumberOfOne(t1));
	}

}
