
public class PokemonCharmeleon extends PokemonState{
	private static PokemonCharmeleon INSTANCE = null;
	
	private PokemonCharmeleon() {}
	
	public static PokemonCharmeleon getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new PokemonCharmeleon();
		}
		return INSTANCE;
	}

	@Override
	public void hyokkaaIske(Pokemon p) {
		System.out.println("Charmeleon teki iskuhyökkäyksen!");
		System.out.println("Pokemon ansaitsi 10 kokemuspistettä.\n");
		p.lisaaKokemus(10);
	}

	@Override
	public void hyokkaaTuli(Pokemon p) {
		System.out.println("Charmeleon teki tulihyökkäyksen!");
		System.out.println("Pokemon ansaitsi 15 kokemuspistettä.\n");
		p.lisaaKokemus(15);
	}

	@Override
	public void puolusta(Pokemon p) {
		System.out.println("Charmeleon puolustautui!");
		System.out.println("Pokemon ansaitsi 5 kokemuspistettä.\n");
		p.lisaaKokemus(5);
	}
	
	@Override
	public PokemonState nextStage() {
		System.out.println("Charmeleon kehittyy Charizardiksi.\n");
		return PokemonCharizard.getInstance();
	}
}
