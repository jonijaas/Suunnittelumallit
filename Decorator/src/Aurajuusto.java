
public class Aurajuusto extends PizzaTaytteet{
	private double hinta = 1.50;
	
	public Aurajuusto(Pizza lisattavaTayte) {
		super(lisattavaTayte);
	}
	
	@Override
	public double getHinta() {
		return super.getHinta() + this.hinta;
	}

	@Override
	public String getKuvaus() {
		return super.getKuvaus() + "Aurajuusto ";
	}

}
