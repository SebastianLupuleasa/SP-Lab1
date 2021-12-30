import javax.naming.Context;

public class Paragraph implements Element{

    private String text;

    private AlignStrategy alignStrategy;

    public void setAlignStrategy(AlignStrategy alignStrategy)
    {
       this.alignStrategy = alignStrategy;
    }

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void render(){


        if(alignStrategy != null)
        {
            alignStrategy.render(this);
        }
        else {
            System.out.println("Paragraph: " + this.text);
        }
    }

    @Override
    public void add(Element e) {

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
    }
}
