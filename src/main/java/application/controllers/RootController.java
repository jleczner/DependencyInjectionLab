package application.controllers;

import application.dependencies.GenerationStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

import application.services.NumberGenerator;

@RestController
public class RootController {

    @Inject
    NumberGenerator ng;

    @RequestMapping("/")
    public String rootMapping(){
        return "Hello " + ng.generate();
    }
}
