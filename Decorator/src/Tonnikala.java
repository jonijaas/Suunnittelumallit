
public class Tonnikala extends PizzaTaytteet{
	private double hinta = 2.50;
	
	public Tonnikala(Pizza lisattavaTayte) {
		super(lisattavaTayte);
	}
	
	@Override
	public double getHinta() {
		return super.getHinta() + this.hinta;
	}

	@Override
	public String getKuvaus() {
		return super.getKuvaus() + "Tonnikala ";
	}
}
