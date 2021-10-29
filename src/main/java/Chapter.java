import java.util.ArrayList;
import java.util.List;

class Chapter{
    private String name;

    private List<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }
}