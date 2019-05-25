
public class ReverseStr {
	
    public String reverseStr(String s, int k) {
    	if (k == 1) {
    		return s;
    	}
    	if (s == null || s.length() <= k) {
    		return reversed(s);
    	}
        int pIdx = 0;
        StringBuffer sb = new StringBuffer();
        while (pIdx <= s.length() - 1) {
        	int targetIdx = Math.min(pIdx+k-1, s.length()-1);
            sb.append(reversed(s.substring(pIdx, targetIdx+1)));
            int keepLeftIdx = pIdx+k;
            int keepRightIdx = Math.min(pIdx+k+k-1, s.length()-1);
            if (keepLeftIdx > s.length() - 1) {
            	break;
            }else {
            	sb.append(s.substring(keepLeftIdx, keepRightIdx+1));
            }
            pIdx = keepRightIdx + 1;
        }
        return sb.toString();
    }
    
    private String reversed(String s) {
    	if (s == null || s.length() <= 1) {
    		return s;
    	}
    	return new StringBuffer(s).reverse().toString();
    }

	public static void main(String[] args) {
        ReverseStr r = new ReverseStr();
        System.out.println(r.reverseStr("abcdefg", 1));
	}

}
