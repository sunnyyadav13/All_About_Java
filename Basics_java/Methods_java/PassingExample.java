package Basics_java.Methods_java;

public class PassingExample {
    public static void main(String[] args) {
        String chacha = "Iron Man";
        greet(chacha);
    }

    static void greet(String naam) {
        System.out.println(naam);
    }
}
