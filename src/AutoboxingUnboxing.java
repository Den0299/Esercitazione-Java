/* Scrivere una funzione che accetti in input 2 int e ne stampi la somma
Scrivere una funzione che accetti in input 1 char lo stampi
Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
Scrivere una funzione che accetti in input 1 Character lo stampi
Scrivere un un valore primitivo per int, double e char e fare autoboxing
Scrivere un oggetto per Integer, Double e Character e fare Unboxing */


public class AutoboxingUnboxing {
    public static void main(String[] args) {
        int a = 5;
        double b = 7.5;
        char c = 'z';

        Integer intObj = a;
        Double doubleObj = b;
        Character charObj = c;

        System.out.println("Autoboxing: " + intObj + ", " + doubleObj + ", " + charObj);

        int intUnboxed = intObj;
        double doubleUnboxed = doubleObj;
        char charUnboxed = charObj;

        System.out.println("Unboxing: " + intUnboxed + ", " + doubleUnboxed + ", " + charUnboxed);

        sum(a, doubleObj);
        printChar(c);
        sumInteger(intObj, doubleObj);
        printChar(charObj);
    }

    public static void sum(int a, double b) {
        System.out.println(a+b);
    }

    public static void printChar(char c) {
        System.out.println(c);
    }

    public static void sumInteger(Integer a, Double b) {
        System.out.println(a+b);
    }

    public static void printCharString(Character c) {
        System.out.println(c);
    }
}