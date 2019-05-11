
public class IsToeplitzMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] t1 = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        int[][] t2 = {{1,2},{2,2}};
        
        System.out.println(isToeplitzMatrix(t1));
        System.out.println(isToeplitzMatrix(t2));
	}
	
    public static boolean isToeplitzMatrix(int[][] matrix) {
        int xlength = matrix[0].length;
        int ylength = matrix.length;
        for (int i=0; i<xlength; i++) {
        	int xindex = i;
        	int yindex = 0;
            int val = matrix[0][i];
            xindex++;
            yindex++;
        	while (xindex < xlength && yindex < ylength) {
        		if (matrix[yindex][xindex] != val) {
        			return false;
        		}
        		xindex++;
        		yindex++;
        	}
        }
        for (int j=1; j<ylength; j++) {
        	int xindex = 0;
        	int yindex = j;
        	int val = matrix[j][0];
            xindex++;
            yindex++;
        	while (xindex < xlength && yindex < ylength) {
        		if (matrix[yindex][xindex] != val) {
        			return false;
        		}
        		xindex++;
        		yindex++;
        	}
        }
        return true;
    }

}
