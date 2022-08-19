import java.util.Scanner;

/*
 * @author Joni Jääskeläinen
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("Tervetuloa pelaamaan!");
		Scanner lukija = new Scanner(System.in);
		System.out.print("Montako pelaajaa? ");
		int pelaajat = Integer.valueOf(lukija.nextLine());
		
		Game peli = new NoppaGame();
		peli.playOneGame(pelaajat);
	}
}
