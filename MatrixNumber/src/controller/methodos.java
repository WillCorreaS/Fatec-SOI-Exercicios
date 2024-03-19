package controller;

public class methodos extends Thread {
    private int[] row;
    private int rowId;

    public methodos(int[] row, int rowId) {
        this.row = row;
        this.rowId = rowId;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int num : row) {
            sum += num;
        }
        System.out.println("Soma da linha " + rowId + ": " + sum);
    }
}

