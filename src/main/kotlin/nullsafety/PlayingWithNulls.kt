package nullsafety

fun main(args: Array<String>) {
/*
    val a: String = null // compilation error

    val b: String? = null // ok

    val l1 = a.length

    val l2 = b.length // compilation error: variable 'b' can be null

    val l3 = if (b != null) b.length else -1

    val l4 = b!!.length // throw NPE if null
*/
}