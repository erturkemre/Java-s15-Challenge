package com.workintech.library;

import com.workintech.library.enums.book.Status;
import com.workintech.library.model.book.Book;
import com.workintech.library.model.book.Journals;
import com.workintech.library.model.book.StudyBooks;
import com.workintech.library.model.person.Author;
import com.workintech.library.model.person.Librarian;
import com.workintech.library.model.person.Person;
import com.workintech.library.model.person.Reader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        Librarian librarian = new Librarian(1,"Emre","Ertürk","123465");
        Library library = new Library(new ArrayList<>(),new HashSet<>(),new HashSet<>(),new HashMap<>(),librarian);


        Book book = new Journals(1,"türkiye","mehmet akif","13223", 30);
        System.out.println(((Journals)book).getCategory());

        Book book1 = new StudyBooks(2,"math","aristo","636023",28);

        Book book2 = new Book(3,"kürk mantolu madonna","sabahattin ali","44521",80);

        Person reader = new Reader(1,"Emre","Ertürk");
        Reader reader1 = new Reader(2,"Ali","Tekin");
        Author author =new Author(1,"attila","taş","846456");

        librarian.addBook(library.getBooks(),book2);
        librarian.addBook(library.getBooks(),book1);
        librarian.addBook(library.getBooks(),book);
        librarian.updateBook(library.getBooks(),book1,81);
        librarian.listBook(library.getBooks());
        librarian.getBookID(library.getBooks(),2);
        librarian.getBookName(library.getBooks(),"math");
        librarian.lendBook(library.getBorrowedBooks(),library.getBooks(),book2,reader1);
        library.getAuthors().add(author);
        library.getReaders().add((Reader)reader);
    }
}