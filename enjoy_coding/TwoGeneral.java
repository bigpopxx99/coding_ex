
public class TwoGeneral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1 2 3
		//4 5 6
		//7 8 9
		int pos = 11;
		while (pos <= 99) {
			if (pos % 10 == 0) {
				pos++;
				continue;
			}else {
				if (pos/10 % 3 == pos % 10 % 3) {
					pos++;
					continue;
				}else {
					System.out.print(pos+" ");
					pos++;
				}
			}
		}
	}

}
