public class AlignLeft implements AlignStrategy{

    @Override
    public void render(String context) {
        System.out.println("##" + context);
    }
}
