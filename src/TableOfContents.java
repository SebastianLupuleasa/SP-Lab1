import java.util.ArrayList;
import java.util.List;

public class TableOfContents  extends Section implements Element{

    @Override
    public void add(Element e) {
        content.add(e);
    }

    public void setContent(List<Element> content) {
        this.content = content;
    }

    public void render()
    {
        System.out.println();
        System.out.println("Table of contents:");
    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
        super.accept(v);
        }
}
