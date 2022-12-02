package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioXV {
    public static void main(String[] args) {

        // Exercício XV proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        System.out.println("Digite um número: ");
        numero = scanner.nextInt();

        if (numero >= 100 & numero <= 200){
            System.out.println("O número está entre o intervalo de 100 a 200");
        } else System.out.println("O número não está no intervalo entre 100 e 200");
    }
}
