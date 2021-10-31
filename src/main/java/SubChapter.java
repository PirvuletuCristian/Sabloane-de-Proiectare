import java.util.ArrayList;
import java.util.List;

class SubChapter {
    private String Name;

    private List<Paragraph> paragraphs = new ArrayList<>();

    private List<Image> images = new ArrayList<>();

    private List<Table> tables = new ArrayList<>();

    public SubChapter(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void createNewParagraph(String newParagraph) {
        Paragraph paragraph = new Paragraph(newParagraph);
        paragraphs.add(paragraph);
    }
    public void createNewImage(String newImage) {
        Image image = new Image(newImage);
        images.add(image);
    }

    public void createNewTable(String newTable) {
        Table table = new Table(newTable);
        tables.add(table);
    }

    public void print() {
        System.out.println("Subchapter: " + getName());
        paragraphs.stream().forEach(e -> System.out.println("Paragraph: " + e));
        images.stream().forEach(i -> System.out.println("Image with name: " + i));
        tables.stream().forEach(t -> System.out.println("Table with Title: " + t));
    }
}