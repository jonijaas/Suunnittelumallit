import java.util.Random;
import java.util.Scanner;

public class NoppaGame extends Game {

	private int[] pisteet;
	private int tavoite;
	Random randomluku;
	Scanner lukija = new Scanner(System.in);
	
	@Override
	void initializeGame() {
		System.out.println("\nPelataan noppapeliä. Voittaja on se, joka pääsee ensiksi tavoitteeksi asetettuun pistemäärään noppaa heittämällä.\nJos pisteet menee yli tavoitteen, pelaaja joutuu aloittamaan alusta.");
		System.out.print("Pelissä mukana on seuraavat pelaajat: ");
		for(int i = 0; i<playersCount; i++) {
			System.out.print("Pelaaja" + (i+1) + " ");
		}
		System.out.print("\nAseta pelin voittoon vaadittava tavoitepistemäärä: ");
		tavoite = Integer.valueOf(lukija.nextLine());
		pisteet = new int[playersCount];
		randomluku = new Random();
		System.out.println("\nPELI ALKAA\n---------------------------------------------");
	}

	@Override
	void makePlay(int player) {
		int heitto = randomluku.nextInt(6) + 1;
		System.out.println("\nPelaaja" + (player+1) + " vuoro:");
		System.out.print("---Paina Enter heittääksesi noppaa---");
		while(lukija.nextLine() != "") {
			lukija.nextLine();
		}
		System.out.println("Heitit luvun " + heitto);
		pisteet[player] += heitto;
		if(pisteet[player] > tavoite) {
			System.out.println("Sinulla on nyt yhteensä " + pisteet[player] + " pistettä, pisteesi meni kuitenkin yli tavoitteen ja joudut aloittamaan nollasta");
			pisteet[player] = 0;
		} else {
			System.out.println("Sinulla on nyt yhteensä " + pisteet[player] + " pistettä");
		}
	}

	@Override
	boolean endOfGame() {
		for(int i = 0; i < pisteet.length; i++) {
			if(pisteet[i] == tavoite) {
				return true;
			}
		}
		return false;
	}

	@Override
	void printWinner() {
		System.out.println("\n---------------------------------------------\nPELI PÄÄTTYI");
		int indexOfVoittaja = 0;
		for(int i = 0; i<pisteet.length; i++) {
			if(pisteet[i] == tavoite) {
				indexOfVoittaja = i;
			}
		}
		System.out.println("Pelin voittaja on Pelaaja" + (indexOfVoittaja+1));
		System.out.println("Hän saavutti ensiksi asetetun tavoitteen eli " + tavoite + " pistettä");
	}

}
