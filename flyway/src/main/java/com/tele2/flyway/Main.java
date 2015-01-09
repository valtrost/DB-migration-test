package com.tele2.flyway;

import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Get Spring application context
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
         
        // Get a bean instance
        Reader reader = applicationContext.getBean("dbReader", Reader.class);

        reader.read();
    }
}
