public class Table implements Element{

    private String title;

    public void render(){
        System.out.println("Table: "+this.title);
    }

    @Override
    public void add(Element e) {

    }

    public Table(String title) {
        this.title = title;
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
