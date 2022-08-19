package State;

import Visitor.PokemonVisitor;

public class PokemonWartortle extends PokemonState {
	private static PokemonWartortle INSTANCE = null;
	
	private PokemonWartortle() {}
	
	public static PokemonWartortle getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new PokemonWartortle();
		}
		return INSTANCE;
	}

	@Override
	public void hyokkaaIske(Pokemon p) {
		System.out.println("Wartortle teki iskuhyökkäyksen!");
		System.out.println("Pokemon ansaitsi 9 kokemuspistettä.\n");
		p.lisaaKokemus(9);
	}

	@Override
	public void hyokkaaEri(Pokemon p) {
		System.out.println("Wartortle teki vesihyökkäyksen!");
		System.out.println("Pokemon ansaitsi 14 kokemuspistettä.\n");
		p.lisaaKokemus(14);
	}

	@Override
	public void puolusta(Pokemon p) {
		System.out.println("Wartortle puolustautui!");
		System.out.println("Pokemon ansaitsi 6 kokemuspistettä.\n");
		p.lisaaKokemus(6);
	}
	
	@Override
	public PokemonState nextStage() {
		System.out.println("Wartortle kehittyy Blastoiseksi.\n");
		return PokemonBlastoise.getInstance();
	}
	
	@Override
	public void lisaaBonus(int bonus) {
		System.out.println("Wartortlelle lisätty " + bonus + " bonuspistettä!\n");
	}

	@Override
	public void accept(PokemonVisitor visitor) {
		visitor.visit(this);
	}
}
