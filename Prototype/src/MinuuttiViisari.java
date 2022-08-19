
public class MinuuttiViisari implements Cloneable{
	private int minuutit;
	
	public MinuuttiViisari() {
		this.minuutit = 0;
	}
	
	public int getMinuutit() {
		return this.minuutit;
	}
	
	public void setMinuutit(int minuutit) {
		this.minuutit = minuutit;
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
