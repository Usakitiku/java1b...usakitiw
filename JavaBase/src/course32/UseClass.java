package course32;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Computer mypc =new Computer("初期NAME", "初期CPU", 0, "初期GURABO", 100,0);

	
		mypc.name = "KOKURI MACHNE";
		mypc.cpu = "intel conei9 13900H";
		mypc.memory = 16;
		mypc.gurabo = "RTX4070";
		mypc.price = 250000;
		int nebiki = 500;
	int aaa= mypc.display(nebiki);
	System.out.println(aaa);
	}

}
