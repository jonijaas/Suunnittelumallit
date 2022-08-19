
public class Tomaattikastike extends PizzaTaytteet{
	private double hinta = 0.50;
	
	public Tomaattikastike(Pizza lisattavaTayte) {
		super(lisattavaTayte);
	}
	
	@Override
	public double getHinta() {
		return super.getHinta() + this.hinta;
	}

	@Override
	public String getKuvaus() {
		return super.getKuvaus() + "Tomaattikastike ";
	}
}
