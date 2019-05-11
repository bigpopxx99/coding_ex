
public class FloodFill {

	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int curColor = image[sr][sc];
		if (image[sr][sc] != newColor) {
			image[sr][sc] = newColor;
		}
		// up
		if (sr - 1 >= 0 && image[sr - 1][sc] == curColor && image[sr - 1][sc] != newColor) {
			floodFill(image, sr - 1, sc, newColor);
		}
		// down
		if (sr + 1 <= image.length - 1 && image[sr + 1][sc] == curColor && image[sr + 1][sc] != newColor) {
			floodFill(image, sr + 1, sc, newColor);
		}
		// left
		if (sc - 1 >= 0 && image[sr][sc - 1] == curColor && image[sr][sc - 1] != newColor) {
			floodFill(image, sr, sc - 1, newColor);
		}
		// right
		if (sc + 1 <= image[0].length - 1 && image[sr][sc + 1] == curColor && image[sr][sc + 1] != newColor) {
			floodFill(image, sr, sc + 1, newColor);
		}
		return image;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] t = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
		floodFill(t, 1, 1, 2);
	}

}
