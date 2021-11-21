package org.example;

import org.example.configuration.MyConfig;
import org.example.domain.Pasport;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Date;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = applicationContext.getBean("communication",
                Communication.class);

        List<Pasport> list = communication.showAll("/find");
        System.out.println(list);

        Pasport pasport = new Pasport("Petr", "Petrov", "Petrovich",
                Date.valueOf("2000-10-05"), Date.valueOf("2020-10-01"), 1047, 354126, "Moscow, Prospekt Saharova 3-1");

        communication.save(pasport);

    }
}
