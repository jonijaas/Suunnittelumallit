
public class Tarjoilija {
	private BurgerBuilder burgerBuilder;
	
	public void setBurgerBuilder(BurgerBuilder bb) { burgerBuilder = bb; }
	
	public void kokoaBurger() {
		burgerBuilder.uusiBurgeri();
		burgerBuilder.lisaaSampyla();
		burgerBuilder.lisaaPihvi();
		burgerBuilder.lisaaJuusto();
		burgerBuilder.lisaaMajoneesi();
		burgerBuilder.lisaaSalaatti();
	}
}
