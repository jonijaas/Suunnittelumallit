/*
 * @author Joni Jääskeläinen
 */
public class Main {
	public static void main(String[] args) {
		Kasittelija esimies = new Esimies();
		Kasittelija paallikko = new Paallikko();
		Kasittelija toimitusjohtaja = new Toimitusjohtaja();
		
		esimies.ylempiKasittelija(paallikko);
		paallikko.ylempiKasittelija(toimitusjohtaja);
		
		for(int i = 1; i <= 10; i++) {
			esimies.kasittelePyynto(i);
		}
	}
}
