package ru.mirea.inbo0519.pr10.task2;

public class FunctionalChair implements Chair {
    public int sum(int a, int b)
    {
        return a+b;
    }

    @Override
    public String toString() {
        return "functional chair";
    }
}