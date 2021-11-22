class Paragraph implements Element {
    private String text;

    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String toString() {
        return "Paragraph: " + text;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    @Override
    public void add(Element text) {

    }

    @Override
    public void print() {
        if (this.alignStrategy != null) {
            this.alignStrategy.render(this.text);
        }
        else
            System.out.println(this.text);
    }





}