import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccumulatorWithLock extends Accumulator {
	private final Lock lock = new ReentrantLock();

	@Override
	public void add(int amount) {
		try {
			lock.lock();
			super.add(amount);
		} finally {
			lock.unlock();
		}
	}
}
