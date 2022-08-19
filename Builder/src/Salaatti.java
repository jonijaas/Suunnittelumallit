
public class Salaatti implements Osat {
	private String salaatti;
	
	public Salaatti(String salaatti) {
		this.salaatti = salaatti;
	}
	
	@Override
	public String toString() {
		return this.salaatti;
	}
}
