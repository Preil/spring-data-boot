package com.oreilly.sdata;

import com.oreilly.sdata.entities.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Ilya 18.09.2017.
 */
public class Application {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(DataConfiguration.class)){
            BookService service = context.getBean(BookService.class);
            Book book = new Book("First book", new Date(), 33, new BigDecimal("26.00"));
            service.save(book);
        }

    }
}
