
public class ProxyImage implements Image{
	private final String filename;
	private final String imagename;
    private RealImage image;
    
    /**
     * Constructor
     * @param filename
     */
    public ProxyImage(String filename, String imagename) {
        this.filename = filename;
        this.imagename = imagename;
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename, imagename);
        }
        image.displayImage();
    }
    
    public String getImagename() {
    	return this.imagename;
    }

	@Override
	public void showData() {
		System.out.println(imagename);
	}
}
