public class Accumulator {
	long value = 0;

	public void add(int amount) {
		this.value = value + amount;
	}

	public long get() {
		return value;
	}
}