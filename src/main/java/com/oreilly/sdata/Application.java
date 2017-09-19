package com.oreilly.sdata;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Ilya 18.09.2017.
 */
public class Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        BookRepository repository = context.getBean(BookRepository.class);
        //just two methods allowed.
       repository.findAll();
       repository.findOne(1L);
    }
}
