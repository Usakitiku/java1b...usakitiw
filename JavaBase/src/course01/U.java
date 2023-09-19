package course01;

public class U {

	public static void main(String[] args) {
		Sample01 ss =new Sample01();
		ss.a=10;
		ss.b=1;
		int a = 10;
		int b = 12;
		
		int c = kake(a, b);
		aaa(c);
	ss.bk();
	}

	static int kake(int x, int y) {
		return x * y;
	}

	static void aaa(int a) {
		System.out.println(a);
	}
}
