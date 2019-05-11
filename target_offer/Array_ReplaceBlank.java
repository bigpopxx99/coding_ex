public class Array_ReplaceBlank {

	/**
	 * 将一个字符串中的空格替换为%20.
	 * @param t
	 */
	// 时间复杂度O(n*n)
	private static void replaceBlank(char[] t) {
		// get string size
		int len = 0;
		while (t[len] != 0) {
			len++;
		}
		int index = 0;
		while (t[index] != 0) {
			if (t[index] == ' ') {
				for (int j = len - 1; j > index; j--) {
					t[j + 2] = t[j];
				}
				t[index] = '%';
				t[index + 1] = '2';
				t[index + 2] = '0';
				len += 2;
				index += 3;
			} else {
				index++;
			}

		}
	}

	// 时间复杂度O(n), 从右至左遍历，事先把空格流出来
	private static void replaceBlank2(char[] t) {
		if (t == null || t.length <= 0) {
			return;
		}
		// get string size and blank num
		int len = 0;
		int blank_num = 0;
		while (t[len] != 0) {
			len++;
			if (t[len] == ' ') {
				blank_num++;
			}
		}
		int totalLength = len + blank_num*2;

		int index = len - 1;
		int tIndex = totalLength-1;
		while (index >= 0) {
			if (t[index] == ' ') {
				for (int j=len-1; j>= index+1; j--) {
					t[tIndex] = t[j];
					tIndex--;
					len--;
				}
				t[tIndex] = '0';
				t[tIndex-1] = '2';
				t[tIndex-2] = '%';
				tIndex -= 3;
				len--;
				index--;
			} else {
				index--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] t1 = new char[40];
		String string = "hello world everyone.";
		for (int i = 0; i < string.length(); i++) {
			t1[i] = string.charAt(i);
		}
		System.out.print("before: ");
		printArray(t1);
		replaceBlank2(t1);
		System.out.print("after: ");
		printArray(t1);
	}

	private static void printArray(char[] c) {
		int index = 0;
		while (c[index] != 0) {
			System.out.print(c[index]);
			index++;
		}
		System.out.println();
	}

}
