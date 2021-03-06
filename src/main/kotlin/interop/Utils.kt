package interop

import java.util.*

// No class defined = Utils.kt (according to file name)

fun sayHello() = println("Hello from Kotlin")


// calling Java ArrayList from kotlin
fun demo(source: List<Int>) {
    val list = ArrayList<Int>()
    // 'for'-loops work for Java collections:
    for (item in source) {
        list.add(item)
    }
    // Operator conventions work as well:
    for (i in 0..source.size - 1) {
        list[i] = source[i] // get and set are called
    }
}

