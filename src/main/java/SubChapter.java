import java.util.ArrayList;
import java.util.List;

class SubChapter {
    private String Name;

    private List<Element> elements = new ArrayList<>();

    public SubChapter(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void createNewParagraph(String newParagraph) {
        Paragraph paragraph = new Paragraph(newParagraph);
        elements.add(paragraph);
    }
    public void createNewImage(String newImage) {
        Image image = new Image(newImage);
        elements.add(image);
    }

    public void createNewTable(String newTable) {
        Table table = new Table(newTable);
        elements.add(table);
    }

    public String toString(){
        return "Subchaper: " + Name;
    }

    public void print() {
        System.out.println("Subchapter: " + getName());
        for (Element element : elements) {
            System.out.println(element);
        }
    }
}