package course30;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Drink p = new Drink(100, "初期データ");
		p.price = 150;
		p.price1 = 130;
		p.name = "午後の紅茶";
		int sum = p.calcSum(p.price, p.price1);
		System.out.println("合計は" + sum);
		Drink drink = new Drink(100, "初期データ");
		drink.display();
	}

}
