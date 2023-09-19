import java.util.Random;
import java.util.Scanner;

public class asobi02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//キャラ出現
		int gyar1 = 0;
		int gyasr1 = 0;
		int gyassr1 = 0;
		//キャラコード
		int ssr01 = 15876;
		//キャラ編集重要
		int game1 = 0;
		int game2 = 0;
		int game3 = 0;
		int game4 = 0;

		//戦闘力
		int atk1 = 1;
		int skr1 = 1;

		//クリア報酬
		int hosyu = 100;
		int lvp = 0;
		Scanner stdIn = new Scanner(System.in);

		int a = 0;
		Random rnd = new Random();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("くそげー");
		System.out.println();
		System.out.println("エンターキーで進む");
		String stt = stdIn.nextLine();
		//メニュー部分終了
		while (a < 5) {
			System.out.println("メニュー");
			System.out.println("1,クエスト");
			System.out.println("2,ガチャ");
			System.out.println("3,編成");
			System.out.println("イベント");
			System.out.println("5,終了");
			int as = stdIn.nextInt();
			//終了
			
				//クエスト
				

						if (as == 3) {
							//キャラ一覧
							System.out.println("キャラ一覧");
							System.out.println("1.編成　2.強化");
							System.out.println("SSR");
							//キャラ出現
							if (gyassr1 > 0) {
								System.out.println("(≧▽≦)+" + gyassr1);
								System.out.println("編成コード：15876");
							}
							if (gyasr1 > 0) {
								System.out.println("(;^ω^)" + gyasr1);
								System.out.println("編集コード:59254");
							}
							if (gyar1 > 0) {
								System.out.println("(^O^)" + gyar1);

							}
							int hens = stdIn.nextInt();
							if (hens == 1) {
								int ssr1h = gyassr1;
								//編成本編
								for (int hensyu = 1; hensyu <= 4;) {

									System.out.println(hensyu + "体目");
									int hens01 = stdIn.nextInt();
									switch (hens01) {
									case 15876:
										System.out.println("(≧▽≦)");
										//キャラ重複阻止								
										ssr1h = ssr1h - 1;

										switch (hensyu) {
										case 1:
											game1 = 15876;
											break;
										case 2:
											game2 = 15876;
											break;
										case 3:
											game3 = 15876;
											break;
										case 4:
											game4 = 15876;
											break;
										}
										break;
									case 59254:
										System.out.println("(;^ω^)");
										switch (hensyu) {
										case 1:
											game1 = 59254;
											break;
										case 2:
											game2 = 59254;
											break;
										case 3:
											game3 = 59254;
											break;
										case 4:
											game4 = 59254;
											break;

										}
										

									}
								hensyu++;	}
									System.out.println("編集完了！");
									System.out.println("スペースで進む");
									String aasa = stdIn.nextLine();
								
							} 
								
								
							
						}
					}
					
				}
			}
		
	

