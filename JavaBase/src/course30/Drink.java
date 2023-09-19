package course30;

public class Drink {
	int price;
	int price1;
	String name;

	Drink(int p, String n) {
		price = p;
		name = n;
	}

	static int calcSum(int price, int suryo) {
		int sum = price * suryo;
		return sum;
	}

	void display() {
		System.out.println( );
	}
}
