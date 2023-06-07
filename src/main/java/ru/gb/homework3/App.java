package ru.gb.homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Worker w1 = new FixedFeeWorker("w1", 27000);
        Worker w2 = new HourlyRateWorker("w2", 200);
        Worker w3 = new FixedFeeWorker("w3", 25000);
        Worker w4 = new HourlyRateWorker("w4", 150);
        Worker w5 = new FixedFeeWorker("w5", 40000);
        Worker w6 = new HourlyRateWorker("w6", 400);
        Worker w7 = new FixedFeeWorker("w7", 29000);
        Worker w8 = new HourlyRateWorker("w8", 220);

        List<Worker> workers = new ArrayList<>();
        Collections.addAll(workers, w1, w2, w3, w4, w5, w6, w7, w8);

        /**
         * Сортировка с использованием интерфейса Comparator
         */

        Collections.sort(workers, Comparator.comparingInt(Worker::averageMonthlySalary));

        /**
         * for each через stream
         */
        workers.stream().forEach(System.out::println);

        /**
         * for each обычный
         */

        for(Worker worker: workers){
            System.out.println(worker);
        }

    }
}
