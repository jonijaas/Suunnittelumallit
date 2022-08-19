import java.util.List;

public class StrategyC implements ListConverter{

	@Override
	public String listToString(List<String> list) {
		// listan läpikäynti for-loopissa käyttäen List-rajapinnan get-metodia, rivinvaihto joka kolmannen alkion jälkeen
		String returnString = "";
		
		for(int i = 0; i < list.size(); i++) {
			if((i+1) % 3 == 0) {
				returnString += list.get(i) + "\n";
			} else {
				returnString += list.get(i);
			}
		}
		
		return returnString;
	}

}
