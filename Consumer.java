package com.company;

public class Consumer implements Runnable{

    private Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer thread").start();
    }

    @Override
    public void run() {
        int i = 1;
        while(i < 6) {
            q.getN();
            i++;
        }

    }
}
