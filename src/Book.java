public class Book {
    private String nameOfBook;
    private Author author;
    private int publicationYear;

    public Book(String nameOfBook, Author author, int publicationYear) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getNameOfBook() {
        return this.nameOfBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
