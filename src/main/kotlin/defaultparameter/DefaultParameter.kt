package defaultparameter

class DefaultParameter {
    fun overloadedMethod(a: String?, b: String? = null, c: String?) {
        println("a:${a}, b:${b}. c:${c}")
    }
}