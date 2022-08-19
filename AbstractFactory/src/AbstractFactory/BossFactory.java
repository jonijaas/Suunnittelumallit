package AbstractFactory;

public class BossFactory implements AbstractFactory {

	@Override
	public Farkut createFarkut() {
		return new FarkutBoss();
	}

	@Override
	public Lippis createLippis() {
		return new LippisBoss();
	}

	@Override
	public Paita createPaita() {
		return new PaitaBoss();
	}

	@Override
	public Kengat createKengat() {
		return new KengatBoss();
	}

}
