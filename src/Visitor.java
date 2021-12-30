public interface Visitor {

    void visit(Book b);
    void visit(Section s);
    void visit(TableOfContents t);
    void visit(Paragraph p);
    void visit(ImageProxy ip);
    void visit(Image i);
    void visit(Table t);

}
