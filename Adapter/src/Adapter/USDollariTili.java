package Adapter;

public class USDollariTili {
	private double saldo;
	
	public USDollariTili(double alkudollarit) {
		this.saldo = alkudollarit;
	}
	
	public double saldoDollareina() {
		return this.saldo;
	}
	
	public void lisaaDollareita(double dollarit) {
		this.saldo += dollarit;
	}
}
