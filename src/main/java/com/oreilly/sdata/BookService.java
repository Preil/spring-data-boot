package com.oreilly.sdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Ilya 18.09.2017.
 */
@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public void save(Book book) {
        this.repository.save(book);
    }

}
