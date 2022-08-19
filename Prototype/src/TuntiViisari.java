
public class TuntiViisari implements Cloneable{
	private int tunnit;
	
	public TuntiViisari() {
		this.tunnit = 0;
	}
	
	public int getTunnit() {
		return this.tunnit;
	}
	
	public void setTunnit(int tunnit) {
		this.tunnit = tunnit;
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
