import FactoryMethod.*;
/*
 * @author Joni Jääskeläinen
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Opettaja:");
    	AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        
        System.out.println("\nOpiskelija:");
        AterioivaOtus opiskelija = new Opiskelija();
        opiskelija.aterioi();
        
        System.out.println("\nVierailija:");
        AterioivaOtus vierailija = new Vierailija();
        vierailija.aterioi();
    }
}
