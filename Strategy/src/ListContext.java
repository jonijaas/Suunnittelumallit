import java.util.ArrayList;
import java.util.List;

public class ListContext {
	private ListConverter strategy;
	List<String> list;
	
	public ListContext(ListConverter st) {
		this.strategy = st;
		this.list = new ArrayList<String>();
	}
	
	public void addList(String data) {
		list.add(data);
	}
	
	public String convertList() {
		return strategy.listToString(this.list);
	}
	
	public void setStrategy(ListConverter st) {
		this.strategy = st;
	}
}
