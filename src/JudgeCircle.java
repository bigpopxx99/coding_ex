import javax.sound.midi.Soundbank;

public class JudgeCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String test1 = "LLR";
        String test2 = "UUDD";
        SolutionJudgeCircle solutionJudgeCircle = new SolutionJudgeCircle();
        System.out.println(solutionJudgeCircle.judgeCircle(test1));
        System.out.println(solutionJudgeCircle.judgeCircle(test2));
	}

}

class SolutionJudgeCircle {
    public boolean judgeCircle(String moves) {
        if (moves == null || moves.length() == 0) {
        	return true;
        }
        int u=0;
        int d=0;
        int l=0;
        int r=0;
        for (int i=0; i<moves.length(); i++) {
        	switch (moves.charAt(i)) {
			case 'U':
				u++;
				break;
			case 'D':
				d++;
				break;
			case 'L':
				l++;
				break;
			case 'R':
				r++;
				break;
			default:
				break;
			}
        }
        return (u==d) && (l==r);
    }
}
