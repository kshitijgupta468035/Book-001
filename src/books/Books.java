package books;

public class Books {
    private String authorName;
    private String bookName;
    private String ISBN;

    public Books(String bookName, String authorName, String ISBN) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "-----------------------------\n" +
                "Book Name:\t" + getBookName() +
                "\nAuthor Name:\t" + getAuthorName() +
                "\nISBN:\t" + getISBN() +
                "\n-----------------------------";
    }

}
