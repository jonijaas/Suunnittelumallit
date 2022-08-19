
public class Paallikko extends Kasittelija{
	private final int RAJA = 5;
	@Override
	public void kasittelePyynto(int pyynto) {
		if(pyynto < RAJA) {
			System.out.println("Yksikön päällikkö hyväksyy " + pyynto +  "% palkankorotuksen.");
		} else {
			kasittelija.kasittelePyynto(pyynto);
		}
	}
}
