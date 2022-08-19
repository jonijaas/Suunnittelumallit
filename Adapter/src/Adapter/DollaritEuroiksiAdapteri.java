package Adapter;

public class DollaritEuroiksiAdapteri implements ITili{
	private double valuuttakurssi;
	USDollariTili dollaritili;
	
	public DollaritEuroiksiAdapteri(USDollariTili tili, double valuuttakurssi) {
		this.dollaritili = tili;
		this.valuuttakurssi = valuuttakurssi;
	}
	
	@Override
	public double saldoEuroina() {
		return dollaritili.saldoDollareina()/valuuttakurssi;
	}

	@Override
	public void lisaaEuroja(double eurot) {
		dollaritili.lisaaDollareita(eurot*valuuttakurssi);
	}

}
