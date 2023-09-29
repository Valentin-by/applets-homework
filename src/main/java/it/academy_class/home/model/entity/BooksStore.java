package it.academy_class.home.model.entity;

import it.academy_class.home.service.BooksLogic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class BooksStore {
    private List<Book> booksList;

    public BooksStore(Book ...var ) {
        booksList = new ArrayList<Book>();
        for (Book v : var) {
            BooksLogic.getBooksLogic().addBook(this, v);
        }
    }

    public List<Book> getBooksList(){
        return booksList;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BooksStore that)) return false;
        return booksList.equals(that.booksList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(booksList);
    }

    @Override
    public String toString() {
        return "BooksStore{" +
                "booksList=" + booksList +
                '}';
    }
}
