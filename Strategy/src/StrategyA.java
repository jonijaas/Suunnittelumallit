import java.util.Iterator;
import java.util.List;

public class StrategyA implements ListConverter{

	@Override
	public String listToString(List<String> list) {
		// listan läpikäynti iteraattorilla ja rivinvaihto jokaisen alkion jälkeen
		Iterator<String> iterator = list.iterator();
		String returnString = "";
		
		while(iterator.hasNext()) {
			returnString += iterator.next() + "\n";
		}
		return returnString;
	}

}
