import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Image implements Element,Picture{

    private String url;
    private ImageContent content;

    public void print(){
        System.out.println("Image with name: " + this.url);
    }

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }

    public  ImageContent content()
    {
      return null;
    }

   public Image(String name) {
        url = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
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
}
