public class ImageProxy implements Element{
    private String imageName;

    private Image realImg;

    public Image loadImage(){
        if(realImg == null){
            realImg = new Image(imageName);
        }
        return realImg;
    }

    public ImageProxy(String imageName) {
        this.imageName = imageName;
        realImg = null;
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void print() {
        loadImage();
        realImg.print();
    }
}
