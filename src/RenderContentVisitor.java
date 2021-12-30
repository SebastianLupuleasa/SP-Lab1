public class RenderContentVisitor implements Visitor{

    @Override
    public void visit(Book b) {
        System.out.println();
        System.out.println("Book: "+b.getTitle());
        System.out.println();
        System.out.println("Authors:");
        for(Author a: b.getAuthors())
            a.print();
        System.out.println();
       }

    @Override
    public void visit(Section s) {
          }

    @Override
    public void visit(TableOfContents t) {
       t.render();
    }

    @Override
    public void visit(Paragraph p) {
          p.render();
    }

    @Override
    public void visit(ImageProxy ip) {
           ip.render();
    }

    @Override
    public void visit(Image i) {
             i.render();
    }

    @Override
    public void visit(Table t) {
          t.render();
    }
}
