package course28;

public class sample01 {
	//インスタンス
	//「hu1」はHumanのインスタンス（実体）
	//インスタンスに対してパラメータを設定する。
	public static void main(String[] args) {
		Human hu1 = new Human();
		hu1.name = "坂本";
		hu1.kotoba = "ラブ＆ピース";
		hu1.hp = 50;
		hu1.neru();
		System.out.println(hu1.name);
	}
}
