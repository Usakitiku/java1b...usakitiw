package course31;

public class Books {
	String name;
	int page;
	String author;

	Books(String n, int p, String a) {
		name = n;
		page = p;
		author = a;
	}

	void display() {
		System.out.println(name);
		System.out.println(page);
		System.out.println(author);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
