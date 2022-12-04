package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioI {
    public static void main(String[] args) {

        // Exercício I proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[2];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o valor do " + (i + 1) + "° número:");
            numeros[i] = scanner.nextInt();
            soma = soma + numeros[i];
        }
        System.out.println("A soma resultante entre o primeiro e segundo número é: " + soma);
    }
}
