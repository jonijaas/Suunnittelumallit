package AbstractFactory;

public class AdidasFactory implements AbstractFactory {

	@Override
	public Farkut createFarkut() {
		return new FarkutAdidas();
	}

	@Override
	public Lippis createLippis() {
		return new LippisAdidas();
	}

	@Override
	public Paita createPaita() {
		return new PaitaAdidas();
	}

	@Override
	public Kengat createKengat() {
		return new KengatAdidas();
	}

}
