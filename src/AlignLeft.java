import javax.naming.Context;

public class AlignLeft implements AlignStrategy{


    @Override
    public void render(Paragraph p) {
        System.out.println("Paragraph: " + p.getText());
    }
}
