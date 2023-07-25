package comp.finalproject.book.entity;

import java.util.List;

public class Library {
    private List<Book> books;

    // Konstruktor, getter, setter, dll.

    public double getFirstBookAverageRating() {
        if (books != null && !books.isEmpty()) {
            Book firstBook = books.get(0);
            return firstBook.getAverageRating();
        }
        return 0.0; // Nilai default jika daftar buku kosong
    }
}
