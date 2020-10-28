package ru.mirea.inbo0519.pr10.task1;

public class Complex {
    private int real;
    private int imagine;
    private char sign;

    public Complex(int real, int imagine)
    {
        this.real = real;
        this.imagine = imagine;
        if(imagine>0)
            sign = '+';
        else
            sign = '-';
    }

    public Complex()
    {}

    @Override
    public String toString() {
        if(real == 0 && imagine==0)
            return 0+"";
        else if(real==0)
            return imagine + "i";
        else if(imagine==0)
            return real+"";
        else if(sign!='-')
            return real + " " + sign + " " + imagine + "i";
        else
            return real + " " + imagine + "i";
    }
}
