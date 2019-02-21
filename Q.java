package com.company;

class Q {

    private int n;
    private boolean download = false;

    synchronized void getN() {

        if (!download) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("downloaded " + n);
        download = false;
        notify();

    }

    synchronized void setN(int n) {

        if (download) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.n = n;
        download = true;
        System.out.println("added: " + n);
        notify();

    }
}
