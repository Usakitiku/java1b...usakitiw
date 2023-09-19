package course32;

public class Computer {

	String name;
	String cpu;
	int memory;
	String gurabo;
	int price;

	Computer(String n, String c, int m, String g, int p ,int l) {
		name = n;
		cpu = c;
		memory = m;
		gurabo = g;
		price = p;
}
	

	 int display(int i){
	return price-i;
	}
}
