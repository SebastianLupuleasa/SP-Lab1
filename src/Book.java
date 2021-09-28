import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private List<Element> content = new ArrayList<Element>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Element> getContent() {
        return content;
    }

    public void setContent(List<Element> content) {
        this.content = content;
    }

    public Book(String title) {
        this.title = title;
    }

    public void createNewParagraph(String text)
    {
        Element e = new Element();
        e.setType("paragraph");
        e.setText(text);
        this.content.add(e);
    }

    public void createNewImage(String text)
    {
        Element e = new Element();
        e.setType("image");
        e.setText(text);
        this.content.add(e);
    }
    public void createNewTable(String text)
    {
        Element e = new Element();
        e.setType("table");
        e.setText(text);
        this.content.add(e);
    }

    public void print()
    {
        System.out.println("Title: "+ this.title);
        System.out.println("Content: ");
        for (Element e:
             this.content) {
            System.out.println(e.getText());
        }
    }

    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        discoTitanic.createNewParagraph("Paragraph 1");
        discoTitanic.createNewParagraph("Paragraph 2");
        discoTitanic.createNewParagraph("Paragraph 3");
        discoTitanic.createNewImage("Image 1");
        discoTitanic.createNewParagraph("Paragraph 4");
        discoTitanic.createNewTable("Table 1");
        discoTitanic.createNewParagraph("Paragraph 5");
        discoTitanic.print();
    }
}
