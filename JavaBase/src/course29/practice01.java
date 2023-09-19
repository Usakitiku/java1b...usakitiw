package course29;

import java.util.Scanner;

class practice01 {
	int s;

	void ppp(practice01 po) {
		System.out.println(po);
	}

	public static void main(String[] args) {
		practice01 p = new practice01();
		p.s = 10;
		p.ppp(p);
		Character me = new Character();
		Scanner stdIn = new Scanner(System.in);
		me.name = stdIn.next();
		me.hp = stdIn.nextInt();
		me.str = stdIn.nextInt();
		me.dex = stdIn.nextInt();
		me.agi = stdIn.nextInt();
		me.def = stdIn.nextInt();

		Character tonari = new Character();
		tonari.name = "とり吉";
		tonari.hp = 200000000;
		tonari.str = 5000;
		tonari.dex = 50;
		tonari.agi = 30;
		tonari.def = 40;
		me.viewStatus();
		tonari.viewStatus();
		me.battle(me, tonari);
	}

}
