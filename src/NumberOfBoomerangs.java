import java.util.HashMap;

public class NumberOfBoomerangs {
	
    public static int numberOfBoomerangs(int[][] points) {
    	if (points == null || points.length < 3) {
    		return 0;
    	}
    	int count = 0;
    	HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i=0; i<points.length; i++) {
        	hashMap.clear();
        	for (int j=0; j<points.length; j++) {
        		if (i == j) continue;
        		int dist = (points[i][0] - points[j][0])*(points[i][0] - points[j][0]) + (points[i][1] - points[j][1])*(points[i][1] - points[j][1]);
        		if (hashMap.containsKey(dist)) {
        			count += hashMap.get(dist)*2;
        			hashMap.put(dist, hashMap.get(dist)+1);
        		}else {
        			hashMap.put(dist, 1);
        		}
        	}
        }
        return count;
    }

	public static void main(String[] args) {
        int[][] t = {{0,0},{1,0},{-1,0},{0,1},{0,-1}};
        System.out.println(numberOfBoomerangs(t));
	}

}
