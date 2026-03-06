public class DefaultValues {
    
    byte byteVar;
    short shortVar;
    int intVar;
    long longVar;
    float floatVar;
    double doubleVar;
    char charVar;
    boolean booleanVar;

    public static void main(String[] args) {

        DefaultValues obj = new DefaultValues();

        System.out.println("Default Values of Primitive Data Types:");
        System.out.println("\n");

        System.out.println("byte: " + obj.byteVar);
        System.out.println("short: " + obj.shortVar);
        System.out.println("int: " + obj.intVar);
        System.out.println("long: " + obj.longVar);
        System.out.println("float: " + obj.floatVar);
        System.out.println("double: " + obj.doubleVar);
        System.out.println("char: " + obj.charVar);
        System.out.println("boolean: " + obj.booleanVar);

        /*
        This works because member variables (fields) automatically
        receive default values when an object is created.

        However, local variables inside a method do NOT get default
        values. If we tried to use an uninitialized local variable,
        Java would give a compile-time error.
        */
    }
}