package ru.mirea.inbo0519.pr10.task2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int a);
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
}
