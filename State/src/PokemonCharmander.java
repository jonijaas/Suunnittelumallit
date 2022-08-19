
public class PokemonCharmander extends PokemonState{

	private static PokemonCharmander INSTANCE = null;
	
	private PokemonCharmander() {}
	
	public static PokemonCharmander getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new PokemonCharmander();
		}
		return INSTANCE;
	}

	@Override
	public void hyokkaaIske(Pokemon p) {
		System.out.println("Charmander teki iskuhyökkäyksen!");
		System.out.println("Pokemon ansaitsi 20 kokemuspistettä.\n");
		p.lisaaKokemus(20);
	}

	@Override
	public void hyokkaaTuli(Pokemon p) {
		System.out.println("Charmander teki tulihyökkäyksen!");
		System.out.println("Pokemon ansaitsi 25 kokemuspistettä.\n");
		p.lisaaKokemus(25);
	}

	@Override
	public void puolusta(Pokemon p) {
		System.out.println("Charmander puolustautui!");
		System.out.println("Pokemon ansaitsi 5 kokemuspistettä.\n");
		p.lisaaKokemus(5);
	}

	@Override
	public PokemonState nextStage() {
		System.out.println("Charmander kehittyy Charmeleoniksi.\n");
		return PokemonCharmeleon.getInstance();
	}
}
