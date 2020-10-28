package ru.mirea.inbo0519.pr10.task2;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictorianChair(int a) {
        return new VictorianChair(a);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }

    public Chair createNewChair(Chairs chair, int age)
    {
        return switch (chair) {
            case Victorian -> createVictorianChair(age);
            case Magic -> createMagicChair();
            case Functional -> createFunctionalChair();
            default -> throw new RuntimeException(chair + " is unknown");
        };
    }
}
