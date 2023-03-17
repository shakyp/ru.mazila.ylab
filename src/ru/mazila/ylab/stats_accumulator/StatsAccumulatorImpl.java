package ru.mazila.ylab.stats_accumulator;

import ru.mazila.ylab.interfaces.IStatsAccumulation;

public class StatsAccumulatorImpl implements IStatsAccumulation {

    private int num;
    private int count;

    private double avg;

    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    @Override
    public void add(int value) {

        num = value;
        count++;
        getMin();
        getMax();
        avg += value;
    }

    @Override
    public int getMin() {
        if (num < min) min = num;
        return min;
    }

    @Override
    public int getMax() {
        if (num > min) max = num;
        return max;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public Double getAvg() {
        return avg / (double) count;
    }
}
