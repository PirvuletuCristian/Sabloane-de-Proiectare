class Paragraph extends Element{
    private String text;

    public Paragraph(SubChapter subChapter, String text) {
        super(subChapter);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "text='" + text + '\'' +
                '}';
    }
}