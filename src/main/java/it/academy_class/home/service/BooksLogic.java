package it.academy_class.home.service;

import it.academy_class.home.model.entity.Book;
import it.academy_class.home.model.entity.BooksStore;

public class BooksLogic {
    private BooksStore booksStore;
    private static final BooksLogic BOOKS_LOGIC = new BooksLogic();

    public static BooksLogic getBooksLogic() {
        return BOOKS_LOGIC;
    }

    private BooksLogic() {
    }

    public boolean addBook(BooksStore booksStore, Book book) {
        if (booksStore != null && book != null) {
            boolean prov = false;
            for (Book bk : booksStore.getBooksList()) {
                if (bk.getId() == book.getId()) {
                    prov = true;
                }
            }
            if(!prov){
                booksStore.getBooksList().add(book);
                return true;
            }
        }
        return false;
    }
}
