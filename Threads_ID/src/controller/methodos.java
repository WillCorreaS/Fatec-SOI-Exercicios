package controller;

public class methodos extends Thread {

    private int id; // Thread id.

    public methodos() {
        this.id = (int) getId();
    }

    @Override
    public void run() {
        System.out.printf("#%d\n", id);
    }

}