package springBootInitialDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RootController {
    @GetMapping("")
    public String helloWorld() {
    	return "Hello World";
    }
    
    @GetMapping("{nom}")
    public String helloYou(@PathVariable(name="nom") String nom) {
    	return "Hello, " + nom;
    }
}
