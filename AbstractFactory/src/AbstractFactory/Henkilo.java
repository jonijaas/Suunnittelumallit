package AbstractFactory;

public class Henkilo {
	private String nimi;
	private Farkut farkut;
	private Kengat kengat;
	private Lippis lippis;
	private Paita paita;
	
	public Henkilo(String nimi) {
		this.nimi = nimi;
	}
	
	public void setFactory(AbstractFactory factory) {
		this.farkut = factory.createFarkut();
		this.kengat = factory.createKengat();
		this.lippis = factory.createLippis();
		this.paita = factory.createPaita();
	}
	
	public String getNimi() {
		return this.nimi;
	}
	
	public String toString() {
		return nimi + ": Minulla on päälläni " + farkut + ", " + kengat + ", " + lippis + " ja " + paita + ".";
	}
}
