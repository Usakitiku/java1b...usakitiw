package course28;

public class sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Chr kazima = new Chr();
		 kazima.attack = 230 * 10;
		 kazima.def = 500;
		 kazima.spd = 10;
		 kazima.love = 0;
		 kazima.mp = 300;
		 kazima.hp = 200;
		
		 Chr numata = new Chr();
		 numata.attack = 230 * 10;
		 numata.def = 500;
		numata .spd = 10;
		 numata.love = 0;
		numata.mp = 300;
		numata.hp = 200;
		 kazima.naguru( kazima.attack,numata.def);
	}

}
