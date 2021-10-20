import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;

public class SubChapter {

    private String name;
    private int index;
    private List<Element> content = new ArrayList<Element>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubChapter(String name, int index) {
        this.name = name;
        this.index= index;
    }

    public void createNewParagraph(String text)
    {

        Paragraph p = new Paragraph(text);
        content.add(p);

    }

    public void createNewImage(String text)
    {

        Image i = new Image(text);
        content.add(i);

    }

    public void createNewTable(String text)
    {

        Table t = new Table(text);
        content.add(t);

    }

    public void print()
    {
        System.out.println("Subchapter "+ this.name);
        for (Element e:content) {
               e.print();
                    }
    }
}
