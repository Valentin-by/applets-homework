package it.academy_class.home.controller;

import it.academy_class.home.model.entity.Book;
import it.academy_class.home.model.repository.BooksRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/books")
public class BooksServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Book> bkList = BooksRepository.getBooksRepository().getBooksStore().getBooksList();
        req.setAttribute("bkList", bkList);
        req.getRequestDispatcher("WEB-INF/jsp/books.jsp").forward(req, resp);
    }

}
