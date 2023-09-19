package course15;

import java.util.Random;
import java.util.Scanner;

public class monndai01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.println("地下労働施設にて");
		System.out.println("カイジと大月班長の");
		System.out.println("丁半対決が");
		System.out.print("今");
		System.out.println("幕を開けるッ");
		System.out.println("ざわ……");

		int a = 10000;
		int c = 0;
		do {
			do {
				System.out.println("カイジ現在のペリカ" + a + "円分‼");
				System.out.println("さあカイジ君、掛け金を決めるんだ");
				int b = stdIn.nextInt();
				Random rnd = new Random();
				System.out.println("勝負だよカイジ君");
				int m = rnd.nextInt(6) + 1;
				System.out.println("カイジ運命の一投目…" + m);
				System.out.println("カイジ君、掛け金を変えるかい？");
				System.out.println("掛け金を、変える…変えない");
				String w = stdIn.next();
				if (b == 114514) {
					System.out.println();
				}
				if (w.equals("変える")) {
					int ww = stdIn.nextInt();
					b = ww;
				} else {
					if (w.equals("変えない")) {
						System.out.println("クク…カイジ君…");
					} else {
						System.out.println("日本語を話そうね、カイジ君");
					}
				}
				int u = rnd.nextInt(6) + 1;
				System.out.println("二投目、場の空気が静まり返る…" + u);
				System.out.println("今ならドロップアウト出来るよカイジ君");
				System.out.println("ドロップアウト…する…しない");
				String www = stdIn.next();
				if (www.equals("する")) {
					System.out.println("まだまだだね…カイジ君");
					System.out.println("クソっハンチョウ…！");
					c = -b * 2;
				}
				int n = rnd.nextInt(6) + 1;
				System.out.println("三投目、この目がすべてを決める…！！！…" + n);
				int X = rnd.nextInt(100) + 1;

				if (X == 100) {
					c = -b * 2;
				} else {
					if (m == n && m == u) {
						if (m == n && m == u && m == 1) {
							c = b * 5;
							System.out.println("インクは俺の血だ…！！");
						}
						if (m == n && m == u && m != 1) {
							c = b * 3;
							System.out.println("負けたよ…流石カイジ君…！");
						}
					} else {
						if (m == n || m == u || u == n) {
							c = b - b;
							System.out.println("何を考えてやがる…ハンチョウ…！");
						} else {
							if (m != n && n != u && m != u) {
								c = -b;
								System.out.println("まだチャンスはあるよ…カイジ君");
								if (m + n + u == 6) {
									c = -b * 2;
									System.out.println("まだだ…イカサマを暴くのは…");
									System.out.println("まだここじゃない");
								} else {
									if ((m == 4 || n == 4 || u == 4) && (m == 6 || n == 6 || u == 6)
											&& (n == 5 || m == 5 || u == 5)) {
										c = b * 2;
										System.out.println("キンキンに冷えてやがる…！");
									}
								}
							}

						}
					}
				}
				a = a + c;

			} while (a >= 1 && a < 50000);

			if (a <= 0) {
				System.out.println("カイジ1050年地下労働…");

			} else {
				if (a > 50000) {
					System.out.println("ノーカンノーカン…！");
				}
			}
			while (a <= 0) {
				String pp = stdIn.next();
				if (pp.equals("イカサマだ")) {
					System.out.println("大月班長四五六サイにイカサマ発覚…！");
					System.out.println("ノーカンノーカン…！！！");

				}
				for (int z = 0; z <= ５; z++) {
					System.out.println("大月班長の声もむなしくカイジのイカサマが始まる");
					int zzz = stdIn.nextInt();
					System.out.println("1");
					System.out.println("1");
					System.out.println("1");
					a = a + zzz * 5;
					System.out.println("カイジ現在のペリカ" + a + "円！！！");

				}
			}
		} while (a >= 50000);
		System.out.println("カイジ圧勝一か月の外出権を獲得…！！！");
	}
}