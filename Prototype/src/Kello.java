
public class Kello implements Cloneable{
	private TuntiViisari tunti;
	private MinuuttiViisari minuutti;
	private SekuntiViisari sekunti;
	
	public Kello() {
		tunti = new TuntiViisari();
		minuutti = new MinuuttiViisari();
		sekunti = new SekuntiViisari();
	}
	
	public void asetaAika(int tunnit, int minuutit, int sekuntit) {
		if(tunnit > 12) {
			tunnit = 1;
		}
		tunti.setTunnit(tunnit);
		if(minuutit > 59) {
			minuutit = 0;
		}
		minuutti.setMinuutit(minuutit);
		if(sekuntit > 59) {
			sekuntit = 0;
		}
		sekunti.setSekunnit(sekuntit);
	}
	
	public String naytaAika() {
		return tunti.getTunnit() + ":" + minuutti.getMinuutit() + ":" + sekunti.getSekunnit();
	}
	
	//syväkopio
	public Kello clone() {
		Kello k = null;
		try {
			k = (Kello) super.clone();
			k.tunti = (TuntiViisari) tunti.clone();
			k.minuutti = (MinuuttiViisari) minuutti.clone();
			k.sekunti = (SekuntiViisari) sekunti.clone();
			return k;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	 
	//matalakopio
//	public Kello clone() {
//		try {
//			return (Kello) super.clone();
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//			return null;
//		}
//	}
}
