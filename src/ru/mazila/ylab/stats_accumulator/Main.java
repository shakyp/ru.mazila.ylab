package ru.mazila.ylab.stats_accumulator;

public class Main {
    public static void main(String[] args) {

        StatsAccumulatorImpl s = new StatsAccumulatorImpl();

        s.add(1);
        s.add(2);
        System.out.println(s.getAvg());

        s.add(0);
        System.out.println(s.getMin());

        s.add(3);
        s.add(8);
        System.out.println(s.getMax());
        System.out.println(s.getCount());
    }
}