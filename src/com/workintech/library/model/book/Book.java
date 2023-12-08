package com.workintech.library.model.book;

import com.workintech.library.enums.book.Category;
import com.workintech.library.enums.book.Status;

import java.util.Objects;

public class Book {
    private long bookID;
    private String name;
    private String author;
    private String ISBN;
    private double price;
    private Status status;
    private Category category;

    public Book(long bookID, String name, String author, String ISBN, double price) {
        this.bookID = bookID;
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;

    }
    public Book(long bookID, String name, String author, String ISBN, double price, Status status) {
        this.bookID = bookID;
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
        this.status = status;
    }

    public long getBookID() {
        return bookID;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Status getStatus() {
        return status;
    }

    public void updateStatus(Status status) {
        this.status = status;
    }
    public void display(){
        StringBuilder builder = new StringBuilder();
        builder.append("name: " + getName() + "\n");
        builder.append("author: " + getAuthor() + "\n");
        builder.append("price: " + getPrice() + "\n");

       // System.out.println(builder);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookID == book.bookID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookID);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}
