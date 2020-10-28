package ru.mirea.inbo0519.pr10.task2;

public class MagicChair implements Chair{
    public void doMagic()
    {
        System.out.println("some magic tricks...");
    }

    @Override
    public String toString() {
        return "magic chair";
    }
}
