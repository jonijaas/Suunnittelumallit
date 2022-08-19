package Adapter;

public class EuroTili implements ITili{
	private double saldo;
	
	public EuroTili(double alkusaldo) {
		this.saldo = alkusaldo;
	}
	
	@Override
	public double saldoEuroina() {
		return this.saldo;
	}

	@Override
	public void lisaaEuroja(double eurot) {
		this.saldo += eurot;
	}

}
