public class Author {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("The autor is " + this.name);
    }
}
