import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Asiakas extends Thread { //caretaker
	private Object obj;
	private List<Integer> arvaukset;
	private String nimi;
	Arvuuttaja arvuuttaja;
	Random random;
	
	public Asiakas(String nimi, Arvuuttaja arvuuttaja) {
		this.nimi = nimi;
		this.arvuuttaja = arvuuttaja;
		this.obj = arvuuttaja.liityPeliin();
		arvaukset = new ArrayList<Integer>();
		random = new Random();
	}
	
	public boolean arvaaLuku(int arvaus) {
		return arvuuttaja.arvaa(this.obj, arvaus);
	}
	
	public void run() {
		while (true) {
			int arvaus = -1;
			while(arvaus == -1) {
				int randomluku = random.nextInt(11);
				if(!arvaukset.contains(randomluku)) {
					arvaus = randomluku;
					arvaukset.add(arvaus);
				}
			}
			System.out.println(this.nimi + " arvaa luvun " + arvaus);
			Boolean arvasiko;
			arvasiko = this.arvaaLuku(arvaus);
			if(arvasiko) {
				System.out.println(this.nimi + " käytti arvauksia " + arvaukset.size() + " kappaletta.");
				break;
			} else {
				try {
					Thread.sleep(1000);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
