import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class PowerfulIntegers {
	HashSet<Integer> hashSet = new HashSet<>();

	public List<Integer> powerfulIntegers(int x, int y, int bound) {
		List<Integer> ret = new ArrayList<>();
		int vx = 0;
		int sum = getValue(x, y, bound, vx, 0);
		while (sum <= bound && !(x==1 && vx > 0)) {
			int vy = 0;			
			while (sum <= bound && !(y==1 && vy > 0)) {
				putIntoSet(sum);
				vy++;
				sum = getValue(x, y, bound, vx, vy);
			}
			vx++;
			sum = getValue(x, y, bound, vx, 0);
		}
		Iterator<Integer> itor = hashSet.iterator();
		while (itor.hasNext()) {
			ret.add(itor.next());
		}
		return ret;
	}

	private int getValue(int x, int y, int bound, int vx, int vy) {
		return (int) (Math.pow(x, vx) + Math.pow(y, vy));
	}

	private void putIntoSet(int v) {
		if (!hashSet.contains(v)) {
			hashSet.add(v);
		}
	}

	public static void main(String[] args) {
		PowerfulIntegers pi = new PowerfulIntegers();
		Utils.printList((pi.powerfulIntegers(1, 1, 10)));
	}

}
