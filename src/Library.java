

public enum Library {

    first("Microservicios", "Christian Posta", 45.98),
    second ("Patrones de diseño","Markus Eisele",72.80),
    third ("Programación Orientada a Objetos","Richard Warbuton",36.72),
    fourth ("Aprendiendo Java", "Ben Evans",66.81),
    fifth("Aprendiendo Python","David Mertz",43.27),
    sixth("Big Data con Hadoop","Donald Mine",39.60),
    seventh ("IOS con Swift","Tim Nugent",24.18),
    eighth ("Programación reactiva","Konrad Malawski",58.70),
    ninth("Programación con C","Joel Falcou",67.93),
    tenth("Diseño de sistema","Doug Davis",55.67);

    private String name ;
    private double price;
    private String author;

    Library(String name, String author, double price) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }




}
