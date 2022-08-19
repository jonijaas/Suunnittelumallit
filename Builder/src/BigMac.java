import java.util.ArrayList;
import java.util.List;

public class BigMac {
	private List<Osat> bigmac;
	
	public BigMac() {
		bigmac = new ArrayList<Osat>();
	}
	
	public void lisaa(Osat osa) {
		bigmac.add(osa);
	}
	
	public String toString() {
		String palautettava = "";
		for(Osat osa : bigmac) {
			palautettava += osa.toString() + "\n";
		}
		return palautettava;
	}
}
