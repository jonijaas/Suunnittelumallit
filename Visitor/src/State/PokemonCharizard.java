package State;

import Visitor.PokemonVisitor;

public class PokemonCharizard extends PokemonState{
	private static PokemonCharizard INSTANCE = null;
	
	private PokemonCharizard() {}
	
	public static PokemonCharizard getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new PokemonCharizard();
		}
		return INSTANCE;
	}

	@Override
	public void hyokkaaIske(Pokemon p) {
		System.out.println("Charizard teki iskuhyökkäyksen!");
		System.out.println("Pokemon ansaitsi 5 kokemuspistettä.\n");
		p.lisaaKokemus(5);
	}

	@Override
	public void hyokkaaEri(Pokemon p) {
		System.out.println("Charizard teki tulihyökkäyksen!");
		System.out.println("Pokemon ansaitsi 10 kokemuspistettä.\n");
		p.lisaaKokemus(10);
	}

	@Override
	public void puolusta(Pokemon p) {
		System.out.println("Charizard puolustautui!");
		System.out.println("Pokemon ansaitsi 2 kokemuspistettä.\n");
		p.lisaaKokemus(2);
	}

	@Override
	public PokemonState nextStage() {
		//kehittynyt jo korkeimmalle tasolle
		return PokemonCharizard.getInstance();
	}

	@Override
	public void lisaaBonus(int bonus) {
		System.out.println("Charizardille lisätty " + bonus + "  bonuspistettä!\n");
	}
	
	@Override
	public void accept(PokemonVisitor visitor) {
		visitor.visit(this);
	}
}
