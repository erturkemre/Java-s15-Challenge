package com.workintech.library.model.person;

import com.workintech.library.enums.person.Role;
import com.workintech.library.model.book.Book;

import java.util.HashSet;
import java.util.Set;

public class Reader extends Person{
    private int limit;

    public Reader(long id, String firstName, String lastName) {
        super(id, firstName, lastName, Role.READER);
        this.limit =5;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }


    @Override
    Role whoyouare() {
        StringBuilder builder = new StringBuilder();
        builder.append("I am: "+ getFirstName());
        builder.append("My role is"+ getRole());
        System.out.println(builder);
        return null;
    }
}
