package FactoryMethod;

public class Opiskelija extends AterioivaOtus{

	@Override
	public Juoma createJuoma() {
		return new Kahvi();
	}

	@Override
	public Ruoka createRuoka() {
		return new Patonki();
	}

}
