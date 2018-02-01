package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingControllerJava {

    private static final String TEMPLATE = "Java: Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting-java")
    public JavaGreeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new JavaGreeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }
}
