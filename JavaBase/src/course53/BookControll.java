package course53;

public class BookControll {
	public static void main(String[] args) {

		Book book1 = new Book();

		Book book2 = new Book("ITワールド");
		Book Book3 = new Book("a", 3);
	System.out.println(Book3.getPrice());
	System.out.println(Book3.getTitle());
	}
}