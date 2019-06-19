
public class AddBinary {
	
    public String addBinary(String a, String b) {
        int carry = 0;
        int idxA = a.length()-1;
        int idxB = b.length()-1;
        char ret[] = new char[Math.max(a.length(), b.length())+1];
        int idxR = ret.length-1;
        while (idxA >=0 || idxB >= 0) {
        	int va = 0;
        	int vb = 0;
        	if (idxA >= 0) {
        		va = a.charAt(idxA)-'0';
        	}
            if (idxB >= 0) {
            	vb = b.charAt(idxB)-'0';
            }
        	int sum = va + vb + carry;
        	carry = sum > 1 ? 1 : 0;
        	ret[idxR] = (char)(sum%2 + '0');
        	idxA--;
        	idxB--;
        	idxR--;
        }
        if (carry == 1) {
        	ret[0] = (char)(1+'0');
        }

        return ret[0] == '1' ? new String(ret) : new String(ret, 1, ret.length-1);
    }

	public static void main(String[] args) {
		AddBinary ab = new AddBinary();
		System.out.println(ab.addBinary("1", "1011"));
	}

}
