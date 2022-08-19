
public class SamsungFactory implements AbstractFactory{
	private static SamsungFactory INSTANCE = null;
	
	private SamsungFactory() {}
	
	public static SamsungFactory getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new SamsungFactory();
		}
		return INSTANCE;
	}

	@Override
	public Puhelin createMatkapuhelin() {
		return new SamsungPuhelin();
	}

	@Override
	public Kello createAlykello() {
		return new SamsungKello();
	}
	
}
