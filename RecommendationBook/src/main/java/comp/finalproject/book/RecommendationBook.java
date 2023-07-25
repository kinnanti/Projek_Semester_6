package comp.finalproject.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"comp.finalproject.book"})
public class RecommendationBook {

    public static void main(String[] args) {
        SpringApplication.run(RecommendationBook.class, args);
    }

}
