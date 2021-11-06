public class Image implements Element{

    private String url;

    public void print(){
        System.out.println("Image with name: " + this.url);
    }

    public Image(String url) {
        this.url = url;
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
}
