package FactoryMethod;

public class Vierailija extends AterioivaOtus{

	@Override
	public Juoma createJuoma() {
		return new Tee();
	}

	@Override
	public Ruoka createRuoka() {
		return new Salaatti();
	}

}
