
public class TwoCitySchedCost {
	
    public static int twoCitySchedCost(int[][] costs) {
        for (int i=0; i<costs.length; i++) {
        	for (int j=0; j<costs.length-i-1; j++) {
        		if (Math.abs(costs[j][0] - costs[j][1]) < Math.abs(costs[j+1][0]-costs[j+1][1])) {
        			int[] tmp = costs[j];
        			costs[j] = costs[j+1];
        			costs[j+1] = tmp;
        		}
        	}
        }
        int numA = costs.length/2;
        int numB = costs.length/2;
        
        int ret = 0;
        for (int k=0; k<costs.length; k++) {
        	if (costs[k][0] > costs[k][1]) {
        		if (numB > 0) {
        		    ret += costs[k][1];
        		    numB--;
        		}else {
        			ret += costs[k][0];
        		}
        	}else {
        		if (numA > 0) {
        			ret += costs[k][0];
        			numA--;
        		}else {
        			ret += costs[k][1];
        		}
        	}
        }
        return ret;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] t1 = {{10,20},{30,200},{400,50},{30,20}};
        int[][] t2 = {{518,518},{71,971},{121,862},{967,607},{138,754},{513,337},{499,873},{337,387},{647,917},{76,417}};
        System.out.println(twoCitySchedCost(t1));
        System.out.println(twoCitySchedCost(t2));
	}

}
