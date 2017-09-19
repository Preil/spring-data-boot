package com.oreilly.sdata;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Ilya 18.09.2017.
 */
public class Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        BookRepository repository = context.getBean(BookRepository.class);

        List<Book> books = new ArrayList<Book>();
        books.add(new Book("qqq", new Date(), 111, new BigDecimal("222.00")));
        books.add(new Book("www", new Date(), 222, new BigDecimal("333.00")));
        repository.save(books);

        for (Book book : repository.findAll()) {
            System.out.println(book);
        }
    }
}
