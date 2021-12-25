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

    public static void Printing(){
        DocumentManager.getInstance().getBook().print();
    }

    public static void main(String[] args) throws Exception {
        Book myBook = new Book("My Book");
        DocumentManager.getInstance().setBook(myBook);
        Author me = new Author("My Self");
        myBook.addAuthor(me);
        Section cap1 = new Section("Capitolul 1");
        myBook.addContent(cap1);
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");

        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        System.out.println("Printing without Alignment");
        System.out.println();
        cap1.print();
        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());
        System.out.println();
        System.out.println("Printing with Alignment");
        System.out.println();
        cap1.print();

        Printing();
    }


    }

