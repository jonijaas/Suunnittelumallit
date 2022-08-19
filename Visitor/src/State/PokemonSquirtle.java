package State;

import Visitor.PokemonVisitor;

public class PokemonSquirtle extends PokemonState{
	private static PokemonSquirtle INSTANCE = null;
	
	private PokemonSquirtle() {}
	
	public static PokemonSquirtle getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new PokemonSquirtle();
		}
		return INSTANCE;
	}

	@Override
	public void hyokkaaIske(Pokemon p) {
		System.out.println("Squirtle teki iskuhyökkäyksen!");
		System.out.println("Pokemon ansaitsi 22 kokemuspistettä.\n");
		p.lisaaKokemus(22);
	}

	@Override
	public void hyokkaaEri(Pokemon p) {
		System.out.println("Squirtle teki vesihyökkäyksen!");
		System.out.println("Pokemon ansaitsi 23 kokemuspistettä.\n");
		p.lisaaKokemus(23);
	}

	@Override
	public void puolusta(Pokemon p) {
		System.out.println("Squirtle puolustautui!");
		System.out.println("Pokemon ansaitsi 6 kokemuspistettä.\n");
		p.lisaaKokemus(6);
	}

	@Override
	public PokemonState nextStage() {
		System.out.println("Squirtle kehittyy Wartortleksi.\n");
		return PokemonWartortle.getInstance();
	}
	
	@Override
	public void lisaaBonus(int bonus) {
		System.out.println("Squirtlelle lisätty " + bonus + "  bonuspistettä!\n");
	}

	@Override
	public void accept(PokemonVisitor visitor) {
		visitor.visit(this);
	}
}
