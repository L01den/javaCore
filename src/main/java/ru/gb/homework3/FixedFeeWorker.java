package ru.gb.homework3;

public class FixedFeeWorker extends Worker{

    public FixedFeeWorker(String name, int fixedFee) {
        setName(name);
        setRate(fixedFee);
    }

    @Override
    public int averageMonthlySalary() {
        return getRate();
    }
}
