package ru.mirea.inbo0519.pr10.task2;

public class TestChair {
    public static void main(String[] args) {
        Client client = new Client();
        client.setChair(new ChairFactory().createNewChair(Chairs.Victorian, 10));
        client.sit();
        client.setChair(new ChairFactory().createNewChair(Chairs.Functional, 0));
        client.sit();
        client.setChair(new ChairFactory().createNewChair(Chairs.Magic, 0));
        client.sit();
    }
}
