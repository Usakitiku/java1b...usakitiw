package course44;

public class UseClass {

	public static void main(String[] args) {

		Human human = new Human();
		//humanクラス
		human.setName("システム太郎");
		human.setHobby("プログラミング");
		human.setWeight(60000);
		human.disp();
		human.dispWeight();
		human.eat("ハンバーガー", 1200);
		human.dispWeight();
		human.setJumyou(3);
		human.death(human.getName());
	}

}
