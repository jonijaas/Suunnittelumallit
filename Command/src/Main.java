
/*
 * @author Joni Jääskeläinen
 */
public class Main {
	public static void main(String[] args) {
		Valkokangas valkokangas = new Valkokangas();
		
		Command ylos = new YlosCommand(valkokangas);
		Command alas = new AlasCommand(valkokangas);
		
		SeinaPainike painikeYlos = new SeinaPainike(ylos);
		SeinaPainike painikeAlas = new SeinaPainike(alas);
		
		painikeYlos.paina();
		painikeAlas.paina();
	}
}
