public class LiteralPractice {
    public static void main(String[] args) {

        long largeNumber = 15000000000L;
        float price = 12.75f;
        char copyrightSymbol = '\u00A9';

        System.out.println("Demonstrating Different Literals:");
        System.out.println("\n");

        System.out.println("Long value: " + largeNumber);
        System.out.println("Float value: " + price);
        System.out.println("Char (Unicode ©): " + copyrightSymbol);
    }
}