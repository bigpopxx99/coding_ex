
public class NextGreatestLetter {
	
    public char nextGreatestLetter(char[] letters, char target) {
    	
    	if (target > letters[letters.length-1]) {
    		return letters[0];
    	}
    	if (target < letters[0]) {
    		return letters[0];
    	}
    	
        
    	int left = 0;
    	int right = letters.length - 1;
    	while (left < right) {
    		int mid = (left+right)/2;
    		if (mid == 0 && letters[0] <= target && letters[mid+1] <= target) {
    			return letters[0];
    		}
    		if (letters[mid] <= target && letters[mid+1] > target) {
    			return letters[mid+1];
    		}
    		if (letters[mid] > target && letters[mid-1] <= target) {
    			return letters[mid];
    		}
    		if (letters[mid] <= target) {
    			left = mid+1;
    		}else {
    			right = mid-1;
    		}
    	}
    	return letters[0];
    }

	public static void main(String[] args) {
		NextGreatestLetter n = new NextGreatestLetter();
		System.out.println(n.nextGreatestLetter(new char[] {'c','f'}, 'j'));
	}

}
