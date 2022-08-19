
public class CPU {
	private int kBootAddress;
	
	public void freeze() {
		System.out.println("Freezing...");
	}
	
	public void jump(int position) {
		kBootAddress = position;
		System.out.println("Siirrytään muistiosoitteseen " + kBootAddress);
	}
	
	public void execute() {
		System.out.println("Suoritetaan...");
	}
}
