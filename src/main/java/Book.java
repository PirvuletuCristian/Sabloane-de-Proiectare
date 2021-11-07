import java.util.ArrayList;
import java.util.List;

public class Book extends Section{

    private String title;

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

    public void print(){
        System.out.println("Book: " + getTitle());

        System.out.println("\n" +"Authors: ");
        for (Author author : authors) {
            System.out.println(author);
        }
        System.out.println();
        super.print();
    }
}


