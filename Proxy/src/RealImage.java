
public class RealImage implements Image{
	private final String filename;
	private final String imagename;

    /**
     * Constructor
     * @param filename
     */
    public RealImage(String filename, String imagename) {
        this.filename = filename;
        this.imagename = imagename;
        loadImageFromDisk();
    }

    /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }
    
    public String getImagename() {
    	return this.imagename;
    }

	@Override
	public void showData() {
		System.out.println(imagename);
	}
}
