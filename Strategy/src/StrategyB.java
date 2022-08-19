import java.util.List;

public class StrategyB implements ListConverter{

	@Override
	public String listToString(List<String> list) {
		// lista taulukoksi ja läpikäynti for-loopin avulla, rivinvaihto joka toisen alkion jälkeen
		String[] stringArray = new String[list.size()];
		list.toArray(stringArray);
		String returnString = "";
		
		for(int i = 0; i < stringArray.length; i++) {
			if((i+1)%2 == 0) {
				returnString += stringArray[i] + "\n";
			} else {
				returnString += stringArray[i];
			}
		}
		return returnString;
	}
}
