public class BookStatistics implements Visitor{

    private Integer nrImages=0, nrTables=0, nrParagraphs=0;


    public void printStatistics()
    {
        System.out.println("Book Statistics:");
        System.out.println("*** Number of images: "+this.nrImages);
        System.out.println("*** Number of tables: "+this.nrTables);
        System.out.println("*** Number of paragraphs: "+this.nrParagraphs);
    }

    @Override
    public void visit(Book b) {

    }

    @Override
    public void visit(Section s) {
    }

    @Override
    public void visit(TableOfContents t) {

    }

    @Override
    public void visit(Paragraph p) {
         nrParagraphs++;
    }

    @Override
    public void visit(ImageProxy ip) {
         nrImages++;
    }

    @Override
    public void visit(Image i) {
           nrImages++;
    }

    @Override
    public void visit(Table t) {
            nrTables++;
    }
}
