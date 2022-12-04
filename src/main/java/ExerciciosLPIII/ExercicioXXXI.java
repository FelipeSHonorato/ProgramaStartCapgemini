package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioXXXI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double operacao;
        char c = 'N';

        System.out.print("Digite o valor em número real para A: ");
        a = scanner.nextDouble();

        System.out.print("Digite o valor em número real para B: ");
        b = scanner.nextDouble();

        while (c == 'N') {
            System.out.print("Digite um símbolo aritmético para C (+ , - , * ou /): ");
            c = scanner.next().charAt(0);

            switch (c) {
                case '*': {
                    operacao = a * b;
                    System.out.println("O resultado da operação de multiplicação é: " + operacao);
                    break;
                }
                case '+': {
                    operacao = a + b;
                    System.out.println("O resultado da operação de soma é: " + operacao);
                    break;
                }
                case '-': {
                    operacao = a - b;
                    System.out.println("O resultado da operação de subtração é: " + operacao);
                    break;
                }
                case '/': {
                    if (b == 0) {
                        System.out.println("Não é possível efetuar uma divisão por 0");
                    } else {
                        operacao = a / b;
                        System.out.println("O resultado da operação de divisão é: " + Math.round(operacao));
                    }
                    break;
                }
                default:
                    System.out.println("Operador não definido");
                    c = 'N';
            }
        }
    }
}
