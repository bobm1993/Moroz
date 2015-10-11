package com.whatever;

import com.whatever.human.Human;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by bob on 08.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Human petya = (Human) context.getBean("Petya");
        petya.tell();
        Human vasya = (Human) context.getBean("Vasya");
        vasya.tell();
    }
}
