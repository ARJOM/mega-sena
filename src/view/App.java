package view;

import modelo.Jogo;
import modelo.Loterica;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Definindo o input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de apostas a serem feitas");
        int quantidadeApostas = scanner.nextInt();
        System.out.println(quantidadeApostas);
        Loterica loterica = new Loterica(quantidadeApostas);

        while (!loterica.estaLotado()) {
            System.out.println("Informe a quantidade de números para apostar (minimo 6, maximo 15):");
            int numeros = scanner.nextInt();

            Jogo jogo = new Jogo(numeros);

            while (!jogo.estaLotado()) {
                System.out.print("Informe um numero de 1 à 60: ");
                int numero = scanner.nextInt();
                jogo.addNumero(numero);
            }

            loterica.addJogo(jogo);
            
        }

        System.out.println("O total das apostas custou R$ " + loterica.calculaTotal());
    }
}

