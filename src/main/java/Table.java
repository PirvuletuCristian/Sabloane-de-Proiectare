public class Table extends Element{
    private String title;



    public Table(SubChapter subChapter, String title) {
        super(subChapter);
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Table{" +
                "title='" + title + '\'' +
                '}';
    }

}
