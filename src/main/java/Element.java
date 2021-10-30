import java.util.ArrayList;
import java.util.List;

public class Element {
    private SubChapter subChapter;

    public Element(SubChapter subChapter) {
        this.subChapter = subChapter;
    }

    public SubChapter getSubChapter() {
        return subChapter;
    }

    public void setSubChapter(SubChapter subChapter) {
        this.subChapter = subChapter;
    }


    @Override
    public String toString() {
        return "Element{" +
                "subChapter=" + subChapter +
                '}';
    }
}
