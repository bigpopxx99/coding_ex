//1041:On an infinite plane, a robot initially stands at (0, 0) and faces north.  The robot can receive one of three instructions:
//
//"G": go straight 1 unit;
//"L": turn 90 degrees to the left;
//"R": turn 90 degress to the right.
//The robot performs the instructions given in order, and repeats them forever.
//
//Return true if and only if there exists a circle in the plane such that the robot never leaves the circle.
//
// 
//
//Example 1:
//
//Input: "GGLLGG"
//Output: true
//Explanation: 
//The robot moves from (0,0) to (0,2), turns 180 degrees, and then returns to (0,0).
//When repeating these instructions, the robot remains in the circle of radius 2 centered at the origin.
//Example 2:
//
//Input: "GG"
//Output: false
//Explanation: 
//The robot moves north indefinitely.
//Example 3:
//
//Input: "GL"
//Output: true
//Explanation: 
//The robot moves from (0, 0) -> (0, 1) -> (-1, 1) -> (-1, 0) -> (0, 0) -> ...
// 
//
//Note:
//
//1 <= instructions.length <= 100
//instructions[i] is in {'G', 'L', 'R'}
public class IsRobotBounded {

	public boolean isRobotBounded(String instructions) {
		int direction = 0; // 0:up, 1:down, 2:left, 3:right
		int[] pos = { 0, 0 };
		for (int i = 0; i < instructions.length(); i++) {
			char cmd = instructions.charAt(i);
			if (cmd == 'G') {
				updateNewPostion(pos, direction);
			} else {
				direction = getNewDirection(direction, cmd);
			}
		}
		//结束位置不是远点，而且方向和初始位置一样，朝向上方，这种情况，robot是不可能再回原点了，其他情况都可以
		if (direction == 0 && !(pos[0] == 0 && pos[1] == 0)) {
			return false;
		}
		return true;
	}

	private void updateNewPostion(int[] curPos, int curDir) {
		switch (curDir) {
		case 0:
			curPos[1] += 1;
			break;
		case 1:
			curPos[1] -= 1;
			break;
		case 2:
			curPos[0] -= 1;
			break;
		case 3:
			curPos[0] += 1;
			break;
		default:
			break;
		}
	}

	private int getNewDirection(int old, char turn) {
		if (turn == 'L') {
			if (old == 0) {
				return 2;
			}
			if (old == 1) {
				return 3;
			}
			if (old == 2) {
				return 1;
			}
			if (old == 3) {
				return 0;
			}
		} else {
			if (old == 0) {
				return 3;
			}
			if (old == 1) {
				return 2;
			}
			if (old == 2) {
				return 0;
			}
			if (old == 3) {
				return 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {

	}

}
