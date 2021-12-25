public class DocumentManager {

    private static DocumentManager documentManager;
    private Book book;

    private DocumentManager()
    {

    }

    public static DocumentManager getInstance()
    {
        if(null == documentManager)
        {
            documentManager = new DocumentManager();
        }

        return documentManager;
    }

    public Book getBook()
    {
        return this.book;
    }

    public void setBook(Book book)
    {
        this.book=book;
    }
}
