package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioXIV {
    public static void main(String[] args) {

        // Exercício XIV proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        int numeroA = 0;
        int numeroB = 0;

        System.out.print("Digite o valor do número A: ");
        numeroA = scanner.nextInt();

        System.out.print("Digite o valor do número B: ");
        numeroB = scanner.nextInt();

        if (numeroA > numeroB) {
            System.out.println("O número A é maior que o número B");
        } else System.out.println("O número B é maior que o número A");
    }
}
