
public class Tuotevalikoima {
	Puhelin puhelin;
	Kello kello;
	
	public void setFactory(AbstractFactory factory) {
		this.kello = factory.createAlykello();
		this.puhelin = factory.createMatkapuhelin();
	}
	
	
	public String toString() {
		return "Tuotteet: " + this.kello + " ja " + this.puhelin;
	}
}
