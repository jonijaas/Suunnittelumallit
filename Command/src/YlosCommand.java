
public class YlosCommand implements Command{
	private Valkokangas kangas;
	
	public YlosCommand(Valkokangas valkokangas) {
		this.kangas = valkokangas;
	}
	
	@Override
	public void suorita() {
		kangas.ylos();
	}

}
