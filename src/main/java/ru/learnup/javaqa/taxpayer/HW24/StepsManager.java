package ru.learnup.javaqa.taxpayer.HW24;

import java.util.HashMap;

public class StepsManager {
    private int sum;
    private HashMap<Integer, Integer> days = new HashMap<>();

    public StepsManager(int day, int steps) {
        days.put(day, steps);
        this.sum = steps;
    }

    public int getSum() {
        return sum;
    }

    public void add(int day, int steps) {
        if (!days.containsKey(day)) {
            days.put(day, 0);
        }
        days.put(day, steps + days.get(day));
        sum += steps;
    }
}