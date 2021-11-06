import java.util.ArrayList;
import java.util.List;

public class Book extends Section{

    private List<Author> authors = new ArrayList<Author>();

    public void addAuthor(Author author) {
       this.authors.add(author);
    }

    public Book(String title) {
        super(title);
    }

    public void addContent(Element e)
    {
       super.add(e);
    }

    public void print() {
        System.out.println("Book: "+getTitle());
        System.out.println();

        System.out.println("Authors:");
        for(Author a: authors)
            a.print();
        System.out.println();

        super.print();

    }

    public static void main(String[] args) {
        Book noapteBuna = new Book("Noapte buna, copii!");
        Author rpGheo = new Author("Radu Pavel Gheo");
        noapteBuna.addAuthor(rpGheo);

        Section cap1 = new Section("Capitolul 1");
        Section cap11 = new Section("Capitolul 1.1");
        Section cap111 = new Section("Capitolul 1.1.1");
        Section cap1111 = new Section("Subchapter 1.1.1.1");
        noapteBuna.addContent(new Paragraph("Multumesc celor care ..."));
        noapteBuna.addContent(cap1);
        cap1.add(new Paragraph("Moto capitol"));
        cap1.add(cap11);
        cap11.add(new Paragraph("Text from subchapter 1.1"));
        cap11.add(cap111);
        cap111.add(new Paragraph("Text from subchapter 1.1.1"));
        cap111.add(cap1111);
        cap1111.add(new Image("Image subchapter 1.1.1.1"));

       noapteBuna.print();

    }
}
