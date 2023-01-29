public class Books {

    private String author;
    private String book;
    private String homeofPublich;
    private String dataofPublish;
    private long id;
    private int numberVersion;

    public Books(String author) {
    }

    public Books(String authors, String books, String homePublich, String dataPublish, long id, int numberVersion) {
        this.author = authors;
        this.book = books;
        this.homeofPublich = homePublich;
        this.dataofPublish = dataPublish;
        this.id = id;
        this.numberVersion = numberVersion;
    }

    public Books(int id) {

    }

    public String getAuthor() {
        return author;
    }

    public String getBook() {
        return book;
    }

    public String getHomeofPublich() {
        return homeofPublich;
    }

    public String getDataPublish() {
        return dataofPublish;
    }

    public long getId() {
        return id;
    }

    public int getNumberVersion() {
        return numberVersion;
    }


}
