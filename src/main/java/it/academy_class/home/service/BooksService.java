package it.academy_class.home.service;

import it.academy_class.home.model.entity.Book;
import it.academy_class.home.model.repository.BooksRepository;

import java.util.List;

public class BooksService {
    private static final BooksService BOOKS_SERVICE = new BooksService();
    public static BooksService getBooksService(){
        return BOOKS_SERVICE;
    }
    private BooksService(){
    }
     public List<Book> getBooksList(){
        return BooksRepository.getBooksRepository().getBooksStore().getBooksList();
     }

}
