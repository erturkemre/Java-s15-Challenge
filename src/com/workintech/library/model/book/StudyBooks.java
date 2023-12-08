package com.workintech.library.model.book;

import com.workintech.library.enums.book.Category;
import com.workintech.library.enums.book.Status;

public class StudyBooks extends Book{
    private Category category;
    public StudyBooks(long bookID, String title, String author, String ISBN, double price) {
        super(bookID, title, author, ISBN, price,Status.AVAILABLE);
        this.category = Category.STUDY_BOOKS;
    }

    public Category getCategory() {
        return category;
    }
}
