import java.util.Arrays;

public class FindContentChildren {
	
    public int findContentChildren(int[] g, int[] s) {
        if (g == null || g.length == 0 || s == null || s.length == 0) {
        	return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int gIndex = 0;
        int sIndex = 0;
        while (gIndex < g.length && sIndex < s.length) {
        	if (s[sIndex] >= g[gIndex]) {
        		sIndex++;
        		gIndex++;
        	}else {
        		sIndex++;
        	}
        }
        return gIndex;
    }

	public static void main(String[] args) {
		int[] t11 = {1,2,3};
		int[] t12 = {1,1};
		int[] t21 = {1,2};
		int[] t22 = {1,2,3};
		FindContentChildren findContentChildren = new FindContentChildren();
		System.out.println(findContentChildren.findContentChildren(t11,t12));
		System.out.println(findContentChildren.findContentChildren(t21,t22));

	}

}
