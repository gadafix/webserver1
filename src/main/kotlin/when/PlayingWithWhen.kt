package `when`

fun main(args: Array<String>) {
    val firstname = "Gandalf"

    when {
        firstname == "Sam" -> println("First name is Sam")
        firstname.startsWith("F") -> println("First name starts with F")
        firstname == "Gandalf" -> println("First name is Gandalf")
    }

    when (firstname) {
        "Gandalf", "Frudo", "Sam" -> println(firstname + " is from Lord of the Rings")
        else -> println(firstname + " is not from the Lord of the Rings")
    }

    val x = 10
    val validNumbers = arrayOf(5,10,15)

    when (x) {
        0, 1 -> print("x == 0 or x == 1")
        in 1..10 -> print("x is in the range")
        in validNumbers -> print("x is valid")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }

}