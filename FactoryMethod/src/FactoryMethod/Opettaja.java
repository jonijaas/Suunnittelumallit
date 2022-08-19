package FactoryMethod;

public class Opettaja extends AterioivaOtus {

	@Override
    public Juoma createJuoma(){
        return new Vesi();
    }

	@Override
	public Ruoka createRuoka() {
		return new Pulla();
	};

}
