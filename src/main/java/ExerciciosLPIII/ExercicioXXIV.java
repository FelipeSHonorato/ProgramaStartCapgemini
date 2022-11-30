package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioXXIV {

    // ExercícioXXIV proposto no treinamento de Lógica de Progamação III com Java pela Capgemini.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {

            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("O número é igual a ZERO");
            } else {
                if (numero > 0) {
                    System.out.println("O número é maior que ZERO");
                } else {
                    System.out.println("O número é menor que ZERO");
                }
            }
            System.out.println("Caso queira continuar digite 'S' caso não queira continuar digite 'N'");
            desejaContinuar = scanner.next().charAt(0); //Recebe um charactere do for digitado na posição zero
        }
    }
}
