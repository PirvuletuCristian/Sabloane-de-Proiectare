public class Image extends Element  {

    private String imageName;

    public Image(SubChapter subChapter, String imageName) {
        super(subChapter);
        this.imageName = imageName;
    }


    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public String toString() {
        return "Image{" +
                "imageName='" + imageName + '\'' +
                '}';
    }
}
