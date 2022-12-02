package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioXVIII {
    public static void main(String[] args) {

        // Exercício XVIII proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        int idade;
        int menoresIdade = 0;
        int maioresIdade = 0;

        for (int i = 0; i < 75; i++) {
            System.out.print("Digite a idade da pessoa de número " + (i + 1) + " : ");
            idade = scanner.nextInt();
            if (idade >= 18) {
                System.out.println("Pessoa maior de idade!");
            } else System.out.println("Pessoa menor de idade!");
        }
    }
}
