
public class JandSTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println(solution.numJewelsInStones("aA", "aAAbbbb"));
		System.out.println(solution.numJewelsInStones("z", "ZZ"));

	}

}


class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        if (J == null || J.length() == 0 || S == null || S.length() == 0){
        	return 0;
        }
        
        for (int i=0; i<S.length(); i++) {
        	char letter = S.charAt(i);
        	if (J.indexOf(letter) != -1) {
        		count++;
        	}
        	
        }
        
        return count;
    }
}
