import java.util.Random;

public class Arvuuttaja { //originator
	Random random;
	
	public Arvuuttaja() {
		random = new Random();
	}
	
	public synchronized Memento liityPeliin() {
		return new Memento(random.nextInt(11));
	}
	
	public synchronized boolean arvaa(Object obj, int arvaus) {
		Memento memento = (Memento) obj;
		if(memento.numero == arvaus) {
			System.out.println("Arvaus oikein! Luku oli " + memento.numero);
			return true;
		} else {
			System.out.println("Arvaus väärin!");
			return false;
		}
	}
	
	private class Memento{
		private int numero;
		
		public Memento(int numero) {
			this.numero = numero;
		}
	}
}
