import java.awt.*;

public class ImageProxy implements Element, Picture{

    private String url;
    private Dimension dim;
    private Image realImage;

    public ImageProxy(String url) {
          this.url=url;
    }

    public Image loadImage() {
        if(realImage==null)
        {
            realImage = new Image(url);
        }
        return realImage;
    }


    @Override
    public void print() {
         loadImage();
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
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }

    @Override
    public PictureContent content() {
        return null;
    }
}
