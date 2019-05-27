
public class CheckRecord {
	
    public boolean checkRecord(String s) {      
        return s!= null && s.length() >= 1 && !s.contains("LLL") && (s.lastIndexOf('A') == s.indexOf('A'));
    }

	public static void main(String[] args) {
        String[] array = {"PPALLP","PPALLL"};
        CheckRecord c = new CheckRecord();
        for (int i=0; i<array.length; i++) {
        	System.out.println(c.checkRecord(array[i]));
        }
	}

}
