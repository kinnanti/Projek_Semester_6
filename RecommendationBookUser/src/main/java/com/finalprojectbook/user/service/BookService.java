
package com.finalprojectbook.user.service;

import com.finalprojectbook.user.entity.Book;
import com.finalprojectbook.user.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Metode untuk mencari buku berdasarkan judul dengan kata kunci yang fleksibel
    public List<Book> searchBooksByTitle(String keyword) {
        return bookRepository.findByTitleContains(keyword);
    }
}


