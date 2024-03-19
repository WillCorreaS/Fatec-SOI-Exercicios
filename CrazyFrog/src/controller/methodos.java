package controller;

import java.util.Random;

public class methodos extends Thread {
    private String nome;
    private int distanciaMaxima;
    private int tamanhoMaximoPulo;
    private int distanciaPercorrida;

    public methodos(String nome, int distanciaMaxima, int tamanhoMaximoPulo) {
        this.nome = nome;
        this.distanciaMaxima = distanciaMaxima;
        this.tamanhoMaximoPulo = tamanhoMaximoPulo;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (distanciaPercorrida < distanciaMaxima) {
            int tamanhoPulo = random.nextInt(tamanhoMaximoPulo + 1); // Pulo aleatório até o tamanho máximo
            distanciaPercorrida += tamanhoPulo;
            System.out.println(nome + " pulou " + tamanhoPulo + " metros e percorreu " + distanciaPercorrida + " metros.");
            try {
                Thread.sleep(100); // Aguarda um tempo antes do próximo salto
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(nome + " chegou!");
    }

    public String getNome() {
        return nome;
    }

    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }
}
