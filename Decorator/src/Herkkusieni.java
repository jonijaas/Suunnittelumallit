
public class Herkkusieni extends PizzaTaytteet{
	private double hinta = 1;
	
	public Herkkusieni(Pizza lisattavaTayte) {
		super(lisattavaTayte);
	}
	
	@Override
	public double getHinta() {
		return super.getHinta() + this.hinta;
	}

	@Override
	public String getKuvaus() {
		return super.getKuvaus() + "Herkkusieni ";
	}
}
