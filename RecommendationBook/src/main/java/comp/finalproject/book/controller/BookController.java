package comp.finalproject.book.controller;


import comp.finalproject.book.entity.Book;
import comp.finalproject.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    // handler methods go here...
    @RequestMapping("/book")
    public String viewHomePage(Model model) {
        List<Book> listBook = bookRepository.findAll();
        model.addAttribute("listBook", listBook);
        return "book";
    }

    @RequestMapping("/booksnew")
    public String showNewForm(Model model) {
        Book book = new Book();
        model.addAttribute("book", book);

        return "booksnew";
    }

    @RequestMapping(value = "/savebook", method = RequestMethod.POST)
    public String save(@ModelAttribute("book") Book book) {
        bookRepository.save(book);

        return "redirect:/book";
    }

    @GetMapping("/editbook/{id}")
    public ModelAndView showEditForm(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("booksedit");
        Book book = bookRepository.findById(id);
        mav.addObject("book", book);

        return mav;
    }

    @GetMapping("/showbook/{id}")
    public ModelAndView showbookForm(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("showbook_form");
        Book book = bookRepository.findById(id);
        mav.addObject("book", book);

        return mav;
    }

    @RequestMapping(value = "/updatebook", method = RequestMethod.POST)
    public String update(@ModelAttribute("book") Book book) {

        bookRepository.save(book);

        return "redirect:/book";
    }

    @RequestMapping("/deletebook/{id}")
    public String delete(@PathVariable(name = "id") long id) {
        bookRepository.deleteById(id);
        return "redirect:/book";
    }
}
    /*@GetMapping("/listBook")
    public String listBook(Model model, @RequestParam(defaultValue = "1") int pageNumber) {
        // Lakukan operasi logika untuk menghitung totalPages
        int totalPages = calculateTotalPages();

        // Simpan nilai pageNumber dan totalPages dalam model
        model.addAttribute("pageNumber", pageNumber);
        model.addAttribute("totalPages", totalPages);

        // Lakukan operasi lainnya untuk mendapatkan data buku
        List<Book> listBook = getBookList();

        // Simpan data buku dalam model
        model.addAttribute("listBook", listBook);

        // Return nama tampilan HTML
        return "book-list";
    }

    private List<Book> getBookList() {
        return null;
    }

    private int calculateTotalPages() {
        return 0;
    }
}*/
