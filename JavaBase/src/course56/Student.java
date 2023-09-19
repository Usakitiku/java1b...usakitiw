
package course56;

public class Student extends Human implements Gimu {
	public void study() {
		System.out.println("やりたくない");
	}

	private int syussekibango;

	public int getSyussekibango() {
		return syussekibango;
	}

	public void setSyussekibango(int syussekibango) {
		this.syussekibango = syussekibango;
	}
}
