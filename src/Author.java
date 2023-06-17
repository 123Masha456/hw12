import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Имя " + this.name + " фамилия " + this.surname;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;

        if (o == this)
            return false;

        Author author = (Author) o;
        return name.equals(author.getName()) && surname.equals(author.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}

