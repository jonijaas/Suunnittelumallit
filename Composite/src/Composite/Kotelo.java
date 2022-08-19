package Composite;

import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Laiteosa{
	List<Laiteosa> osat = new ArrayList<Laiteosa>();
	
	public double omaHinta() {
		return 65.50;
	}
	
	@Override
	public double hinta() {
		double hinta = 65.50;
		for(int i = 0; i < osat.size(); i++) {
			hinta += osat.get(i).hinta();
		}
		return hinta;
	}
	
	@Override
	public void add(Laiteosa osa) {
		osat.add(osa);
	}
}
