package view;

import controller.methodos;

public class Main {
    public static void main(String[] args) {
        // criando 5 Threads
        for (int id = 0; id < 5; id++) {
            Thread thread = new methodos();
            thread.start();
        }
    }
}