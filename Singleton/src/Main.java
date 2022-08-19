/*
 * @author Joni Jääskeläinen
 */
public class Main {
	public static void main(String[] args) {
		AbstractFactory apple = AppleFactory.getInstance();
		AbstractFactory samsung = SamsungFactory.getInstance();
		Tuotevalikoima t = new Tuotevalikoima();
		
		t.setFactory(apple);
		
		System.out.println(t);
		
		t.setFactory(samsung);
		
		System.out.println(t);
	}
}