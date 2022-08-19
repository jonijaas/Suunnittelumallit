import Adapter.*;
/*
 * @author Joni Jääskeläinen
 */
public class Main {
	public static void main(String[] args) {
		ITili tili1 = new EuroTili(100);
		USDollariTili tili2 = new USDollariTili(200);
		
		//Valuuttakurssi euroista dollareiksi 20.4.2022
		double valuuttakurssi = 1.08;
		
		DollaritEuroiksiAdapteri muunnin = new DollaritEuroiksiAdapteri(tili2, valuuttakurssi);
		
		System.out.println("Alkutilanne:");
		System.out.println("Eurotilin saldo: " + String.format("%.2f",tili1.saldoEuroina()) + " €");
		System.out.println("Dollaritilin saldo: " + String.format("%.2f", tili2.saldoDollareina()) + " $");
		System.out.println("Yhteensä: " + String.format("%.2f", (tili1.saldoEuroina() + muunnin.saldoEuroina())) + " €");
		
		System.out.println("\nLisätään molemmille tileille 10 €");
		tili1.lisaaEuroja(10);
		muunnin.lisaaEuroja(10);
		
		System.out.println("\nLisäysten jälkeen:");
		System.out.println("Eurotilin saldo: " + String.format("%.2f", tili1.saldoEuroina()) + " €");
		System.out.println("Dollaritilin saldo: " + String.format("%.2f", tili2.saldoDollareina()) + " $");
		System.out.println("Yhteensä: " + String.format("%.2f", (tili1.saldoEuroina() + muunnin.saldoEuroina())) + " €");
		
	}
}
