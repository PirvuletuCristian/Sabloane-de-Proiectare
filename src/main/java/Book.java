import java.util.ArrayList;
import java.util.List;

public class Book extends Section{

    private String title;

    private TableOfContents tableOfContent;

    private List<Chapter> chapters = new ArrayList<>();

    private List<Author> authors = new ArrayList<>();

    public Book(String title) {
        super();
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public String getTitle() {
        return title;
    }

    public int createChapter(String chapter) {
        Chapter chapterObj = new Chapter(chapter);
        chapters.add(chapterObj);
        return chapters.indexOf(chapterObj);
    }

    public Chapter getChapter(int chapter){
        return chapters.get(chapter);
    }


    public void print(){
        System.out.println("Book: " + getTitle());

        System.out.println("\n" +"Authors: ");
        for (Author author : authors) {
            System.out.println(author);
        }
        System.out.println();
//        for (Chapter chapter : chapters) {
//            System.out.println(chapter);
//        }
        super.print();
    }
}


