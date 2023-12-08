package com.workintech.library;

import com.workintech.library.enums.book.Status;
import com.workintech.library.model.book.Book;
import com.workintech.library.model.book.Journals;
import com.workintech.library.model.book.Magazines;
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


        // Kitaplar
        Book book1 = new Journals(1, "Türkiye", "Mehmet Akif", "13223", 30);
        Book book2 = new StudyBooks(2, "Math", "Aristo", "636023", 28);
        Book book3 = new Magazines(3, "Kürk Mantolu Madonna", "Sabahattin Ali", "44521", 80);
        Book book4 = new Journals(4, "Bilim", "John Doe", "98765", 25);
        Book book5 = new StudyBooks(5, "History", "Jane Smith", "45678", 35);

        // Okuyucular
        Person reader1 = new Reader(1, "Emre", "Ertürk");
        Person reader2 = new Reader(2, "Ali", "Tekin");
        Person reader3 = new Reader(3, "Ayşe", "Yılmaz");
        Person reader4 = new Reader(4, "Ahmet", "Demir");
        Person reader5 = new Reader(5, "Zeynep", "Yıldız");

        // Yazarlar
        Person author1 = new Author(1, "Attila", "Taş", "846456");
        Person author2 = new Author(2, "Ayşe", "Yılmaz", "123456");
        Person author3 = new Author(3, "John", "Doe", "654321");
        Person author4 = new Author(4, "Jane", "Smith", "789012");
        Person author5 = new Author(5, "Ahmet", "Demir", "543210");


        librarian.addBook(library.getBooks(),book2);
        librarian.addBook(library.getBooks(),book1);
        librarian.addBook(library.getBooks(),book3);
        librarian.addBook(library.getBooks(),book4);
        librarian.addBook(library.getBooks(),book5);

        librarian.addAuthor(library.getAuthors(),((Author)author1));
        librarian.addAuthor(library.getAuthors(),((Author)author2));
        librarian.addAuthor(library.getAuthors(),((Author)author3));
        librarian.addAuthor(library.getAuthors(),((Author)author4));
        librarian.addAuthor(library.getAuthors(),((Author)author5));

        librarian.addReader(library.getReaders(),((Reader)reader1));
        librarian.addReader(library.getReaders(),((Reader)reader2));
        librarian.addReader(library.getReaders(),((Reader)reader3));
        librarian.addReader(library.getReaders(),((Reader)reader4));
        librarian.addReader(library.getReaders(),((Reader)reader5));

        librarian.updateBook(library.getBooks(),book1,81);
        //librarian.listBook(library.getBooks());
        librarian.getBookID(library.getBooks(),3);
        librarian.getBookName(library.getBooks(),"Math");


        librarian.lendBook(library.getBorrowedBooks(),library.getBooks(),book2,((Reader)reader2));
        librarian.lendBook(library.getBorrowedBooks(),library.getBooks(),book2,((Reader)reader2));
        System.out.println(library.getBorrowedBooks());
        librarian.returnLendBook(library.getBorrowedBooks(),book2,((Reader)reader2));
        System.out.println(library.getBorrowedBooks());

    }
}