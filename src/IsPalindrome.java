import java.util.Stack;

public class IsPalindrome {
	
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        if (x<10) return true;
        int len = getNumLen(x);
        int lp = len - 1;
        int rp = 0;
        while (lp > rp) {
        	if (getNum(x, lp) != getNum(x, rp)) {
        		return false;
        	}
        	lp--;
        	rp++;
        }
        return true;
    }
    
    public int getNumLen(int x) {
    	int len = 0;
        int start = x;
        while (start != 0) {
        	start = start / 10;
        	len++;
        }
        return len;
    }
    
    public int getNum(int x, int pos) {
    	return (int)(x/Math.pow(10, pos)) % 10;
    }
    
    public boolean isPalindrome2(int x) {
        if (x<0) return false;
        if (x<10) return true;
        int org = x;
    	Stack<Integer> stack = new Stack<>();
    	while (x > 0) {
    		int tail = x%10;
    		stack.push(tail);
    		x = x/10;
    	}
    	long reverse = 0;
    	int count = 0;
    	while (!stack.isEmpty()) {
    		reverse += stack.pop() * Math.pow(10, count);
    		count++;
    	}
    	return org == reverse;
    }
    
    public boolean isPalindrome3(int x) {
        if (x<0) return false;
        if (x<10) return true;
        StringBuffer sb = new StringBuffer(String.valueOf(x));
        String s1 = sb.toString();
        String s2 = sb.reverse().toString();
    	return s1.equals(s2);
    }

	public static void main(String[] args) {
		IsPalindrome ip = new IsPalindrome();
		int[] test = {-1,1,2,0,101,2147483647};
		for (int i=0; i<test.length; i++) {
			System.out.print(ip.isPalindrome3(test[i])+",");
		}
	}

}
