package desafio03;
/**
 * Desafio
 * Faça um programa que leia um valor T e preencha um vetor N[1000]
 * com a sequência de valores de 0 até T-1 repetidas vezes,
 * conforme exemplo abaixo. Imprima o vetor N.
 *
 * Entrada
 * A entrada contém um valor inteiro T (2 ≤ T ≤ 50).
 *
 * Saída
 * Para cada posição do vetor, escreva "N[i] = x", onde i é a
 * posição do vetor e x é o valor armazenado naquela posição.
 *
 * Entrada:
 * 3
 * Saída:
 * N[0] = 0
 * N[1] = 1
 * N[2] = 2
 * N[3] = 0
 * N[4] = 1
 * N[5] = 2
 * N[6] = 0
 * N[7] = 1
 * N[8] = 2
 * ...
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int T = ler.nextInt();
        int[] N = new int[1000];
        int pos = 0;
        while (pos < 999) {
            for (int j = 0; j < T; j++) {
                if (pos > 999) break;
                N[pos] = j;
                pos++;
            }
        }

        for (int i = 0; i < N.length; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
    }
}
