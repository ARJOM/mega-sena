package view;

import java.lang.reflect.Array;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        //Definindo o input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de apostas a serem feitas");
        int quantidadeApostas = scanner.nextInt();

        int[][] matriz = new int[quantidadeApostas][];

        int indiceLinha = 0;

        while (quantidadeApostas > 0){

            System.out.println("Informe a quantidade de números para apostar (minimo 6, maximo 15):");
            int numeros = scanner.nextInt();

            int cont = 0;
            int indiceColuna = 0;

            if (numeros >= 6 && numeros <= 15) {

                int[] aposta = new int[numeros];

                while (numeros > cont) {

                    System.out.print("Informe um numero de 1 à 60: ");
                    int numero = scanner.nextInt();

                    boolean estah = false;

                    if (numero >= 1 && numero <= 60) {
                        for (int num : aposta) {
                            if (num == numero) {
                                estah = true;
                            }
                        }
                        if (estah) {
                            System.out.println("Esse número já for inserido, por favor insira outro");
                        } else {
                            aposta[indiceColuna] = numero;
                            cont++;
                            indiceColuna++;
                        }
                    } else {
                        System.out.println("Número inválido. Insira outro");
                    }
                }
                matriz[indiceLinha] = aposta;
                indiceLinha++;
                quantidadeApostas--;
            } else{
                System.out.println("Informe um número válido");
            }
        }
        for (int[] linha : matriz){
            for (int num : linha){
                System.out.print(num+" ");
            }
            System.out.print("\n");
        }
        double soma = 0;
        for (int[] linha : matriz){
            switch (linha.length){
                case 6: soma += 3.50; break;
                case 7: soma += 24.50; break;
                case 8: soma += 98.00 ; break;
                case 9: soma += 294.00; break;
                case 10: soma += 735.00; break;
                case 11: soma += 1617.00; break;
                case 12: soma += 3234.00; break;
                case 13: soma += 6006.00; break;
                case 14: soma += 10510.50; break;
                case 15: soma += 17517.50; break;
            }
        }
        System.out.println("O total das apostas custou R$ "+soma);
    }
}
