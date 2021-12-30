import java.util.ArrayList;
import java.util.List;

public class Section implements Element{

    private String title;
    public List<Element> content = new ArrayList<Element>();

    public Section(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public void render() {

    }

    public Section() {
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

    @Override
    public void accept(Visitor v) {

        for(Element e:content)
         {
             if(e instanceof Section) {
                 for(Element e1: ((Section) e).content) {

                     if (e1 instanceof Image)
                         v.visit((Image) e1);
                     if (e1 instanceof ImageProxy)
                         v.visit((ImageProxy) e1);
                     if (e1 instanceof Table)
                         v.visit((Table) e1);
                     if (e1 instanceof Paragraph)
                         v.visit((Paragraph) e1);
                 }
             }

             else {

                 if (e instanceof Image)
                     v.visit((Image) e);
                 if (e instanceof ImageProxy)
                     v.visit((ImageProxy) e);
                 if (e instanceof Table)
                     v.visit((Table) e);
                 if (e instanceof Paragraph)
                     v.visit((Paragraph) e);
             }
         }
    }
}
