
public class AppleFactory implements AbstractFactory{
	private static AppleFactory INSTANCE = null;
	
	private AppleFactory() {}
	
	public static AppleFactory getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new AppleFactory();
		}
		return INSTANCE;
	}

	@Override
	public Puhelin createMatkapuhelin() {
		return new ApplePuhelin();
	}

	@Override
	public Kello createAlykello() {
		return new AppleKello();
	}
	
}
