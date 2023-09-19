package course47;

public class Try {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			int result = divideNumbers(10, 2);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e);
		}
		///////これはmainメソッドの外に書いて////////

		try {
			int number2 = 5;
			if (100 / number2 == 20) {
				System.out.println("numberは5です。");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			int number = 5;
			if (10 / number == 2) {
				System.out.println("numberは5です。");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		int[] array = { 1, 2, 3 };
		try {
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static int divideNumbers(int a, int b) {
		return a / b;
	}

}
