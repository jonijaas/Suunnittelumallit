
public class Salami extends PizzaTaytteet{
	private double hinta = 2.00;
	
	public Salami(Pizza lisattavaTayte) {
		super(lisattavaTayte);
	}
	
	@Override
	public double getHinta() {
		return super.getHinta() + this.hinta;
	}

	@Override
	public String getKuvaus() {
		return super.getKuvaus() + "Salami ";
	}
}
