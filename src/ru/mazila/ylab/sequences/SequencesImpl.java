package ru.mazila.ylab.sequences;

import ru.mazila.ylab.interfaces.ISequencesGenerator;

public class SequencesImpl implements ISequencesGenerator {

    private int num;

    public SequencesImpl() {
    }

    @Override
    public void a(int n) {

        System.out.print("Последовательность A длиной " + n + ": ");

        this.num = 0;

        for (int i = 1; i <= n; i++) {
            num += 2;
            System.out.print(num + " ");
        }
        System.out.print("\n");
    }

    @Override
    public void b(int n) {

        System.out.print("Последовательность B длиной " + n + ": ");

       this.num = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(num + " ");
            num += 2;
        }
        System.out.print("\n");
    }

    @Override
    public void c(int n) {

        System.out.print("Последовательность C длиной " + n + ": ");

        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
        System.out.print("\n");
    }

    @Override
    public void d(int n) {

        System.out.print("Последовательность D длиной " + n + ": ");

        this.num = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print((int) Math.pow(num++, 3) + " ");
        }
        System.out.print("\n");
    }

    @Override
    public void e(int n) {

        System.out.print("Последовательность E длиной " + n + ": ");

        this.num = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(num + " ");
            num = -num;
        }
        System.out.print("\n");
    }

    @Override
    public void f(int n) {

        System.out.print("Последовательность F длиной " + n + ": ");

        this.num = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(i * num + " ");
            num = -num;
        }
        System.out.print("\n");
    }

    @Override
    public void g(int n) {

        System.out.print("Последовательность G длиной " + n + ": ");

        this.num = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(i * i * num + " ");
            num = -num;
        }
        System.out.print("\n");
    }

    @Override
    public void h(int n) {

        System.out.print("Последовательность H длиной " + n + ": ");

        this.num = 0;

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (num != 0 & (int) Math.pow(num, 1) != 0) {
                num = 0;
            } else {
                count++;
                num += count;
            }
            System.out.print(num + " ");
        }

        System.out.print("\n");
    }

    @Override
    public void i(int n) {

        System.out.print("Последовательность I длиной " + n + ": ");

        this.num = 1;

        for (int i = 1; i <= n; i++) {
            num *= i;
            System.out.print(num + " ");
        }
        System.out.print("\n");
    }

    @Override
    public void j(int n) {

        System.out.print("Последовательность J длиной " + n + ": ");

        this.num = 0;

        int num0 = 1;
        int num1 = 1;

        System.out.print(num0 + " " + num1 + " ");
        for (int i = 3; i <= n; i++) {
            num = num0 + num1;
            System.out.print(num + " ");
            num0 = num1;
            num1 = num;
        }
        System.out.print("\n");
    }
}