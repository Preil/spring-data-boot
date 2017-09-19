package com.oreilly.sdata;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

/**
 * Ilya 18.09.2017.
 */
public class Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        BookRepository repository = context.getBean(BookRepository.class);

       repository.delete(repository.findAll(new ArrayList<Long>(){{
           add(1L);
           add(2L);
           add(3L);
       }}));
    }
}
