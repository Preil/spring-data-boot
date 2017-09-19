package com.oreilly.sdata;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Ilya 18.09.2017.
 */
public class Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        BookRepository repository = context.getBean(BookRepository.class);

        Book book = new Book();
        book.setTitle("Title");
        book.setPageCount(100);
        book.setPrice(new BigDecimal("15.00"));
        book.setPublishDate(new Date());

        repository.save(book);
    }
}
