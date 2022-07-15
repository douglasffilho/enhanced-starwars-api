package br.com.ariany.enhancedstarwarsapi.controllers;

import br.com.ariany.enhancedstarwarsapi.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting") // http://localhost:8080/greeting
public class GreetingController {

    @GetMapping
    public Greeting sayHello() {
        return new Greeting();
    }

    @GetMapping("/{name}")
    public Greeting sayHelloToSomeone(@PathVariable(name = "name") String name) {
        return new Greeting(name);
    }
}
