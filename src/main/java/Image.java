public class Image implements Element{

    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public String getImageName() {
        return imageName;
    }

    public String toString() {
        return "Image: " + imageName;
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + getImageName());
    }
}
