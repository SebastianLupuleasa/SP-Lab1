import java.util.ArrayList;
import java.util.List;

public class Chapter {

    private String name;
    private int index;
    public static Integer subChapterCount=0;
    public List<SubChapter> subChapters = new ArrayList<SubChapter>();

    public void print(){
        System.out.println("Chapter: " + this.name);
    }

    public String getName() {
        return name;
    }
    public int createSubChapter(String text)
    {

        SubChapter subChapter = new SubChapter(text,subChapterCount);
        subChapterCount++;
        subChapters.add(subChapter);

        return subChapterCount;

    }

    public SubChapter getSubChapter(int index)
    {
        return subChapters.get(index-1);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Chapter(String name, Integer index) {
        this.name = name;
        this.index = index;
    }
}
