package it.academy_class.home.controller;

import it.academy_class.home.model.entity.Book;
import it.academy_class.home.model.entity.BooksStore;
import it.academy_class.home.model.repository.BooksRepository;
import it.academy_class.home.service.BooksService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@WebServlet("/book")
public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

        List<Book> bkList = BooksService.getBooksService().getBooksList();
        boolean prov = false;
        for(Book book : bkList){
            if (String.valueOf(book.getId()).equals(id)) {
                req.setAttribute("book", book);
                break;
            }
        }
        req.getRequestDispatcher("WEB-INF/jsp/book.jsp").forward(req, resp);;
    }
}
