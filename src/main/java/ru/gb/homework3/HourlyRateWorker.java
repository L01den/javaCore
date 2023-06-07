package ru.gb.homework3;

public class HourlyRateWorker extends Worker{
    private int hourlyRate;

    public HourlyRateWorker(String name, int hourlyRate){
        setName(name);
        setRate(hourlyRate);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public int averageMonthlySalary() {
        return (int) (20.8 * 8 * hourlyRate);
    }



}
