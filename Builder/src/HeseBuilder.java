
public class HeseBuilder implements BurgerBuilder{
	private Kerroshampurilainen kerros;
	
	@Override
	public void uusiBurgeri() {
		kerros = new Kerroshampurilainen();
	}

	@Override
	public void lisaaPihvi() {
		kerros.lisaa(new Pihvi("2x naudanlihapihvi"));
	}
	
	@Override
	public void lisaaSalaatti() {
		kerros.lisaa(new Salaatti("Jäävuorisalaatti"));
	}
	
	@Override
	public void lisaaMajoneesi() {
		kerros.lisaa(new Majoneesi("Hesburgerin majoneesi"));
	}
	
	@Override
	public void lisaaJuusto() {
		kerros.lisaa(new Juusto("Cheddarsulatejuusto"));
	}
	
	@Override
	public void lisaaSampyla() {
		kerros.lisaa(new Sampyla("Kerrossämpylä"));
	}
	
	
	@Override
	public Object getBurger() {
		return kerros;
	}
	
}
