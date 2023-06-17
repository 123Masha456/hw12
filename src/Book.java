import java.util.Objects;

public class Book {
    private String nameOfBook;
    private Author author;
    private int publicationYear;
    private Author getAuthor;

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


    @Override
    public String toString() {
        return "Книга с названием " + nameOfBook + " автора " + author.toString() +
                " опубликована в " + publicationYear + " году";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;

        if (o == this)
            return false;

        Book book = (Book) o;
        return nameOfBook.equals(book.getNameOfBook()) && author.equals(book.getAuthor) &&
                (publicationYear == (book.getPublicationYear()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, author, publicationYear);
    }
}