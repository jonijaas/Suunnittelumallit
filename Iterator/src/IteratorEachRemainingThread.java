import java.util.Iterator;

public class IteratorEachRemainingThread extends Thread {
	private Iterator<String> iterator;
	private int id;
	
	public IteratorEachRemainingThread(Iterator<String> iterator, int id) {
		this.iterator = iterator;
		this.id = id;
	}
	
	public void run() {
		while(this.iterator.hasNext()) {
			this.iterator.forEachRemaining((s) -> System.out.println(s));
		}
	}
}
