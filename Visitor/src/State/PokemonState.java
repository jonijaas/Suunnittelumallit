package State;

import Visitor.PokemonVisitor;

public abstract class PokemonState {
	public abstract void hyokkaaIske(Pokemon p);
	public abstract void hyokkaaEri(Pokemon p);
	public abstract void puolusta(Pokemon p);
	public abstract PokemonState nextStage();
	public abstract void lisaaBonus(int bonus);
	public abstract void accept(PokemonVisitor visitor);
}
