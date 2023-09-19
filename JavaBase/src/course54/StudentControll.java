package course54;

public class StudentControll {
	public static void main(String[] args) {
		Student tonari = new Student(1, "伊藤　功惺");
		Student me = new Student(4, "臼井　優太朗");
		Student[] mymen = new Student[2];
		mymen[0] = tonari;
		mymen[1] = me;
		mymen[1].setName("なわ");
		System.out.println(mymen[1].getName());
	}
}