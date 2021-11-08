import java.util.ArrayList;
import java.util.List;

public class Section implements Element{

    private String title;

    private List<Element> elements = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void add(Element element) {
        elements.add(element);
    }

    public void addContent(Element element) {
        elements.add(element);
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public void print() {
        for(Element element : elements){
            element.print();
        }
    }


}
