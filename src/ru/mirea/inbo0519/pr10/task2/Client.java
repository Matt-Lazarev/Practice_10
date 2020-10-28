package ru.mirea.inbo0519.pr10.task2;

public class Client {
    private Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public void sit()
    {
        System.out.println("The client is sittion on the " + chair);
    }
}
