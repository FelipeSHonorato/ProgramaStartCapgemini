package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioII {
    public static void main(String[] args) {

        // Exercício II proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[2];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o valor do " + (i + 1) + "° número:");
            numeros[i] = scanner.nextInt();
            soma = soma + numeros[i];
        }

        System.out.println("A soma resultante entre o 1° e 2° números é: " + (numeros[0] + numeros[1]));
        System.out.println("A subtração resultante entre o 1° e 2° números é: " + (numeros[0] - numeros[1]));
        System.out.println("A multiplicação resultante entre o 1° e 2° números é: " + (numeros[0] * numeros[1]));
        System.out.println("A divisão resultante entre o 1° e 2° números é: " + (numeros[0] / numeros[1]));
    }
}
