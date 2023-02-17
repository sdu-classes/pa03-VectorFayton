package src;

public class Main {
    public static void main(String[] args)
    {
        int numberA = 6, numberB = 2;
        Calculator addition = new Calculator(numberA, numberB);
        System.out.println(addition.Add());
    }
}