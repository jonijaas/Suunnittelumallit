
public class Kinkku extends PizzaTaytteet{
	private double hinta = 2.00;
	
	public Kinkku(Pizza lisattavaTayte) {
		super(lisattavaTayte);
	}
	
	@Override
	public double getHinta() {
		return super.getHinta() + this.hinta;
	}

	@Override
	public String getKuvaus() {
		return super.getKuvaus() + "Kinkku ";
	}
}
