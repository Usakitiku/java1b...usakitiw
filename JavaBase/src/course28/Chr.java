package course28;

public class Chr {

	static int attack;
	static int def;
	static int spd;
	static int love;
	static int mp;
	static int hp;
	
	static void naguru(int naguruatk,int def) {
		System.out.println((naguruatk-def)+"のダメージ");}
	static void mamoru() {
		System.out.println("守りを固めて防御が"+(def*2)+"になった");}
}


