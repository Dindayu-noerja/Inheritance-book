public class Novel extends Book {
    private String genre;

    public Novel() {
        super();
        genre = "";
    }

    public Novel (String title, int year, double price, String subject, String genre) {
        super(title, year,price);
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void print() {
        super.print();
        System.out.println(" Genre: " + genre);
    }
}
