package view;

import java.util.Random;

import controller.methodos;

public class Main {
    public static void main(String[] args) {
        // Gerar vetor com valores aleatórios de 1 a 100
        int[] vetor = generateRandomArray(1000);

        // Iniciar a primeira thread com valor par
        methodos threadPar = new methodos(2, vetor);
        threadPar.start();

        // Iniciar a segunda thread com valor ímpar
        methodos threadImpar = new methodos(1, vetor);
        threadImpar.start();
    }

    private static int[] generateRandomArray(int length) {
        Random random = new Random();
        int[] vetor = new int[length];
        for (int i = 0; i < length; i++) {
            vetor[i] = random.nextInt(100) + 1; // Valores aleatórios de 1 a 100
        }
        return vetor;
    }
}
