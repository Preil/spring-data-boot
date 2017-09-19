package com.oreilly.sdata;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Ilya 18.09.2017.
 */
public class Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        BookRepository repository = context.getBean(BookRepository.class);

        Book book = repository.findOne(1L);
        System.out.println(book);
        book.setTitle("War and Peace");
        book.setBookId(1000L); // spring will create new record instead update.
        repository.save(book);
        System.out.println(book);
    }
}
