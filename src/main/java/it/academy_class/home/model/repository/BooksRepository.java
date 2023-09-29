package it.academy_class.home.model.repository;

import it.academy_class.home.model.entity.Book;
import it.academy_class.home.model.entity.BooksStore;

public class BooksRepository {
    private BooksStore booksStore;
    private static final BooksRepository BOOKS_REPOSITORY = new BooksRepository();
    public static BooksRepository getBooksRepository(){
        return BOOKS_REPOSITORY;
    }
    private BooksRepository(){
        Book book1 = new Book("Kolobok", "Tolstoy");
        Book book2 = new Book("Harry Potter", "Rowling");
        Book book3 = new Book("The Great Gatsby", "Scott Fitzgerald");
        booksStore = new BooksStore(book1, book2, book3);
    }

    public BooksStore getBooksStore(){
        return booksStore;
    }

}
