package hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingControllerKotlin {

    val counter = AtomicLong()

    @GetMapping("/greeting-kotlin")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
            KotlinGreeting(counter.incrementAndGet(), "Kotlin: Hello, $name")

    @GetMapping("/greeting-default")
    fun greetingDefault() =
            KotlinGreeting(counter.incrementAndGet())

}