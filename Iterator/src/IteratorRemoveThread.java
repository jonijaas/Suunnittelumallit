import java.util.Iterator;

public class IteratorRemoveThread extends Thread{
	private Iterator<String> iterator;
	private int id;
	
	public IteratorRemoveThread(Iterator<String> iterator, int id) {
		this.iterator = iterator;
		this.id = id;
	}
	
	public void run() {
		while(this.iterator.hasNext()) {
			System.out.println("Iteraattori " + id + " poistaa " + this.iterator.next());
			this.iterator.remove();
		}
	}
}
