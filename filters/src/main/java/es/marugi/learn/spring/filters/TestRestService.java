package es.marugi.learn.spring.filters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestService {
 
    @GetMapping("/")
    String hello(String name) {
        return "Hello " + name + "!";
    }

}
