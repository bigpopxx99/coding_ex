
public class FindJudge {
	
    public int findJudge(int N, int[][] trust) {
    	int[] labels = new int[N+1];
        for (int i=0; i<trust.length; i++) {
        	labels[trust[i][0]] = 1;
        }
        int judge = -1;
        int countJudge = 0;
        for (int j=1; j<labels.length; j++) {
        	if (labels[j] == 0) {
        		countJudge++;
        		if (countJudge > 1) {
        			return -1;
        		}
        		judge = j;
        	}
        }
        int sum = 0;
        for (int k=0; k<trust.length; k++) {
        	if (trust[k][1] == judge) {
        		sum++;
        	}
        }
        if (sum == N - 1) {
        	return judge;
        }else {
        	return -1;
        }
    }

	public static void main(String[] args) {
        int[][] t1 = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        int[][] t2 = {{1,2},{2,3}};
        
        FindJudge findJudge = new FindJudge();
        System.out.println(findJudge.findJudge(4, t1));
        System.out.println(findJudge.findJudge(3, t2));
	}

}
