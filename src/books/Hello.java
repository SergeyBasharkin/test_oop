package books;

public class Hello {

  public static void main(String[] args) {
    System.out.println("books.Hello World");

    Book book = new Book(
        "Война и мир",
        new Author("Лев", "Толстой"),
        1880
    );
    Book book2 = new Book(
        "Гарри Поттер",
        new Author("Джона","Роулинг"),
        1990
    );

    Book book3 = new Book(
        "Гарри Поттер",
        new Author("Джона","Роулинг"),
        1990
    );

    System.out.println(
        book2.getAuthor()
    );

    System.out.println(book.getTitle());
    System.out.println(book.getPublishDate());
    book.setPublishDate(2055);
    System.out.println("Дата создания :" + book.getPublishDate());
  }
}
