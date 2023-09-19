package course17;

public class sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		char c1 = 50;
		char c2 = 'A';
		char c3 = '字';
		System.out.println(c1 + c2 + c3);
		int num = 50;
		char moji = 50;
		System.out.println("intだったら５０は" + num);
		System.out.println("charだったら５０は" + moji);
		for (long i = 1; i > 0;) {
			i = i *2;
			System.out.println(i);
		}

		byte bynum = 127;
		short shortnum = 32767;
		int intnum = 2147483647;
		System.out.println(bynum);
		System.out.println(shortnum);
		System.out.println(intnum);

	}
}
