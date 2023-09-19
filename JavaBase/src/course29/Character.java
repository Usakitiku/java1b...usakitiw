package course29;

public class Character {

	String name;
	int hp;
	int str;

	int dex;
	int agi;
	int def;

	void viewStatus() {
		System.out.println(name + "のステータスは");
		System.out.println("hp:" + hp);
		System.out.println("攻撃力" + str);
		System.out.println("防御力" + def);
		System.out.println("命中率" + dex);
		System.out.println("回避率" + agi);

	}

	void battle(Character me, Character tonari) {
		System.out.println(me.name + "と" + tonari.name + "の熱い戦いが始まる・・・！");

		//hpが続く限り戦いを続けるための処理
		while (me.hp > 0 && tonari.hp > 0) {

			//player1とplayer2のagiを比較して、高い方が先制攻撃！
			if (me.agi < tonari.agi) {
				me.hp = me.def + me.hp - tonari.str;
			} else {
				tonari.hp = tonari.def + tonari.hp - me.str;
			}
			//攻撃は「攻撃者のstr - 被攻撃者のdef」の結果を相手を被攻撃者のHPから引く
			//先制攻撃終了後、agiの低い方が攻撃を行う。
			if (me.agi < tonari.agi) {
				tonari.hp = tonari.def + tonari.hp - me.str;
			} else {
				me.hp = me.def + me.hp - tonari.str;

			}
			System.out.println("とり吉のHP" + tonari.hp);
			System.out.println(me.name+"HP" + me.hp);
		}
		if (me.hp <= 0) {
			System.out.print(me.name);
		} else {
			System.out.print(tonari.name);
		}
		System.out.println("は死亡した。だが、皆の記憶の中で生き続ける。");

	}
}
