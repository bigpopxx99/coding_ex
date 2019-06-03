
public class ToHex {
	
    public String toHex(int num) {
    	if (num == 0) {
    		return "0";
    	}
    	long n = 4294967295l;
    	if (num < 0) {
    		n = n + num + 1;
    	}else {
    		n = num;
    	}
        String ret = "";
        while (n != 0) {
        	int remain = (int)(n % 16);
        	ret = getNumChar(remain) + ret;
        	n = n / 16;
        }
        return ret;
    }
    
    private char getNumChar(int i) {
    	char c = '0';
    	switch (i) {
    	case 10:
    		c = 'a';
    		break;
    	case 11:
    		c= 'b';
    		break;
    	case 12:
    		c = 'c';
    		break;
    	case 13:
    		c = 'd';
    		break;
    	case 14:
    		c = 'e';
    		break;
    	case 15:
    		c = 'f';
    		break;
    	default:
    		c = (char)(i+'0');
    		break;
    	}
    	return c;
    }

	public static void main(String[] args) {
		int[] t = {-1,-10, 0, 1,2,100,500};
		ToHex to = new ToHex();
		for (int i=0; i<t.length; i++) {
			System.out.println(to.toHex(t[i]));
		}

	}

}
