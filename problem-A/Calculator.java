public class Calculator {
    private int numberA;
    private int numberB;

    public void Calculator(int a, int b)
    {
        numberA = a;
        numberB = b;
    }

    public int getNumberA() {
        return numberA;
    }

    public int getNumberB() {
        return numberB;
    }

    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(int numberB) {
        this.numberB = numberB;
    }

    public int Add() {
        return numberA + numberB
    }

    public int Subtract() {
        return numberA - numberB;
    }

    public int Multiplication() {
        return numberA * numberB;
    }

    public int Division(){
        return numberA / numberB;
    }


}