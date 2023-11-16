package com.multi.mvc01.controller;

import com.multi.mvc01.dao.BookDAO;
import com.multi.mvc01.dto.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    BookDAO bookDAO;

    // 요청하나당 함수하나!!!
    @RequestMapping("createbook")
    public String createBook(BookDTO bookDTO) {
        int createbook = bookDAO.createBook(bookDTO);
        if (createbook == 1) {
            return "createbook";
        } else {
            return "redirect:index.jsp";
        }
    }

    @RequestMapping("getbook")
    public void getBook(String id, Model model) {
        BookDTO getBookdto = bookDAO.getBook(id);
        model.addAttribute("dto", getBookdto);
    }

    @RequestMapping("updatebook")
    public String updateBook(BookDTO bookDTO) {
        int updatebook = bookDAO.updateBook(bookDTO);
        if (updatebook == 1) {
            return "updatebook";
        } else {
            return "redirect:index.jsp";
        }
    }

    @RequestMapping("deletebook")
    public void deleteBook(String id) {
        bookDAO.deleteBook(id);
    }

    @RequestMapping("getbooks")
    public void getBooks(Model model) {
        List<BookDTO> getBooks =  bookDAO.getBooks();
        model.addAttribute("getbooks", getBooks);
    }
}
