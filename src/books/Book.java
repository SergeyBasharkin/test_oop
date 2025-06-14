package books;

public class Book {

  private String title;
  private Author author;
  private int publishDate;
  private final String ISBN = "0123456789";

  public Book(String title, Author author, int publishDate) {
    this.title = title;
    this.author = author;
    this.publishDate = publishDate;
  }

  public String getTitle() {
    return title;
  }

  public Author getAuthor() {
    return author;
  }

  public int getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(int publishDate) {
    this.publishDate = publishDate;
  }
}
