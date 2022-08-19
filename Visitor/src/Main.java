import State.Pokemon;
import Visitor.PokemonVisitor;

/*
 * @author Joni Jääskeläinen
 */
public class Main {
	public static void main(String[] args) {
		Pokemon tuliPokemon = new Pokemon("tuli");
		Pokemon vesiPokemon = new Pokemon("vesi");
		
		PokemonVisitor pVisitor = new PokemonVisitor();
		
		System.out.println("Luotiin kaksi uutta pokemonia.\n");
		
		for(int i=0; i < 5; i++) {
			tuliPokemon.iskuHyokkays();
			tuliPokemon.puolusta();
			vesiPokemon.iskuHyokkays();
			vesiPokemon.puolusta();
			
			tuliPokemon.accept(pVisitor);
			vesiPokemon.accept(pVisitor);
			
			tuliPokemon.erikoisHyokkays();
			vesiPokemon.erikoisHyokkays();
		}
	}
}
