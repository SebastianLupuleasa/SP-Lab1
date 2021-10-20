public class Table extends Element{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Table(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Table with Title: " + this.name);
    }
}
