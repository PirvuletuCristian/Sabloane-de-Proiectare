public class Table implements Element{
    private String title;


    public Table(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return title;
    }

    @Override
    public void print() {
        System.out.println("Table:" + getTitle());
    }
}
