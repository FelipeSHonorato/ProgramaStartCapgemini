package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioII {
    public static void main(String[] args) {

        // Exercício II proposto no treinamento de Lógica de Progamação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);
        double numeroA = 0;
        double numeroB = 0;

        System.out.print("Digite o valor de A:");

        numeroA = scanner.nextDouble();

        System.out.print("Digite o valor de B:");

        numeroB = scanner.nextDouble();

        System.out.println("A soma resultante entre o número A e B é: " + (numeroA + numeroB));
        System.out.println("A subtração resultante entre o número A e B é: " + (numeroA - numeroB));
        System.out.println("A multiplicação resultante entre o número A e B é: " + (numeroA * numeroB));
        System.out.println("A divisão resultante entre o número A e B é: " + (numeroA / numeroB));

    }
}
