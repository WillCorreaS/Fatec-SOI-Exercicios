package controller;

public class methodos extends Thread {
    private int valor;
    private int[] vetor;

    public methodos (int valor, int[] vetor) {
        this.valor = valor;
        this.vetor = vetor;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        if (valor % 2 == 0) {
            // Valor é par
            for (int i = 0; i < vetor.length; i++) {
                // Percorrer o vetor utilizando estrutura for
            }
        } else {
            // Valor é ímpar
            for (int num : vetor) {
                // Percorrer o vetor utilizando estrutura foreach
            }
        }
        long endTime = System.currentTimeMillis();
        double totalTime = (endTime - startTime) / 1000.0; // Tempo em segundos
        System.out.println("Tempo para percorrer o vetor com valor " + valor + ": " + totalTime + " segundos");
    }
}
