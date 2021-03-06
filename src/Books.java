public class Books {

    private String name;
    private String author;
    private double price;

    public Books() {
    }

    public Books(String name, String author, double price) {
       setName(name);
       setAuthor(author);
       setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
