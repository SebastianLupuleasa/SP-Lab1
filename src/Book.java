import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private Author author;
    public static Integer chapterCount=0;
    public List<Chapter> chapters = new ArrayList<Chapter>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public Author getAuthor() {
        return author;
    }

    public void addAuthor(Author author) {
        this.author = author;
    }

    public Book(String title) {
        this.title = title;
    }

    public int createChapter(String text)
    {

        Chapter chapter = new Chapter(text,chapterCount);
        chapterCount++;
        chapters.add(chapter);

       return chapterCount;

    }

    public Chapter getChapter(int index)
    {
      return chapters.get(index-1);
    }

    public void print() {
    }

    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        Author rpGheo = new Author("Radu Pavel Gheo");

        discoTitanic.addAuthor(rpGheo);
        int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
        int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
        SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);

        scOneOne.createNewParagraph("Paragraph 1");
        scOneOne.createNewParagraph("Paragraph 2");
        scOneOne.createNewParagraph("Paragraph 3");
        scOneOne.createNewImage("Image 1");
        scOneOne.createNewParagraph("Paragraph 4");
        scOneOne.createNewTable("Table 1");
        scOneOne.createNewParagraph("Paragraph 5");

        scOneOne.print();
    }
}
