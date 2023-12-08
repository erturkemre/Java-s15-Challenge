package com.workintech.library.model.book;

import com.workintech.library.enums.book.Category;
import com.workintech.library.enums.book.Status;

public class Journals extends Book{
    private Category category;

    public Journals(long bookID, String title, String author, String ISBN, double price ) {
        super(bookID, title, author, ISBN, price,Status.AVAILABLE);
        this.category = Category.JOURNALS;
    }

    public Category getCategory() {
        return category;
    }
}
