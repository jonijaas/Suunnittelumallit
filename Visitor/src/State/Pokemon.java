package State;

import Visitor.PokemonVisitor;

public class Pokemon {
	private PokemonState state;
	private int kokemuspisteet;
	
	public Pokemon(String tyyppi) {
		if(tyyppi.equals("tuli")){
			state = PokemonCharmander.getInstance();
		} else {
			state = PokemonSquirtle.getInstance();
		}
		kokemuspisteet = 0;
	}
	
	protected void changeState(PokemonState ps) {
		state = ps;
	}
	
	public void iskuHyokkays() {
		state.hyokkaaIske(this);
	}
	
	public void erikoisHyokkays() {
		state.hyokkaaEri(this);
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
	
	public void accept(PokemonVisitor visitor) {
		state.accept(visitor);
	}
}
