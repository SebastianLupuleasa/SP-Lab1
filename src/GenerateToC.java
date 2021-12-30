import java.util.ArrayList;
import java.util.List;

public class GenerateToC implements  Visitor{
    public List<Element> content = new ArrayList<Element>();

    public TableOfContents getToC()
    {
        TableOfContents t = new TableOfContents();
        t.setContent(content);

        return t;
    }

    @Override
    public void visit(Book b) {
       }

    @Override
    public void visit(Section s) {

    }

    @Override
    public void visit(TableOfContents t) {
        t.render();
    }

    @Override
    public void visit(Paragraph p) {
       content.add(p);
    }

    @Override
    public void visit(ImageProxy ip) {
        content.add(ip);
    }

    @Override
    public void visit(Image i) {
        content.add(i);
    }

    @Override
    public void visit(Table t) {
        content.add(t);
    }
}
