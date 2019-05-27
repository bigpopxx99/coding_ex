import java.util.ArrayList;
import java.util.List;

public class ReadBinaryWatch {

	public List<String> readBinaryWatch(int num) {
		List<String> list = new ArrayList<>();
		if (num < 0) {
			return list;
		}
		if (num == 0) {
			list.add("0:00");
			return list;
		}
		if (num > 8) {
			return list;
		}
		traversing(list, num, 0, 0);
		return list;
	}

	private void traversing(List<String> list, int num, int left, int selected) {
		if (num == 1) {
			for (int i = left; i < 10; i++) {
				int tmp = selected + (int) Math.pow(2, 10 - i - 1);
				if (!isValid(tmp)) {
					continue;
				} else {
					String timeStr = getTimeStr(tmp);
					list.add(timeStr);
				}
			}
			return;
		} else {
			for (int j = left; j + num - 1 < 10; j++) {
				int tmp = selected + (int) Math.pow(2, 10 - j - 1);
				if (!isValid(tmp)) {
					continue;
				} else {
					traversing(list, num - 1, j + 1, tmp);
				}
			}
		}
	}

	private boolean isValid(int selected) {
		if (((selected >> 4) & 0x3F) >= 60) {
			return false;
		}
		if ((selected & 0xF) >= 12) {
			return false;
		}
		return true;
	}

	private String getTimeStr(int selected) {
		int hour = selected & 0xF;
		int min = (selected >> 4) & 0x3F;

		String hourStr = "" + hour;
		String minStr = min > 9 ? "" + min : "0" + min;
		return hourStr + ":" + minStr;
	}

	public static void main(String[] args) {
		int t = 8;
		ReadBinaryWatch r = new ReadBinaryWatch();
		List<String> list = r.readBinaryWatch(t);
		Utils.printList(list);
	}

}
