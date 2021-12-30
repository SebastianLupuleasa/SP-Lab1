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

    public void accept(Visitor v) {
        v.visit(this);
        super.accept(v);
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public static void Printing(){
       // DocumentManager.getInstance().getBook().print();
    }

    public static void main(String[] args) throws Exception {
        Book myBook = new Book("BOOK1");
        myBook.addAuthor(new Author("Mihai Eminescu"));

        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Image("ImageTwo"));
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));

       // Generate Book Statistics

        BookStatistics stats = new BookStatistics();
        cap1.accept(stats);
        stats.printStatistics();


        // Printing the book

        myBook.addContent(cap1);
        myBook.accept(new RenderContentVisitor());


        // Generate table of contents

        GenerateToC gtc = new GenerateToC();
        myBook.accept(gtc);

        TableOfContents toc =  gtc.getToC();

        toc.accept(new RenderContentVisitor());


    }


    }

