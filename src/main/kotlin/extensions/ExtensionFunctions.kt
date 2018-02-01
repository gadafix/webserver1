package extensions

fun String.startsWithA(): Boolean = this.startsWith("A")

fun main(args: Array<String>) {
    printIfStartsWithAorNot("Hello")
    printIfStartsWithAorNot("Atmosphere")

}

private fun printIfStartsWithAorNot(myString: String) {
    when (myString.startsWithA()) {
        true -> println("$myString starts with \'A\'")
        else -> println("$myString does not start with \'A\'")
    }
}
