import java.util.ArrayList;
import java.util.List;

class SubChapter {
    private String Name;

    private Chapter chapter;

    private List<Element> elements = new ArrayList<>();

    private List<Paragraph> paragraphs = new ArrayList<>();

    private List<Image> images = new ArrayList<>();

    private List<Table> tables = new ArrayList<>();

    public SubChapter(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    @Override
    public String toString() {
        return "SubChapter{" +
                "Name='" + Name + '\'' +
                ", chapter=" + chapter +
                ", elements=" + elements +
                ", paragraphs=" + paragraphs +
                ", images=" + images +
                ", tables=" + tables +
                '}';
    }

    public void createNewParagraph(String newParagraph) {
        Paragraph paragraph = new Paragraph(newParagraph);
        paragraphs.add(paragraph);
    }
//    public void createNewImage(String newImage) {
//        Image image = new Image(newImage);
//        images.add(image);
//    }
//
//    public void createNewTable(String newTable) {
//        Table table = new Table(newTable);
//        tables.add(table);
//    }
}