package ExerciciosLPIII;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioXXX {
    public static void main(String[] args) {

        // Exercício XXX proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o valor do numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Números digitados em ordem crescente: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}

