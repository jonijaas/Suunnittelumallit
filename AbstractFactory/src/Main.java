import AbstractFactory.*;

/*
 * @author Joni Jääskeläinen
 */
public class Main {
	public static void main(String[] args) {
		Henkilo jasper = new Henkilo("Jasper");
		AbstractFactory adidas = new AdidasFactory();
		AbstractFactory boss = new BossFactory();
		
		System.out.println(jasper.getNimi() + " on opiskeleva Java-koodaaja.");
		jasper.setFactory(adidas);
		System.out.println(jasper);
		
		System.out.println("\n" + jasper.getNimi() + " valmistui insinööriksi.");
		jasper.setFactory(boss);
		System.out.println(jasper);
	}
}
