
public class ComputerFacade {
	private CPU prosessori;
	private HardDrive kiintolevy;
	private Memory muisti;
	
	private int kBootAddress = 11011;
	private int kBootSector = 14;
	private int kSectorSize = 4096;
	
	public ComputerFacade(CPU prosessori, HardDrive kiintolevy, Memory muisti) {
		this.prosessori = prosessori;
		this.kiintolevy = kiintolevy;
		this.muisti = muisti;
	}
	
	public void start() {
		prosessori.freeze();
		muisti.load(kBootAddress, kiintolevy.read(kBootSector, kSectorSize));
		prosessori.jump(kBootAddress);
		prosessori.execute();
	}
}
