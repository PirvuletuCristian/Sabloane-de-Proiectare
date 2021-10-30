import java.util.ArrayList;
import java.util.List;

class Chapter{
    private String name;

    private Book book;

    private List<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<SubChapter> getSubChapters() {
        return subChapters;
    }

    public void setSubChapters(List<SubChapter> subChapters) {
        this.subChapters = subChapters;
    }

    public int createSubChapter(String string) {
        SubChapter subChapterObj = new SubChapter(string);
        subChapters.add(subChapterObj);
        return subChapters.indexOf(subChapterObj);
    }

    public SubChapter getSubChapter(int subChapter){
        subChapters.get(subChapter);
        return null;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "name='" + name + '\'' +
                ", book=" + book +
                ", subChapters=" + subChapters +
                '}';
    }
}