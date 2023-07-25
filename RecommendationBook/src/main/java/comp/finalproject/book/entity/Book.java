package comp.finalproject.book.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "book")
@Component
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookID")
    private long bookID;

    @Column(name = "title")
    private String title;

    @Column(name = "authors")
    private String authors;

    @Column(name = "average_rating")
    private double averageRating;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "isbn13")
    private String isbn13;

    @Column(name = "language_code")
    private String languageCode;

    @Column(name = "num_pages")
    private int numPages;

    @Column(name = "ratings_count")
    private int ratingsCount;

    @Column(name = "text_reviews_count")
    private int textReviewsCount;

    @Column(name = "publication_date")
    private String publicationDate;

    @Column(name = "publisher")
    private String publisher;

    public Book() {
    }

    public Book(String title, String authors, double averageRating, String isbn, String isbn13, String languageCode,
                int numPages, int ratingsCount, int textReviewsCount, String publicationDate, String publisher) {
        this.title = title;
        this.authors = authors;
        this.averageRating = averageRating;
        this.isbn = isbn;
        this.isbn13 = isbn13;
        this.languageCode = languageCode;
        this.numPages = numPages;
        this.ratingsCount = ratingsCount;
        this.textReviewsCount = textReviewsCount;
        this.publicationDate = publicationDate;
        this.publisher = publisher;
    }

    public long getBookID() {
        return bookID;
    }

    public void setBookID(long bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public int getRatingsCount() {
        return ratingsCount;
    }

    public void setRatingsCount(int ratingsCount) {
        this.ratingsCount = ratingsCount;
    }

    public int getTextReviewsCount() {
        return textReviewsCount;
    }

    public void setTextReviewsCount(int textReviewsCount) {
        this.textReviewsCount = textReviewsCount;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}

