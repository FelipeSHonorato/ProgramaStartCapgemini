package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioXXXII {
    public static void main(String[] args) {

        // Exercício XXXII proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[3];

        System.out.println("Bem vindo ao sistema de análise de triângulos!");

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o valor do " + (i + 1) + "° lado: ");
            valores[i] = scanner.nextInt();
        }

        if (valores[0] == valores[1] && valores[0] > valores[2]) {
            System.out.println("O triângulo em questão é o Isóscele");
        } else if (valores[0] != valores[2] && valores[1] != valores[2]) {
            System.out.println("O triângulo em questão é o Escaleno");
        } else {
            System.out.println("O triângulo em questão é o Equilátero");
        }
    }
}
