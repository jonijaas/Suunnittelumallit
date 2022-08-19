import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * @author Joni Jääskeläinen
 */
public class Main {
	public static void main(final String[] arguments) {
        List<Image> valokuvakansio = new ArrayList<Image>();
		valokuvakansio.add(new ProxyImage("HiRes_10MB_Photo1", "kuva1"));
		valokuvakansio.add(new ProxyImage("HiRes_10MB_Photo2", "kuva2"));
		valokuvakansio.add(new ProxyImage("HiRes_10MB_Photo3", "kuva3"));
		valokuvakansio.add(new ProxyImage("HiRes_10MB_Photo4", "kuva4"));
		valokuvakansio.add(new ProxyImage("HiRes_10MB_Photo5", "kuva5"));
		
		System.out.println("Valokuvakansion kuvat:");
		for(Image kuva: valokuvakansio) {
			kuva.showData();
		}
		
		Scanner lukija = new Scanner(System.in);
		while(true) {
			System.out.println("\nKirjoita kuvan nimi, jota haluat katsoa tai kirjoita kaikki, jos haluat selata koko kansion läpi. Tyhjä syöte lopettaa selaamisen.");
			String syote = lukija.nextLine();
			if(syote.equals("")) break;
			for(Image kuva: valokuvakansio) {
				if(syote.equals(kuva.getImagename())) {
					kuva.displayImage();
				}
			}
			if(syote.equals("kaikki")) {
				System.out.println("\nSelataan kaikki kuvat läpi:");
				for(Image kuva: valokuvakansio) {
					kuva.showData();
					kuva.displayImage();
					System.out.println();
				}
			}
		}
		lukija.close();
    }
}
