public class Author {
    private String name;

    public Author() {
    }

    public Author(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println( "Author{" +
                "name='" + name + '\'' +
                '}');
    }

}