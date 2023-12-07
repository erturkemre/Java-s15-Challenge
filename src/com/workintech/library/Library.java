package com.workintech.library;

import com.workintech.library.model.book.Book;
import com.workintech.library.model.person.Author;
import com.workintech.library.model.person.Librarian;
import com.workintech.library.model.person.Reader;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Library {
    private List<Book> books;
    private Set<Reader> readers;
    private Set<Author> authors;
    private Map<Reader, Book> borrowedBooks;
    private Librarian librarian;

    public Library(List<Book> books, Set<Reader> readers, Set<Author> authors, Map<Reader, Book> borrowedBooks, Librarian librarian) {
        this.books = books;
        this.readers = readers;
        this.authors = authors;
        this.borrowedBooks = borrowedBooks;
        this.librarian = librarian;
    }

    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(Book book){
        this.books.add(book);
    }

    public Set<Reader> getReaders() {
        return readers;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public Map<Reader, Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", readers=" + readers +
                ", authors=" + authors +
                ", borrowedBooks=" + borrowedBooks +
                ", librarian=" + librarian +
                '}';
    }
}
