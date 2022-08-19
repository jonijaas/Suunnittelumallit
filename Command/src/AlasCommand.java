
public class AlasCommand implements Command{
	private Valkokangas kangas;
	
	public AlasCommand(Valkokangas valkokangas) {
		this.kangas = valkokangas;
	}
	
	@Override
	public void suorita() {
		kangas.alas();
	}

}
