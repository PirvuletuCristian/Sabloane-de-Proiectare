class Paragraph implements Element{
    private String text;

    public Paragraph( String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String toString() {
        return  "Paragraph: " + text;
    }

    @Override
    public void print(){
        System.out.println("Paragraph: " +getText());
    }
}