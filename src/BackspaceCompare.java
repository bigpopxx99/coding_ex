import java.util.Stack;

public class BackspaceCompare {
	
    public boolean backspaceCompare(String S, String T) {
        char sTail = S.charAt(S.length()-1);
        char tTail = T.charAt(T.length()-1);
        if (sTail != '#' && tTail != '#' && sTail != tTail) {
        	return false;
        }
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        String s = null;
        String t = null;
        for (int i=0; i<S.length(); i++) {
        	if (S.charAt(i) == '#') {
        		if (!stackS.isEmpty()) {
        			stackS.pop();
        		}
        	}else {
        		stackS.push(S.charAt(i));
        	}
        }
        for (int i=0; i<T.length(); i++) {
        	if (T.charAt(i) == '#') {
        		if (!stackT.isEmpty()) {
        			stackT.pop();
        		}
        	}else {
        		stackT.push(T.charAt(i));
        	}
        }
        if (stackS.size() != stackT.size()) {
        	return false;
        }
        while (!stackS.isEmpty() && !stackT.isEmpty()) {
        	if (stackS.pop() != stackT.pop()) {
        		return false;
        	}
        }
        return true;
    }

	public static void main(String[] args) {
        BackspaceCompare b = new BackspaceCompare();
        System.out.println(b.backspaceCompare("ab#c", "ad#c"));
        System.out.println(b.backspaceCompare("ab##", "c#d#"));
        System.out.println(b.backspaceCompare("a##c", "#a#c"));
        System.out.println(b.backspaceCompare("a#c", "b"));
	}

}
