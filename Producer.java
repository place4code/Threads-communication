package com.company;

public class Producer implements Runnable {

    private Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer thread").start();
    }

    @Override
    public void run() {
        int i = 1;
        while (i < 6) {
            q.setN(i++);
        }
    }
}
