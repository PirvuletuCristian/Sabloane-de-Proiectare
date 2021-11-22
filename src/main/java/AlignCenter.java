public class AlignCenter implements AlignStrategy{

    @Override
    public void render(String context) {
        System.out.println("##" + context + "##");
    }
}
