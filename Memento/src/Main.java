/*
 * @author Joni Jääskeläinen
 */
public class Main {
	public static void main(String[] args) {
		Arvuuttaja arvuuttaja = new Arvuuttaja();
		Asiakas pelaaja1 = new Asiakas("Pelaaja1", arvuuttaja);
		Asiakas pelaaja2 = new Asiakas("Pelaaja2", arvuuttaja);
		Asiakas pelaaja3 = new Asiakas("Pelaaja3", arvuuttaja);
		
		pelaaja1.start();
		pelaaja2.start();
		pelaaja3.start();
	}
}
