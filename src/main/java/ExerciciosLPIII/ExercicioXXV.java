package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioXXV {
    public static void main(String[] args) {

        // Exercício XXV proposto no treinamento de Lógica de Progamação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        int numeroUm;
        int numeroDois;

        System.out.print("Insira o valor do primeiro número: ");
        numeroUm = scanner.nextInt();

        System.out.print("Insira o valor do segundo número: ");
        numeroDois = scanner.nextInt();

        if (numeroUm == numeroDois) {
            System.out.println("Os números são iguais!");
        } else if (numeroUm > numeroDois) {
            System.out.println("Os números digitados são diferentes!");
            System.out.println("O número " + numeroUm + " é maior que o número " + numeroDois + ".");
        } else {
            System.out.println("Os números digitados são diferentes!");
            System.out.println("O número " + numeroDois + " é maior que o número " + numeroUm + ".");
        }
    }
}
