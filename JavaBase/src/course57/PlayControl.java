package course57;

import java.util.Random;
import java.util.Scanner;

public class PlayControl {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String b = null;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int pt1 = 0;
		int pt2 = 0;
		int pt3 = 0;
		int pt4 = 0;
		int pt5 =0;
		String syoubu = null;
		Player me = new Player();
		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();
		System.out.print("あららそこの貴方…");
		aa();
		System.out.print("貴方は七日以内に告白しないと死にますわ～ｗ");
		aa();
		System.out.print("あらら自己紹介がまだでしたわね");
		aa();
		System.out.print("初めまして私はデスゲーム運営役員の一人ですわ！");
		aa();
		System.out.print("というわけで今回のデスゲームは");
		aa();
		System.out.print("セミファイナル恋愛シュミレーション（笑）");
		aa();
		System.out.print("まったくセンスの無いネーミングセンスですこと！");
		aa();
		System.out.print("せっかく機会なので…思い人にでも告白する");
		aa();
		System.out.print("な～んていうのもいいかもしれませんｗ");
		aa();
		System.out.print("わたくしも最低限のフォローは致しますので");
		aa();
		System.out.print("せいぜい頑張ってくださいｗ");
		aa();
		System.out.print("…コホン");
		aa();
		System.out.print("というわけで始まりました説明の時間ですわ");
		aa();
		System.out.print("制限時間は七日間、その中で一日に一回");
		aa();
		System.out.print("貴方のステータスを1上げることができますわ");
		aa();
		System.out.print("そしてせめてもの情けとして");
		aa();
		System.out.print("一日一回ランダムに彼女のステータスを教えますわ");
		aa();
		System.out.print("あと最後の七日目に告白―");
		aa();
		System.out.print("貴方が彼女に勝てそうなステータスを選んで告白しなさい");
		aa();
		System.out.print("はーい後は時の運次第ｗ");
		aa();
		System.out.println("頑張ってくださいｗ");
		aa();
		System.out.println("デスゲームスタート");
		aa();
		System.out.print("それでは名前教えてください。");
		String name1 = stdIn.next();

		System.out.print("あら、貴方の名前なんて聞いてないわ");
		aa();
		System.out.print("あなたの好きな人の名前を教えてくださいまし");
		String name2 = stdIn.next();
		if (name1.equals(name2)) {
			System.out.print("あら失礼私が勘違いしていたようね…");
			aa();
		}

		System.out.print("…なるほど");
		aa();
		System.out.print("…まあ、いいでしょう");
		aa();
		System.out.print("それでは…開始。");
		aa();
		me.setBen(rnd.nextInt(5) + 1);
		me.setGaku(rnd.nextInt(5) + 1);
		me.setKin(rnd.nextInt(5) + 1);
		me.setMit(rnd.nextInt(5) + 1);
		Target koku = new Target();
		koku.setBen(rnd.nextInt(10) + 3);
		koku.setGaku(rnd.nextInt(10) + 3);
		koku.setKin(rnd.nextInt(10) + 3);
		koku.setMit(rnd.nextInt(10) + 3);

		me.para();
		for (int a = 0; a < 7; a++) {
			aa();

			System.out.println(a + 1 + "日目ですわ");

			System.out.println("何のトレーニングをするか選びなさい('ω')ノ");
			System.out.println("1.筋トレ　2.勉強　3.美容　4.ゲーム");
			f = 0;
			e = 1;
			do {

				String sentaku = stdIn.next();
				if (sentaku.equals("1")) {
					me.setKin(me.getKin() + 1);
					e = 0;

					f = 0;
					me.para();
				} else if (sentaku.equals("2")) {
					me.setBen(me.getBen() + 1);
					e = 0;
					f = 0;
					me.para();
				} else if (sentaku.equals("3")) {
					me.setMit(me.getMit() + 1);
					e = 0;
					f = 0;
					me.para();
				} else if (sentaku.equals("4")) {
					me.setGaku(me.getGaku() + 1000);

					e = 0;
					f = 0;
					me.para();
				}

				if (sentaku.equals("1154")) {
					System.out.print("私はこっそり惚れ薬を使用した");
					aa();
					System.out.print("すべてのステータスがすごく増えました");
					me.setKin(me.getKin() + 1000);
					me.setBen(me.getBen() + 1000);
					me.setMit(me.getMit() + 1000);
					me.setGaku(me.getGaku() + 1000);
					e = 0;
					pt5=1;
				} else if (f != 100) {
					if (e != 0) {
						f++;
						e++;
				
					}
					pt3 = 1;
					if (pt2 == 1) {
						System.out.println("…");
						aa();
						System.out.println("1.筋トレ　2.勉強　3.美容　4.ゲーム");
					} else if (f == 1) {
						pt1 = 1;
						System.out.print("貴方選択という概念をご存知でしょうか？");
						aa();
						System.out.print("幼稚なあなたに注意しておきますが…");
						aa();
						System.out.print("数字を打たないと選択できないのですわよ");
						aa();
						System.out.println("間違っても文字を入れようなんて考えないですわよね？");
						aa();
						System.out.print("1.筋トレ　2.勉強　3.美容　4.ゲーム");

					} else if (f >= 2 && f <= 10) {

						System.out.print("信じられないわ…");
						aa();
						System.out.print("貴方……" + (e - 1) + "回も間違えるなんて…");
						aa();
						System.out.print("流石に引くわ…");
						aa();
						System.out.println("1.筋トレ　2.勉強　3.美容　4.ゲーム");

					} else if (f == 11) {
						pt2 = 1;
						System.out.print("貴方…どうしようもないドMなのね…");
						aa();
						System.out.print("煽られて喜ぶなら…もうしゃべらないわ…");
						aa();
						System.out.println("1.筋トレ　2.勉強　3.美容　4.ゲーム");
					}
				}
				//イベント発生
				cc(pt1, e);

			} while (e > 0);

			pt1 = 0;
			int totyuu = rnd.nextInt(4) + 1;

			if (totyuu == 1) {
				b = "筋力";
				c = koku.getKin();
				d = me.getKin();

			} else if (totyuu == 2) {
				b = "勉強";
				c = koku.getBen();
				d = me.getBen();
			} else if (totyuu == 3) {
				b = "外見";
				c = koku.getMit();
				d = me.getMit();
			} else if (totyuu == 4) {
				b = "人望";
				c = koku.getGaku();
				d = me.getGaku();
			}
			if (c > d) {
				System.out.println("貴方の" + b + "は彼女より" + (c - d) + "不足してますわ！");
			} else if (c <= d) {
				System.out.println("貴方の" + b + "は彼女が満足するレベルですわｗ");

			}
		}
		f = 0;

		e = c;
		f = d;
		do {
			System.out.println("勝負するパラメータを選択しくださいまし");
			System.out.println("1.筋力2.勉強3.外見4.人望");
			syoubu = stdIn.next();
			if (syoubu.equals("1")) {
				b = "筋力";
				c = koku.getKin();
				d = me.getKin();

			} else if (syoubu.equals("2")) {
				b = "勉強";
				c = koku.getBen();
				d = me.getBen();
			} else if (syoubu.equals("3")) {
				b = "外見";
				c = koku.getMit();
				d = me.getMit();
			} else if (syoubu.equals("4")) {
				b = "人望";
				c = koku.getGaku();
				d = me.getGaku();
			} else if (syoubu.equals("君が好きだ")) {
				if (pt4 == 1) {
					System.out.println("いえ生理的に受け付けませんわぁww");
					aa();
				} else {
					System.out.println("どうしたのです？");
					aa();
					System.out.println("私なんかに告白だなんて…");
					aa();
					System.out.println("まあ勿論お断りなのですが");
					aa();
					System.out.println("まったく七日間で心変わりする人の神経が知れませんわ…");
					aa();
					System.out.println("それこそ…");
					aa();
					System.out.println("初めからわたくしに告白していたら…");
					aa();
					System.out.println("いえ生理的に受け付けませんわぁww");
					pt4 = 1;
				}
			}
		} while (!(syoubu.equals("1")) && !(syoubu.equals("2")) && !(syoubu.equals("3")) && !(syoubu.equals("4")));
		if (c <= d) {
			if (e <= f) {if(pt5==1)	{System.out.println("残念、死ななかったわね");
			aa();
			System.out.print("デスゲーム実行委員会の女は突如虚空に消えた");
			aa();System.out.print("…");
			aa();System.out.print("すごい…効果");
			aa();
			System.out.print("これを使えば誰でも簡単に惚れさせる事ができるんじゃないかな…？");
			aa();
			System.out.print("「君が好きだ」って言えば…");
			
			}else {		
				System.out.println("残念、死ななかったわね");
				aa();
				System.out.print("デスゲーム実行委員会の女は突如虚空に消えた");
				aa();
				System.out.print("どうせインチキ転移能力でも使ったのではないだろうか");
				aa();
				System.out.print("ふと下を見ると");
				aa();
				System.out.print("彼女が消えた場所に何かか落ちている");
				aa();
				System.out.println("そこには1154と書いてある薬が落ちていた");
				aa();
				System.out.println("惚れ…薬？");}
			} else {
				System.out.println("GAMEOVER");

			}
		} else {
			System.out.println("GAMEOVER");
		}

	}

	static void aa() {
		Scanner stdIn = new Scanner(System.in);
		String q = stdIn.nextLine();
		if (q.equals("1154")) {
			System.out.println("今は使うタイミングでは無いようだ…");
		}
	}

	static void bb(int a) {
		switch (a) {
		case 1:
		}
	}

	static void cc(int a, int e) {
		if (a == 1 && e == 0) {
			System.out.println("やっと理解してくれましたわね…");
		}
	}
}