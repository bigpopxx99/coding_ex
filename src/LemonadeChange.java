import java.util.ArrayList;
import java.util.List;

public class LemonadeChange {

	// public static boolean lemonadeChange(int[] bills) {
	// ArrayList<Integer> chargeList = new ArrayList<>();
	// for (int i=0; i<bills.length; i++) {
	// if (bills[i] > 5) {
	// if (!isFixCharge(chargeList, bills[i]-5)) {
	// return false;
	// }
	// }
	// insertChargeList(chargeList, bills[i]);
	// }
	// return true;
	// }
	//
	// public static void insertChargeList(List<Integer> list, int v) {
	// boolean isInsert = false;
	// for (int i=0; i<list.size(); i++) {
	// if (v < list.get(i)) {
	// list.add(i, v);
	// isInsert = true;
	// return;
	// }
	// }
	// if (!isInsert) {
	// list.add(v);
	// }
	// }
	//
	// public static boolean isFixCharge(List<Integer> list, int charge) {
	// int remainV = charge;
	// int listSize = list.size();
	// for (int i=listSize-1; i>=0; i--) {
	// if (list.get(i) <= remainV) {
	// remainV -= list.get(i);
	// list.remove(i);
	// if (remainV == 0) {
	// return true;
	// }
	// }
	// }
	// return false;
	// }

	public static boolean lemonadeChange(int[] bills) {
		int n5 = 0;
		int n10 = 0;
		for (int i = 0; i < bills.length; i++) {
			if (bills[i] == 5) {
				n5++;
			} else if (bills[i] == 10) {
				n5--;
				n10++;
			} else if (bills[i] == 20) {
				if (n10 > 0) {
					n10--;
					n5--;
				} else {
					n5 -= 3;
				}
			}
			if (n5 < 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t1 = { 5, 5, 5, 10, 20 };
		int[] t2 = { 5, 5, 10 };
		int[] t3 = { 10, 10 };
		int[] t4 = { 5, 5, 10, 10, 20 };
		int[] t5 = { 5, 5, 5, 10, 5, 5, 10, 20, 20, 20 };
		System.out.println(lemonadeChange(t1));
		System.out.println(lemonadeChange(t2));
		System.out.println(lemonadeChange(t3));
		System.out.println(lemonadeChange(t4));
		System.out.println(lemonadeChange(t5));
	}

}
