package ru.mazila.ylab.rate_limited_printer;

public class RateLimitedPrinter {

    private int interval;
    private long time = System.currentTimeMillis();

    public RateLimitedPrinter() {
    }

    public RateLimitedPrinter(int interval) {
        this.interval = interval;
    }

    public void print(String message) {

        long currentTime = System.currentTimeMillis();

        if (currentTime - this.time > interval) {
            System.out.println(message);
            this.time = System.currentTimeMillis();
        }
    }
}
