package com.finalprojectbook.user.controller;

import com.finalprojectbook.user.dto.SearchFormData;
import com.finalprojectbook.user.entity.Book;
import com.finalprojectbook.user.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookuserController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/rekomendasi")
    public String viewHomePage(Model model) {
        List<Book> listBook = bookRepository.findAll();
        model.addAttribute("listBook", listBook);
        return "rekomendasi";
    }
    @PostMapping("/search")
    public String search(@ModelAttribute("searchFormData") SearchFormData searchFormData, Model model){
        List<Book> listBook = bookRepository.findByTitle(searchFormData.getKeyword());
        model.addAttribute("listBook", listBook);
        return "rekomendasi";
    }
}
    /*@RequestMapping("/addrating")
    public String showNewForm(Model model) {
        Rating rating = new Rating();
        List<Book> book = bookRepository.findAll();
        model.addAttribute("rating", rating);
        model.addAttribute("book", book);
        return "addrating";
    }

    @RequestMapping(value = "/saverating", method = RequestMethod.POST)
    public String saveRating(@ModelAttribute("book") Rating rating) {
        ratingRepository.save(rating);
        return "redirect:/rekomendasi";
    }
}
*/