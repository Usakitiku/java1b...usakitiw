package course55;

import java.util.Scanner;

public class TyphoonControll {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int b = stdIn.nextInt();
		int D = 0;
		Typhoon Typhoon1 = new Typhoon(1, "2022年4月8日", "マラカス");
		Typhoon Typhoon2 = new Typhoon(2, "2022年4月10日", "メーギー");
		Typhoon Typhoon3 = new Typhoon(3, "2022年6月30日", "チャバ");
		Typhoon Typhoon4 = new Typhoon(4, "2022年7月1日", "アイレー");
		Typhoon Typhoon5 = new Typhoon(5, "2022年7月28日", "ソングダー");
		Typhoon Typhoon6 = new Typhoon(6, "2022年7月31日", "トローセス");
		Typhoon Typhoon7 = new Typhoon(7, "2022年8月9日", "ムーラン");
		Typhoon Typhoon8 = new Typhoon(8, "2022年8月12日", "メアリー");
		Typhoon Typhoon9 = new Typhoon(9, "2022年8月22日", "マーゴン");
		Typhoon Typhoon10 = new Typhoon(0, "", "");
		Typhoon Typhoon11 = new Typhoon(0, "", "");
		Typhoon Typhoon12 = new Typhoon(0, "", "");
		Typhoon Typhoon13 = new Typhoon(0, "", "");
		Typhoon Typhoon14 = new Typhoon(0, "", "");
		Typhoon Typhoon15 = new Typhoon(0, "", "");
		Typhoon[] t = new Typhoon[15];
		t[0] = Typhoon1;
		t[1] = Typhoon2;
		t[2] = Typhoon3;
		t[3] = Typhoon4;
		t[4] = Typhoon5;
		t[5] = Typhoon6;
		t[6] = Typhoon7;
		t[7] = Typhoon8;
		t[8] = Typhoon9;
		if (b == 0) {

			qq(t, 0);

		} else if (b == 99) {
			int c = stdIn.nextInt();
			String d = stdIn.next();
			t[c - 1].setAsiaName(d);
			qq(t, 0);
		} else if (b == 55) {
			int X = stdIn.nextInt();
			for (int Y = 0; Y < X; Y++) {
				int BN = stdIn.nextInt();
				String TI = stdIn.next();
				String NA = stdIn.next();

				t[8 + Y].setAsiaName(NA);
				t[8 + Y].setHasseibi(TI);
				t[8 + Y].setTyphoonbango(BN);
				D = Y;
			}
		}

		qq(t, D);
		System.out.println();
	}

	static void qq(Typhoon[] t, int Y) {
		for (int a = 0; a < Y + 9; a++)
			System.out.println(t[a].getAsiaName());
	}
}