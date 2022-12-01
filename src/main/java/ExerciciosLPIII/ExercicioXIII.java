package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioXIII {
    public static void main(String[] args) {

        // Exercício XIII proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        if(numero > 10){
            System.out.println("Esse número é maior que 10");
        }
    }
}
