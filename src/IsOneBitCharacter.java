
public class IsOneBitCharacter {

	public static boolean isOneBitCharacter(int[] bits) {
		if (bits == null || bits.length == 0 || bits[bits.length-1] != 0) {
			return false;
		}
		int p = 0;
		while (p < bits.length) {
			if (p == bits.length - 1 && bits[p] == 0) {
				return true;
			}
            if (bits[p] == 0) {
            	p++;
            }else if (bits[p] == 1) {
            	p += 2;
            }else {
            	return false;
            }
		}
		return false;
	}

	public static void main(String[] args) {
        int[] t1 = {1,0,0};
        int[] t2 = {1,1,1,0};
        int[] t3 = {0,1,1,0};
        int[] t4 = {0,1,0,1};
        
        System.out.println(isOneBitCharacter(t1));
        System.out.println(isOneBitCharacter(t2));
        System.out.println(isOneBitCharacter(t3));
        System.out.println(isOneBitCharacter(t4));
        
	}

}
