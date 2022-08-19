
public class Kerroshampurilainen {
	private StringBuilder kerros;
	
	public Kerroshampurilainen() {
		kerros = new StringBuilder();
	}
	
	public void lisaa(Osat osa) {
		kerros.append(osa + "\n");
	}
	
	public String toString() {
		return kerros.toString();
	}
}
