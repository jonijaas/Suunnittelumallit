/*
 * @author Joni Jääskeläinen
 */
public class Main {
	public static void main(String[] args) {
		Pokemon pokemon = new Pokemon();
		
		System.out.println("Luotiin uusi Pokemon, Charmander.");
		System.out.println("Taistelu alkaa!\n");
		
		for(int i=0; i < 10; i++) {
			pokemon.tuliHyokkays();
			pokemon.puolusta();
			pokemon.iskuHyokkays();
		}
		
		System.out.println("Vastustaja tuhottu, taistelu loppuu.");
	}
}
