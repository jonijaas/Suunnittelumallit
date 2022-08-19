import java.util.Iterator;

public class IteratorThread extends Thread{
	private Iterator<String> iterator;
	private int id;
	
	public IteratorThread(Iterator<String> iterator, int id) {
		this.iterator = iterator;
		this.id = id;
	}
	
	public void run() {
		while(this.iterator.hasNext()) {
			System.out.println("Iteraattori " + this.id + ": " + this.iterator.next());
		}
	}
}
