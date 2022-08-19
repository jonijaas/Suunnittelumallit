package Visitor;
import State.Pokemon;
import State.PokemonBlastoise;
import State.PokemonCharizard;
import State.PokemonCharmander;
import State.PokemonCharmeleon;
import State.PokemonSquirtle;
import State.PokemonWartortle;

public class PokemonVisitor implements Visitor{

	Pokemon pokemon;
	
	@Override
	public void visit(PokemonCharmander charmander) {
		charmander.lisaaBonus(5);
	}

	@Override
	public void visit(PokemonCharmeleon charmeleon) {
		charmeleon.lisaaBonus(7);
	}

	@Override
	public void visit(PokemonCharizard charizard) {
		charizard.lisaaBonus(10);
	}

	@Override
	public void visit(PokemonSquirtle squirtle) {
		squirtle.lisaaBonus(4);
	}

	@Override
	public void visit(PokemonWartortle wartortle) {
		wartortle.lisaaBonus(8);
	}

	@Override
	public void visit(PokemonBlastoise blastoise) {
		blastoise.lisaaBonus(11);
	}

}
