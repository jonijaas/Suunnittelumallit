/*
 * @author Joni Jääskeläinen
 */
public class Main {
	public static void main(String[] args) {
		Kello kello = new Kello();
		System.out.println("Kello näyttää aikaa " + kello.naytaAika());
		
		Kello kelloklooni = kello.clone();
		System.out.println("Kellon klooni näyttää aikaa " + kelloklooni.naytaAika());
		
		kello.asetaAika(10, 10, 10);
		System.out.println("\nKello näyttää aikaa " + kello.naytaAika());
		System.out.println("Kellon klooni näyttää aikaa " + kelloklooni.naytaAika());
		
		kelloklooni.asetaAika(5, 15, 25);
		System.out.println("\nKello näyttää aikaa " + kello.naytaAika());
		System.out.println("Kellon klooni näyttää aikaa " + kelloklooni.naytaAika());
	}
}
