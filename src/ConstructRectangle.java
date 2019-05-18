
public class ConstructRectangle {

//	public int[] constructRectangle(int area) {
//		if (area == 0) {
//			return new int[] { 0, 0 };
//		}
//		int wStart = (int) Math.pow(area, 0.5);
//		int lStart = wStart;
//
//		while (wStart > 1 && lStart <= area) {
//			int multi = wStart * lStart;
//			if (multi == area) {
//				return new int[] { lStart, wStart };
//			}
//			if (multi > area) {
//				wStart -= (multi-area);
//			} else {
//				lStart++;
//			}
//		}
//		return new int[] { area, 1 };
//	}
	
	public int[] constructRectangle(int area) {
		if (area == 0) {
			return new int[] { 0, 0 };
		}
		int w = (int) Math.pow(area, 0.5);

		while (area % w != 0) {
			w--;
		}
		return new int[] { area / w, w };
}

	public static void main(String[] args) {
		int[] t = { 200,4,0,1,1000,23,2 };
		ConstructRectangle constructRectangle = new ConstructRectangle();
		for (int i = 0; i < t.length; i++) {
			int[] ret = constructRectangle.constructRectangle(t[i]);
			System.out.println("[" + ret[0] + "," + ret[1] + "]");
		}
	}

}
