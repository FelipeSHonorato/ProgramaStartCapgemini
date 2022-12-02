package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioXVII {
    public static void main(String[] args) {

        // Exercício XVII proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        int numero;
        int numerosNoIntervalo = 0;

        for (int i = 0; i < 80; i++) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            if (numero >= 10 & numero <= 150) {
                numerosNoIntervalo++;
            }
        }
        System.out.println("Foram contados " + numerosNoIntervalo + " números no intervalo entre 10 e 150");
    }
}
