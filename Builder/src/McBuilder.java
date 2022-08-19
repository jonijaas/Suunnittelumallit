
public class McBuilder implements BurgerBuilder{
	private BigMac bigmac;
	
	@Override
	public void uusiBurgeri() {
		bigmac = new BigMac();
	}
	
	@Override
	public void lisaaPihvi() {
		bigmac.lisaa(new Pihvi("2x naudanlihapihvi"));
	}
	
	@Override
	public void lisaaSalaatti() {
		bigmac.lisaa(new Salaatti("Jäävuorisalaatti"));
	}
	
	@Override
	public void lisaaMajoneesi() {
		bigmac.lisaa(new Majoneesi("Big Mac -kastike"));
	}
	
	@Override
	public void lisaaJuusto() {
		bigmac.lisaa(new Juusto("Cheddarsulatejuusto"));
	}
	
	@Override
	public void lisaaSampyla() {
		bigmac.lisaa(new Sampyla("Big Mac -sämpylä"));
	}
	
	@Override
	public BigMac getBurger() {
		return bigmac;
	}

}
