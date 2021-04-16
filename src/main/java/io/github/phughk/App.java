package io.github.phughk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext ctx = SpringApplication.run(App.class);
        System.out.println( "Hello World!" );
    }
}
