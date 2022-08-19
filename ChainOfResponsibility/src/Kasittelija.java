
public abstract class Kasittelija {
	protected Kasittelija kasittelija;
	
	public void ylempiKasittelija(Kasittelija ks) {
		this.kasittelija = ks;
	}
	
	public abstract void kasittelePyynto(int pyynto);
}
