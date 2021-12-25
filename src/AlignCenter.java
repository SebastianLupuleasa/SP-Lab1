import javax.naming.Context;

public class AlignCenter implements AlignStrategy{


    @Override
    public void render(Paragraph p) {
        System.out.println("Paragraph:      " + p.getText() +"      ");
    }
}
