package ru.mirea.inbo0519.pr10.task2;

public class VictorianChair implements Chair{
    private int age;

    public int getAge() {
        return age;
    }

    public VictorianChair(int a)
    {
        age = a;
    }

    @Override
    public String toString() {
        return "victorian chair " + age + " years-old";
    }
}
