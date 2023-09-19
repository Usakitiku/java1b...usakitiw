package course34pair;

public class sample06 {
	
	static int a = 10;
	static int b = 20;
int s;

	sample06(int gh) {
		s = gh;
	}

	static int aa(int a, int b) {

		return a + b;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		sample06 a = new sample06(10);
		a.a = 10;
		a.b = 20;

		int z = a.aa(a.a, a.b);

		sample06 be = new sample06(10);
		be.s = 30;
		z = z + be.s;
		System.out.println();
		p(z);
	}

	static void p(int z) {
		System.out.println(z);

	}
}
