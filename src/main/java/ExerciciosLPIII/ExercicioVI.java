package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioVI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int auxiliar = 0;

        System.out.print("Digite um número inteiro para A: ");
        a = scanner.nextInt();

        System.out.print("Digite um número inteiro para B: ");
        b = scanner.nextInt();

        auxiliar = a;
        a = b;
        b = auxiliar;

        System.out.println("Os valores foram invertidos, valor de A agora é: " + a + " e o valor de b é: " + b);
    }
}
