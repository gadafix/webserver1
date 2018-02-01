package defaultparameter

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class DefaultParameterController {

    val counter = AtomicLong()

    @GetMapping("/default-parameter")
    fun greeting(@RequestParam(value = "a") a: String?, @RequestParam(value = "b") b: String?, @RequestParam(value = "c") c: String?) {
        val dp = DefaultParameter()
        dp.overloadedMethod(a,b,c)
    }
}