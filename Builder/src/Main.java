/*
 * @author Joni Jääskeläinen
 */
public class Main {
	public static void main(String[] args) {
		Tarjoilija tarjoilija = new Tarjoilija();
		
		BurgerBuilder mcd = new McBuilder();
		BurgerBuilder hs = new HeseBuilder();
		
		System.out.println("McDonalds Big Mac:");
		tarjoilija.setBurgerBuilder(mcd);
		tarjoilija.kokoaBurger();
		System.out.println(mcd.getBurger());
		
		System.out.println("Hesburger kerroshampurilainen:");
		tarjoilija.setBurgerBuilder(hs);
		tarjoilija.kokoaBurger();
		System.out.println(hs.getBurger());
	}
}
