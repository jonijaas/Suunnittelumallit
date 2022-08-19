package Visitor;
import State.PokemonBlastoise;
import State.PokemonCharizard;
import State.PokemonCharmander;
import State.PokemonCharmeleon;
import State.PokemonSquirtle;
import State.PokemonWartortle;

public interface Visitor {
	void visit(PokemonCharmander charmander);
	void visit(PokemonCharmeleon charmeleon);
	void visit(PokemonCharizard charizard);
	void visit(PokemonSquirtle squirtle);
	void visit(PokemonWartortle wartortle);
	void visit(PokemonBlastoise blastoise);
}
