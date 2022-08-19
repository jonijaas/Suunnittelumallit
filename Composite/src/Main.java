import Composite.*;

/*
 * @author Joni Jääskeläinen
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("Kasataan tietokone, joka sisältää kotelon, prosessorin, 2x muistipiiriä, emolevyn, verkkokortin ja näytönohjaimen.");
		Laiteosa tietokone = new Kotelo();
		Laiteosa prosessori = new Prosessori();
		Laiteosa muistipiiri = new Muistipiiri();
		Laiteosa emolevy = new Emolevy();
		Laiteosa verkkokortti = new Verkkokortti();
		Laiteosa naytonohjain = new Naytonohjain();
		
		emolevy.add(muistipiiri);
		emolevy.add(muistipiiri);
		emolevy.add(verkkokortti);
		emolevy.add(prosessori);
		tietokone.add(emolevy);
		tietokone.add(naytonohjain);

		System.out.println("\nKasatun tietokoneen hinta: " + tietokone.hinta());
		
	}
}
