import java.util.ArrayList;

import javax.swing.RootPaneContainer;

import org.omg.CORBA.FREE_MEM;

public class Test {
	
	private static void changeArray(int[] input) {
		int[] n = new int[10];
		input = n;
		System.out.println("input length:"+input.length);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] o = new int[9];
		changeArray(o);
		System.out.println("after change:"+o.length);
	}

}

class TMPNODE {
	int val;
	TMPNODE next;
}
