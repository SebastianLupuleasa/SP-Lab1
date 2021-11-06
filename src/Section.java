import java.util.ArrayList;
import java.util.List;

public class Section implements Element{

    private String title;
    public List<Element> content = new ArrayList<Element>();

    @Override
    public void print() {

        if (this instanceof Book) {}
        else
        System.out.println(title);

        for (Element e: content)
            e.print();
    }

    public Section(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void add(Element e) {
      content.add(e);
    }

    @Override
    public void remove(Element e) {
    }

    @Override
    public Element get(int index) {
        return null;
    }
}
