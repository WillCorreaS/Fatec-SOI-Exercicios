package view;

import java.util.ArrayList;
import java.util.List;

import controller.methodos;

public class Main {
    public static void main(String[] args) {
        final int distanciaMaxima = 100; // Distância máxima para a corrida
        final int tamanhoMaximoPulo = 10; // Tamanho máximo do pulo de cada sapo

        List<methodos> sapos = new ArrayList<>();

        // Criar e iniciar as threads para cada sapo
        for (int i = 1; i <= 5; i++) {
        	methodos sapo = new methodos("Sapo " + i, distanciaMaxima, tamanhoMaximoPulo);
            sapos.add(sapo);
            sapo.start();
        }

        // Aguardar até que todos os sapos terminem a corrida
        for (methodos sapo : sapos) {
            try {
                sapo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Determinar a ordem de chegada dos sapos
        sapos.sort((sapo1, sapo2) -> sapo2.getDistanciaPercorrida() - sapo1.getDistanciaPercorrida());

        // Apresentar a ordem de chegada
        System.out.println("Ordem de chegada dos sapos:");
        for (int i = 0; i < sapos.size(); i++) {
            System.out.println((i + 1) + "º lugar: " + sapos.get(i).getNome());
        }
    }
}
