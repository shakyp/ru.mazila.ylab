package ru.mazila.ylab.rate_limited_printer;

public class RateLimitedPrinter {

    private int interval;
    private long time = System.currentTimeMillis();

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public RateLimitedPrinter() {
    }

    public RateLimitedPrinter(int interval) {
        this.interval = interval;
    }

    public void print(String message) {

        long currentTime = System.currentTimeMillis();

        if (currentTime - getTime() > interval) {
            System.out.println(message);
            setTime(System.currentTimeMillis());
        }
    }
}
