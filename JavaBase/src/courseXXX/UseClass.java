package courseXXX;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		System.out.println("ポケトンモンスター");
		System.out.println("");
		Scanner stdIn = new Scanner(System.in);
		Battle ba = new Battle();
		Trainer trainer = new Trainer();

		//トレーナーの名前を入力
		System.out.println("トレーナーの名前を入力してね。");
		String trainerName = stdIn.next();
		trainer.name = trainerName;
		int qw = 0;
		int menu = 0;

		do {
			//メニューを表示する。

			System.out.println(trainerName + ",メニューを選んでください。");
			System.out.println("1:捕獲する");
			System.out.println("2:図鑑を見る");
			System.out.println("3;バトル");
			System.out.println("99:おわる");
			menu = stdIn.nextInt();
			if (menu == 1) {
				Pocketon po = new Pocketon("", "", 0, 0);
				//捕獲プログラム
				System.out.println("ポケトンの名前を入力してや");
				String pockename = stdIn.next();
				System.out.println("ポケトンのタイプを入力してや");
				String pocketype = stdIn.next();
				System.out.println("戦闘力入れろや");
				int pockepower = stdIn.nextInt();
				System.out.println("捕獲難易度入れろや");
				int pockehokaku = stdIn.nextInt();
				po.name = pockename;
				po.type = pocketype;
				po.power = pockepower;
				po.diffcult = pockehokaku;

				trainer.capture(po);

			} else if (menu == 2) {
				//図鑑を表示
				trainer.display();
			} else if (menu == 3) {
				//battle

				System.out.println("自分の持っているキャラを選んでねー");
				System.out.println("一体目");
				String name01 = stdIn.next();
				for (int qq = 0; qq <= 5; qq++) {
					if (trainer.myPockes[qq] != null) {

						if (name01.equals(trainer.myPockes[qq].name)) {
							System.out.println("二体目");
							String name02 = stdIn.next();
							for (int ss = 0; ss <= 5; ss++) {
								if (trainer.myPockes[ss] != null) {

									if (name02.equals(trainer.myPockes[ss].name)) {
										String dss = ba.doBattle(trainer.myPockes[qq].name, trainer.myPockes[ss].name,
												trainer.myPockes[qq].type, trainer.myPockes[ss].type,
												trainer.myPockes[qq].power, trainer.myPockes[ss].power);
										System.out.println(trainer.myPockes[qq].name + "が");
										System.out.println(dss);
										if (dss.equals("勝ち")) {
											System.out.println("負けた" + trainer.myPockes[ss].name + "はもっと強くなれよ");
										} else {
											System.out.println(trainer.myPockes[qq].name + "はボコボコにされた屈辱で、芸能界を引退した");
										}
									}

								}

							}
						}

					}

				}

			} else if (menu == 99) {
				qw = 99;
				//処理終了
			}
		} while (qw == 0);
	}

	static void m() {
		System.out.println("持ってないよー");
	}
}
