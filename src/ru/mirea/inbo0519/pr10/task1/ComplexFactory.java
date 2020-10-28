package ru.mirea.inbo0519.pr10.task1;

public class ComplexFactory implements ComplexAbstractFactory{
    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex createComplex(int real, int imagine) {
        return new Complex(real, imagine);
    }

    public Complex createNewComplex(int r, int i)
    {
        if(i==0 && r==0)
            return createComplex();
        else
            return createComplex(r, i);
    }
}
