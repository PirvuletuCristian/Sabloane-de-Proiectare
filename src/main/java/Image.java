import java.util.concurrent.TimeUnit;

public class Image implements Element{

    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getImageName() {
        return imageName;
    }

    public String toString() {
        return "Image with name: " + imageName;
    }

    @Override
    public void add(Element imageName) {

    }


    @Override
    public void print() {
        System.out.println("Image with name: " + getImageName());
    }
}
