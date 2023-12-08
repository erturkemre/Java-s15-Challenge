package com.workintech.library.model.person;

import com.workintech.library.enums.book.Status;
import com.workintech.library.enums.person.Role;
import com.workintech.library.model.book.Book;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Librarian extends Person implements CRUD{

    private String password;
    public Librarian(long id, String firstName, String lastName, String password) {
        super(id, firstName, lastName, Role.LIBRARIAN);
        this.password = password;
    }

    @Override
    public Role whoyouare() {
        StringBuilder builder = new StringBuilder();
        builder.append("I am: "+ getFirstName());
        builder.append(" My role is: "+ getRole());
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
        System.out.println("All Books in the Library:");
        for (Book book : books) {
            System.out.println(book);
        }
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

    public void getBookID(List<Book> books, long bookID) {
        Iterator<Book> iterator = books.iterator();
        while(iterator.hasNext()){
            Book currentBook = iterator.next();
            if(currentBook.getBookID()== bookID){
                System.out.println("Kitap: "+ currentBook);

            }
        }
    }
    public void getBookName(List<Book> books, String bookName) {
        Iterator<Book> iterator = books.iterator();
        while(iterator.hasNext()){
            Book currentBook = iterator.next();
            if(currentBook.getName().equals(bookName)){
                System.out.println("Kitap: "+ currentBook);

            }
        }
    }



    public void lendBook(Map<Reader, Book> borrowedBooks,List<Book> books, Book book, Reader reader) {
        if (books.contains(book)) {
            if (book.getStatus() == Status.AVAILABLE) {
                book.updateStatus(Status.LENT);
                borrowedBooks.put(reader,book);

                System.out.println(book.getName() + " lent to " + reader.getFirstName());
            } else {
                System.out.println(book.getName() + " is not available for lending.");
            }
        } else {
            System.out.println(book.getName() + " is not in the library.");
        }
    }
    public void returnLendBook(Map<Reader, Book> borrowedBooks, Book book, Reader reader) {
        if (borrowedBooks.containsKey(reader)) {
            Book borrowedBook = borrowedBooks.get(reader);

            if (borrowedBook.equals(book) && borrowedBook.getStatus() == Status.LENT) {
                borrowedBook.updateStatus(Status.AVAILABLE);
                borrowedBooks.remove(reader);

                System.out.println(borrowedBook.getName() + " returned by " + reader.getFirstName());
            } else {
                System.out.println("Mismatch: The provided book does not match the book borrowed by " + reader.getFirstName() +
                        " or the book is not currently lent.");
            }
        } else {
            System.out.println(reader.getFirstName() + " did not borrow any book.");
        }
    }




    public void addAuthor(Set<Author> authors, Author author) {
        if (!authors.contains(author)) {
            authors.add(author);
            System.out.println("Author added: " + author.getFirstName() + " " + author.getLastName());
        } else {
            System.out.println("Author already exists.");
        }
    }

    public void addReader(Set<Reader> readers, Reader reader) {
        if (!readers.contains(reader)) {
            readers.add(reader);
            System.out.println("Reader added: " + reader.getFirstName() + " " + reader.getLastName());
        } else {
            System.out.println("Reader already exists.");
        }
    }





}
