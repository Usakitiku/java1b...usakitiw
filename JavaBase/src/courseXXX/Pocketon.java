package courseXXX;

public class Pocketon {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setype(String type) {
		this.type = type;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getDiffcult() {
		return diffcult;
	}

	public void setDiffcult(int diffcult) {
		this.diffcult = diffcult;
	}

	public int getGetted() {
		return getted;
	}

	public void setGetted(int getted) {
		this.getted = getted;
	}

	String name;
	String type;
	int power;
	int diffcult;
	int getted;

	Pocketon(String n, String t, int p, int d) {
		name = n;
		type = t;
		power = p;
		diffcult = d;
		getted = 0;
	}

	void display() {
		System.out.println(name);
		System.out.println(type);
		System.out.println(power);
		System.out.println(diffcult);
		System.out.println(getted);
	}
}
