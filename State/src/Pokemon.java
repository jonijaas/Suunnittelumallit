
public class Pokemon {
	private PokemonState state;
	private int kokemuspisteet;
	
	public Pokemon() {
		state = PokemonCharmander.getInstance();
		kokemuspisteet = 0;
	}
	
	protected void changeState(PokemonState ps) {
		state = ps;
	}
	
	public void iskuHyokkays() {
		state.hyokkaaIske(this);
	}
	
	public void tuliHyokkays() {
		state.hyokkaaTuli(this);
	}
	
	public void puolusta() {
		state.puolusta(this);
	}
	
	public int haeKokemus() {
		return this.kokemuspisteet;
	}
	
	public void lisaaKokemus(int kokemus) {
		kokemuspisteet += kokemus;
		if(kokemuspisteet >= 50) {
			changeState(state.nextStage());
			kokemuspisteet = 0; 
		}
	}
}
