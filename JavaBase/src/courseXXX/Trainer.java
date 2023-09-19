package courseXXX;

import java.util.Random;

public class Trainer {
	int c = 0;
	String name;
	Pocketon[] myPockes;

	Trainer() {
		name = "";
		myPockes = new Pocketon[6];
	}

	void capture(Pocketon pocke) {
		
		Random rud = new Random();
		int ra = rud.nextInt(10) + 1;
		if (ra > pocke.diffcult) {

			myPockes[c] = pocke;
			c = c + 1;
			//c+=1;
			//c++;
			System.out.println("捕獲成功");
			System.out.println("仲間になった");
		} else {
			System.out.println("捕獲失敗");
			System.out.println("仲間にならなかった");
		}
	}

	void display() {
		for (int Q = 0; Q < 6; Q++) {
			if (myPockes[Q] != null) {
				System.out.println("名前");
				System.out.println(myPockes[Q].name);
				System.out.println("属性");
				System.out.println(myPockes[Q].type);
				System.out.println("ちから");
				System.out.println(myPockes[Q].power);
				System.out.println("捕獲難易度");
				System.out.println(myPockes[Q].diffcult);
			}
		}
	}

}