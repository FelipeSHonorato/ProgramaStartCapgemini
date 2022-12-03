package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioXXIII {
    public static void main(String[] args) {

        // Exercício XXIII proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        if(numero > 80 || numero < 25 || numero == 40){
            System.out.println("Mensagem de aceitação do número dentro do padrão do exercício!");
        }
    }
}
