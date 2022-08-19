
public class Ananas extends PizzaTaytteet{
	private double hinta = 1;
	
	public Ananas(Pizza lisattavaTayte) {
		super(lisattavaTayte);
	}
	
	@Override
	public double getHinta() {
		return super.getHinta() + this.hinta;
	}

	@Override
	public String getKuvaus() {
		return super.getKuvaus() + "Ananas ";
	}

}
