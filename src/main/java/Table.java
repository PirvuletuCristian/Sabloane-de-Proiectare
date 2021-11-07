public class Table implements Element{
    private String title;


    public Table(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return "Table with title: " + title;
    }

    @Override
    public void add(Element table) {

    }

    @Override
    public void print() {
        System.out.println("Table:" + getTitle());
    }
}
