import java.util.Random;
import java.util.Scanner;

public class asobi01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//キャラ出現
		int gyar1 = 0;
		int gyasr1 = 0;
		int gyassr1 = 0;
		int gyasssr1 = 0;
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
		int skr2 = 1;
		int skr3 = 1;
		int skr4 = 1;

		//クリア報酬
		int hosyu = 100;
		int lvp = 0;
		Scanner stdIn = new Scanner(System.in);
Random rnd = new Random();
		int a = 0;
		
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
			if (as == 5) {
				a = 5;
			} else {
				//クエスト
				if (as == 1) {
					//戦闘力最終設定
					
					switch (game1) {
					//(≧▽≦)
					case 15876:
						atk1 = 100;
						skr1 = 4;
						break;
					case 59254:
						atk1 = atk1 + 60;
						skr1 = 2;
						break;
					case 20584:
						atk1 = 35;
						break;
					}
					switch (game2) {
					//(≧▽≦)
					case 15876:
						atk1 = atk1 + 100;
						skr2 = 4;

						break;
					case 59254:
						atk1 = atk1 + 60;
						skr2 = 2;
						break;
					case 20584:
						atk1 = atk1 + 35;
						break;
					}
					switch (game3) {
					//(≧▽≦)
					case 15876:
						atk1 = atk1 + 100;
						skr3 = 4;
						break;
					case 59254:
						atk1 = atk1 + 60;
						skr2 = 2;
						break;
					case 20584:
						atk1 = 35;
						break;
					}
					switch (game4) {
					//(≧▽≦)
					case 15876:
						atk1 = atk1 + 100;
						skr4 = 4;
						break;
					case 59254:
						atk1 = atk1 + 60;
						skr2 = 2;
						break;
					case 20584:
						atk1 = 35;
						break;
					}
					System.out.println("難易度");
					System.out.println("1,簡単");
					System.out.println("2,普通");
					System.out.println("3.難関");
					int stag = stdIn.nextInt();

					//難易度別ステージ
					switch (stag) {
					//難易度簡単
					case 1:

						System.out.println("クエスト開始");
						System.out.println("エンターキーで進む");
						String tpppp = stdIn.nextLine();
						//空白繰り返し
						for (int gad = 0; gad < 10; gad++) {
							System.out.println();
						}
						System.out.println("敵O敵");
						//敵HP
						for (int hp = 100; hp >= -1;) {
							String tpp = stdIn.nextLine();
							//空白繰り返し２
							for (int mg = 0; mg < 25; mg++) {
								System.out.println();
							}
							System.out.println(hp);
							hp = hp -
									1 * atk1 * skr1 * skr2 * skr3 * skr4;
							//撃破判定
							if (hp <= -1) {
								System.out.println("撃破");
								System.out.println("経験値　２・石　１　ゲット");
								hosyu = 1 + hosyu;

								lvp = lvp + 2;
							}
						}
						break;
					//難易度普通
					case 2:
						System.out.println("クエスト開始");
						System.out.println("エンターキーで進む");
						String tppp = stdIn.nextLine();
						//空白繰り返し
						for (int ads = 0; ads < 10; ads++) {
							System.out.println();
						}
						System.out.println("敵O敵");
						//敵HP
						for (int hp = 1000; hp >= -1;) {
							String tpp = stdIn.nextLine();
							//空白繰り返し２
							for (int mg = 0; mg < 25; mg++) {
								System.out.println();
							}
							System.out.println(hp);
							hp = hp - 1 * atk1 * skr1;
							//撃破判定
							if (hp <= -1) {
								System.out.println("撃破");
								System.out.println("経験値　5・石　2　ゲット");
								hosyu = 2 + hosyu;

								lvp = lvp + 5;

							}
						}
						break;
					case 3:
						System.out.println("クエスト開始");
						System.out.println("エンターキーで進む");
						var tppppp = stdIn.nextLine();
						//空白繰り返し
						for (int ads = 0; ads < 10; ads++) {
							System.out.println();
						}
						System.out.println("敵O敵");
						//敵HP
						for (int hp = 56000; hp >= -1;) {
							String tpp = stdIn.nextLine();
							//空白繰り返し２
							for (int mg = 0; mg < 25; mg++) {
								System.out.println();
							}
							System.out.println(hp);
							hp = hp - 1 * atk1 * skr1;
							//撃破判定
							if (hp <= -1) {
								System.out.println("撃破");
								System.out.println("経験値　5・石　2　ゲット");
								hosyu = 2 + hosyu;

								lvp = lvp + 5;

							}
						}
						break;
					} //↓クエスト終了
				} else {
					//ガチャ
					if (as == 2) {
						int ga = 0;
						//ガチャ本編
						while (ga < 3) {

							System.out.println("ガチャ");
							System.out.println("1,2,3,");
							int gatyasr = stdIn.nextInt();
							//選択
							switch (gatyasr) {
							//ガチャ終了
							case 3:
								ga = 3;
								break;
							//単発ガチャ
							case 1:
								if (hosyu >= 1) {
									hosyu = hosyu - 1;
									int g = rnd.nextInt(100) + 1;
									//あたり一覧
									//R
									if (g > 1 && g < 60) {

										System.out.println("R");
										int buk01 = rnd.nextInt(2) + 1;
										switch (buk01) {
										case 1:
											System.out.println("(´▽｀*)");
											gyar1 = gyar1 + 1;
											break;
										case 2:
											System.out.println("(^O^)");

										}

									} else {
										//SR
										if (g > 61 && g < 95) {
											System.out.println("SR");
											System.out.println("(;^ω^)");
											gyasr1 = gyasr1 + 1;
										} else {
											//SSR
											if (g > 96 && g < 100) {
												System.out.println("SSR");
												System.out.println("(≧▽≦)");
												gyassr1 = gyassr1 + 1;
											} else {
												if (g == 100) {
													System.out.println("SSSR");
													System.out.println("(=^・・^=)");
													gyasssr1 = gyasssr1 + 1;
												}
											}
										}
									}
								} //ガチャ終了
								break;
							case 2:
								//10連
								if (hosyu >= 10) {
									hosyu = hosyu - 10;

									for (int zyu = 0; zyu < 10; zyu++) {
										int gt = rnd.nextInt(100) + 1;
										//あたり一覧
										//R
										if (gt > 1 && gt < 60) {
											System.out.println("R");
										} else {
											//SR
											if (gt > 61 && gt < 95) {
												System.out.println("SR");
											} else {
												//SSR
												if (gt > 96 && gt < 101) {
													System.out.println("SSR");
													System.out.println("(≧▽≦)");
													gyassr1 = gyassr1 + 1;
												}
											}
										}
									}

								} //十連終了
							}//選択終了
						}
					} else {//キャラ編成

						if (as == 3) {
							//キャラ一覧
							System.out.println("キャラ一覧");
							System.out.println("1.編成　2.強化");
							System.out.println("SSR");
							//キャラ出現
							if (gyasssr1 > 0) {
								System.out.println("(=^・・^=)+" + gyasssr1);
								System.out.println("編成コード：34576");
								if (gyassr1 > 0) {
									System.out.println("(≧▽≦)+" + gyassr1);
									System.out.println("編成コード：15876");
								}
								if (gyasr1 > 0) {
									System.out.println("(;^ω^)+" + gyasr1);
									System.out.println("編集コード:59254");
								}
								if (gyar1 > 0) {
									System.out.println("(^O^)+" + gyar1);
									System.out.println("編集コード:20584");
								}
								int hens = stdIn.nextInt();
								if (hens == 1) {
									int ssr1h = gyassr1;
									//編成本編
									for (int hensyu = 1; hensyu <= 4;) {

										System.out.println(hensyu + "体目");
										int hens01 = stdIn.nextInt();
										switch (hens01) {
										
										case 34576:
											System.out.println("(≧▽≦)");
											//キャラ重複阻止								
											ssr1h = ssr1h - 1;

											switch (hensyu) {
											case 1:
												game1 = 34576;
												break;
											case 2:
												game2 = 34576;
												break;
											case 3:
												game3 = 34576;
												break;
											case 4:
												game4 = 34576;
												break;
											}
											break;
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
											break;
										case 20584:
											System.out.println("(^O^)");
											//キャラ重複阻止								
											ssr1h = ssr1h - 1;

											switch (hensyu) {
											case 1:
												game1 = 20584;
												break;
											case 2:
												game2 = 20584;
												break;
											case 3:
												game3 = 20584;
												break;
											case 4:
												game4 = 20584;
												break;
											}
										}
										hensyu++;

									}
									System.out.println("編集完了！");
									System.out.println("スペースで進む");
									String aasa = stdIn.nextLine();
								}
							} else {
								if (as == 4) {
								}

							}
						}

					}
				}
			}
		}
	}
}
