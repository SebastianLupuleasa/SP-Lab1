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

    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        ImageProxy img1 = new ImageProxy("Pamela Anderson");
        ImageProxy img2 = new ImageProxy("Kim Kardashian");
        ImageProxy img3 = new ImageProxy("Kirby Griffin");
        Section playboyS1 = new Section("Front Cover");
        playboyS1.add(img1);
        Section playboyS2 = new Section("Summer Girls");
        playboyS2.add(img2);
        playboyS2.add(img3);
        Book playboy = new Book("Playboy");
        playboy.addContent(playboyS1);
        playboy.addContent(playboyS2);
        long endTime = System.currentTimeMillis();
        System.out.println("Creation of the content took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing of the section 1 took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing again the section 1 took " + (endTime -
                startTime) + " milliseconds");
    }


    }

