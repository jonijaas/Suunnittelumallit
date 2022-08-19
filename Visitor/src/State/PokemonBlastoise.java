package State;

import Visitor.PokemonVisitor;

public class PokemonBlastoise extends PokemonState{
	private static PokemonBlastoise INSTANCE = null;
	
	private PokemonBlastoise() {}
	
	public static PokemonBlastoise getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new PokemonBlastoise();
		}
		return INSTANCE;
	}

	@Override
	public void hyokkaaIske(Pokemon p) {
		System.out.println("Blastoise teki iskuhyökkäyksen!");
		System.out.println("Pokemon ansaitsi 5 kokemuspistettä.\n");
		p.lisaaKokemus(5);
	}

	@Override
	public void hyokkaaEri(Pokemon p) {
		System.out.println("Blastoise teki tulihyökkäyksen!");
		System.out.println("Pokemon ansaitsi 9 kokemuspistettä.\n");
		p.lisaaKokemus(9);
	}

	@Override
	public void puolusta(Pokemon p) {
		System.out.println("Blastoise puolustautui!");
		System.out.println("Pokemon ansaitsi 3 kokemuspistettä.\n");
		p.lisaaKokemus(3);
	}

	@Override
	public PokemonState nextStage() {
		//kehittynyt jo korkeimmalle tasolle
		return PokemonBlastoise.getInstance();
	}
	
	@Override
	public void lisaaBonus(int bonus) {
		System.out.println("Blastoiselle lisätty " + bonus + "  bonuspistettä!\n");
	}

	@Override
	public void accept(PokemonVisitor visitor) {
		visitor.visit(this);
	}
}
