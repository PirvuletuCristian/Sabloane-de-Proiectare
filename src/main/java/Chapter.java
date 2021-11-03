import java.util.ArrayList;
import java.util.List;

class Chapter{
    private String name;

    private List<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int createSubChapter(String string) {
        SubChapter subChapterObj = new SubChapter(string);
        subChapters.add(subChapterObj);
        return subChapters.indexOf(subChapterObj);
    }

    public SubChapter getSubChapter(int subChapter){
        return  subChapters.get(subChapter);
    }

    public String toString() {
        return "Chapter: " + name;
    }

    public void print(){
        System.out.println("Chapter: " + getName());
        for(SubChapter subChapter : subChapters){
            System.out.println(subChapter);
        }
    }
}