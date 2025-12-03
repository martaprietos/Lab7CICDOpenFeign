package ie.atu.lab7.greetingservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/health")
    public String heatlh(){
        return "ok";
    }
    @GetMapping("/api/greet/{name}")
    public String greet(@PathVariable String name){
        return "Hello, " + name + " from Service A!";
    }
}
