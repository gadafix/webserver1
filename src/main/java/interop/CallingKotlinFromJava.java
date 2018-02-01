package interop;

public class CallingKotlinFromJava {

    public static void main(String[] args) {
        // Utils.kt ==> UtilsKt.class
        UtilsKt.sayHello();
    }
}
