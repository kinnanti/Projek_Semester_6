package com.finalprojectbook.user.repository;

import com.finalprojectbook.user.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAll();

    Book findById(long id);

    List<Book> findByTitleContains(String keyword);

    List<Book> findByTitle(String keyword);
}

/*

    void deleteById(long id);


    void update(Book book);

   int deleteById(int id);

    Book save(Book book);

*/


