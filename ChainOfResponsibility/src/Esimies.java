
public class Esimies extends Kasittelija{
	private final int RAJA = 2;
	@Override
	public void kasittelePyynto(int pyynto) {
		if(pyynto <= RAJA) {
			System.out.println("Lähiesimies hyväksyy " + pyynto +  "% palkankorotuksen.");
		} else {
			kasittelija.kasittelePyynto(pyynto);
		}
	}
	
}
