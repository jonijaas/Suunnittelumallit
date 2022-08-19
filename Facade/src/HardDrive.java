
public class HardDrive {
	private String data = "AABBCCDDEEFFGGHHIIJJKKLLMMNNOOPPQQRRSSTTUUVVXXYYZZ11";
	
	public String read(int lba, int size) {
		System.out.println("Luetaan dataa kiintolevyltä...");
		String luettuData = "";
		for(int i = lba; i < data.length(); i++) {
			luettuData += data.charAt(i);
			System.out.print(data.charAt(i) + " ");
		}
		System.out.println();
		return luettuData;
	}
	
}
