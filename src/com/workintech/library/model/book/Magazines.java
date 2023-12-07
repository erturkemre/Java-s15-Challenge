package com.workintech.library.model.book;

import com.workintech.library.enums.book.Category;
import com.workintech.library.enums.book.Status;

public class Magazines extends Book{
    private Category category;
    public Magazines(long bookID, String name, String author, String ISBN, double price) {
        super(bookID, name, author, ISBN, price);
        this.category = Category.MAGAZINE;
    }

    public Category getCategory() {
        return category;
    }
}
