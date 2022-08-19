
public class SekuntiViisari implements Cloneable{
	private int sekuntit;
	
	public SekuntiViisari() {
		this.sekuntit = 0;
	}
	
	public int getSekunnit() {
		return this.sekuntit;
	}
	
	public void setSekunnit(int sekuntit) {
		this.sekuntit = sekuntit;
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
