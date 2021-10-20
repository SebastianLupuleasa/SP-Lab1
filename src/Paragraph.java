public class Paragraph extends Element{

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Paragraph(String text) {
        this.text = text;
    }

    public void print(){
        System.out.println("Paragraph: " + this.text);
    }

}
