package ru.gb.homework3;

public abstract class Worker {
    private String name;
    private int rate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public abstract int averageMonthlySalary();

    public String toString() {
        return  "Name: " + getName() +
                ", average monthly salary - " + averageMonthlySalary() + " RUB";
    }

}
