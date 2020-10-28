package ru.mirea.inbo0519.pr10.task1;

public class TestComplex {
    public static void main(String[] args) {
        ComplexFactory cf = new ComplexFactory();
        Complex number = cf.createNewComplex(0, 0);
        Complex numberI = cf.createComplex(5, -10);
        System.out.println(number);
        System.out.println(numberI);
    }
}
