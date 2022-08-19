
/*
 * @author Joni Jääskeläinen
 */
public class Main {
	public static void main(String[] args) {
		ComputerFacade tietokone = new ComputerFacade(new CPU(), new HardDrive(), new Memory(4096));
		
		tietokone.start();
	}
}
