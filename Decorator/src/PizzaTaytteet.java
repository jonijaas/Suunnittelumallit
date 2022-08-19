
public abstract class PizzaTaytteet implements Pizza{
	private Pizza taytettavaPizza;
	
	public PizzaTaytteet(Pizza pizza) {
		this.taytettavaPizza = pizza;
	}
	
	@Override
	public double getHinta() {
		return taytettavaPizza.getHinta();
	}
	
	@Override
	public String getKuvaus() {
		return taytettavaPizza.getKuvaus();
	}
	
	

}