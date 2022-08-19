/*
 * @author Joni Jääskeläinen
 */
public class Main {
	public static void main(String[] args) {
		Pizza pizza1 = new Ananas(new Aurajuusto(new Kinkku(new Tomaattikastike(new PizzaPohja()))));
		Pizza pizza2 = new Salami(new Herkkusieni(new Tomaattikastike(new PizzaPohja())));
		Pizza pizza3 = new Herkkusieni(new Salami(new Tonnikala(new Tomaattikastike(new PizzaPohja()))));
		
		System.out.println("Menu:");
		System.out.println("1. Pizza: " + pizza1.getKuvaus());
		System.out.println("Hinta: " + String.format("%.2f", pizza1.getHinta()) + "€");
		System.out.println("\n2. Pizza: " + pizza2.getKuvaus());
		System.out.println("Hinta: " + String.format("%.2f", pizza2.getHinta()) + "€");
		System.out.println("\n3. Pizza: " + pizza3.getKuvaus());
		System.out.println("Hinta: " + String.format("%.2f", pizza3.getHinta()) + "€");
	}
}