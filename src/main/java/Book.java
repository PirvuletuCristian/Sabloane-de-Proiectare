import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;

    private TableOfContents tableOfContent;

    private List<Chapter> chapters = new ArrayList<>();

    private List<Author> authors = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public TableOfContents getTableOfContent() {
        return tableOfContent;
    }

    public void setTableOfContent(TableOfContents tableOfContent) {
        this.tableOfContent = tableOfContent;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                '}';
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public int createChapter(String chapter) {
        Chapter chapterObj = new Chapter(chapter);
        chapters.add(chapterObj);
        return chapters.indexOf(chapterObj);
    }

    public Chapter getChapter(int chapter){
        return chapters.get(chapter);
    }
}


