package ru.bovin.blogengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.bovin.blogengine.model.Post;

@SpringBootApplication
public class BlogEngineApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogEngineApplication.class, args);
    }

}
