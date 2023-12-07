package com.workintech.library.model.person;

import com.workintech.library.enums.person.Role;
import com.workintech.library.model.book.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Author extends Person implements CRUD{
    private String password;
    public Author(long id, String firstName, String lastName,String password) {
        super(id, firstName, lastName, Role.AUTHOR);
        this.password = password;
    }


    public String getPassword() {
        return password;
    }

    @Override
    Role whoyouare() {
        StringBuilder builder = new StringBuilder();
        builder.append("I am: "+ getFirstName());
        builder.append("My role is"+ getRole());
        System.out.println(builder);
        return null;
    }

    @Override
    public void addBook(List<Book> books,Book book) {
        if(!books.contains(book)){
            books.add(book);
        }
    }

    @Override
    public void listBook(List<Book> books) {
        System.out.println(books);
    }

    @Override
    public void updateBook(List<Book> books,Book book,double price) {
        if(books.contains(book)){
            book.setPrice(price);
            System.out.println("Book's price is updated");
        }else{
            System.out.println("Book is not exist");
        }
    }

    @Override
    public void deleteBook(List<Book> books,Book book) {
        Iterator<Book> iterator = books.iterator();
        while(iterator.hasNext()){
            Book currentBook = iterator.next();
            if(currentBook.getBookID()== book.getBookID()){
                iterator.remove();
                System.out.println(book.getBookID()+"'li" + book +"kitabi silindi");
            }
        }
    }
}
