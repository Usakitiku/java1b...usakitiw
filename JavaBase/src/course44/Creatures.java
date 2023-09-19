package course44;

public class Creatures extends Life {
	private int weight;

	void eat(String food, int cal) {
		this.weight = this.weight + cal;
		System.out.println(food + "を食べた。体重が" + cal + "g増えた");
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
