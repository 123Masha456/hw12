public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Alexander", "Pushkin");
        Book pikovayaDama = new Book("PikovayaDama", pushkin, 1834);

        System.out.println("Книга " + pikovayaDama.getNameOfBook() + " опубликована в "
                + pikovayaDama.getPublicationYear() + " году, автор " +
                pikovayaDama.getAuthor().getName() + " " + pikovayaDama.getAuthor().getSurname());

        System.out.println(pikovayaDama.getPublicationYear());

        pikovayaDama.setPublicationYear(1833);

        System.out.println(pikovayaDama.getPublicationYear());


        Author esenin = new Author("Sergey", "Esenin");
        Book sbornikStihov1 = new Book("SbornikStihov1", esenin, 1925);


        System.out.println("Книга " + sbornikStihov1.getNameOfBook() + " опубликована в "
                + sbornikStihov1.getPublicationYear() + " году, автор " +
                sbornikStihov1.getAuthor().getName() + " " + sbornikStihov1.getAuthor().getSurname());

    }
}