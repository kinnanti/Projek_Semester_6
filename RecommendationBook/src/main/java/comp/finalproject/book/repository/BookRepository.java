package comp.finalproject.book.repository;

import comp.finalproject.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAll();

    Book findById(long id);

    void deleteById(long id);


    /*void update(Book book);

   int deleteById(int id);

    Book save(Book book);*/


}
