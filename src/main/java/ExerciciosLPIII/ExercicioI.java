package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioI {
    public static void main(String[] args) {

        // Exercício I proposto no treinamento de Lógica de Progamação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);
        double numeroA = 0;
        double numeroB = 0;
        double soma = 0;

        System.out.print("Digite o valor de A:");

        numeroA = scanner.nextDouble();

        System.out.print("Digite o valor de B:");

        numeroB = scanner.nextDouble();

        soma = numeroA + numeroB;

        System.out.println("A soma resultante entre o número A e B é: " + soma);

    }
}
