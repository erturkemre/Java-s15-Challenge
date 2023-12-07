package com.workintech.library.model.person;

import com.workintech.library.model.book.Book;

import java.util.List;

public interface CRUD {
    void addBook(List<Book> books, Book book);
    void listBook(List<Book> books);
    void updateBook(List<Book> books,Book book,double price);
    void deleteBook(List<Book> books,Book book);
}
