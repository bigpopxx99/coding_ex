
public class IsRectangleOverlap {

	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		int[] x1 = { rec1[0], rec1[2] };
		int[] x2 = { rec2[0], rec2[2] };
		int[] y1 = { rec1[1], rec1[3] };
		int[] y2 = { rec2[1], rec2[3] };
		if (x2[0] >= x1[1])
			return false;
		if (x2[1] <= x1[0])
			return false;
		if (y2[0] >= y1[1])
			return false;
		if (y2[1] <= y1[0])
			return false;
		return true;
	}

	public static void main(String[] args) {
        int[] t11 = {0,0,4,4};
        int[] t12 = {1,1,3,3};
        int[] t21 = {0,0,1,1};
        int[] t22 = {1,0,2,1};
        IsRectangleOverlap i = new IsRectangleOverlap();
        System.out.println(i.isRectangleOverlap(t11, t12));
        System.out.println(i.isRectangleOverlap(t21, t22));
	}

}
