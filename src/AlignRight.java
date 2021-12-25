import javax.naming.Context;

public class AlignRight implements AlignStrategy{


    @Override
    public void render(Paragraph p) {
        System.out.println("Paragraph:                  " + p.getText());
    }
}
