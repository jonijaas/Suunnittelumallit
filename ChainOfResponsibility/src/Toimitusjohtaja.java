
public class Toimitusjohtaja extends Kasittelija{

	@Override
	public void kasittelePyynto(int pyynto) {
		System.out.println("Toimitusjohtaja hyväksyy " + pyynto +  "% palkankorotuksen.");
	}
}
