
public class Memory {
	private char[] muisti;
	
	public Memory(int koko) {
		muisti = new char[koko];
	}
	
	public void load(int position, String data) {
		System.out.println("Ladataan välimuistiin..");
		
		for(int i = position; i < data.length(); i++) {
			muisti[i] = data.charAt(i);
		}
	}
}
