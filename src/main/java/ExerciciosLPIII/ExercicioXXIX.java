package ExerciciosLPIII;

import java.util.Scanner;

public class ExercicioXXIX {
    public static void main(String[] args) {

        // Exercício XXIX proposto no treinamento de Lógica de Programação III com Java pela Capgemini.

        Scanner scanner = new Scanner(System.in);

        int mes = 0;

        while (mes < 1 || mes > 12) {

            System.out.print("Digite um número de 1 a 12 para saber qual é o mês correspondente: ");
            mes = scanner.nextInt();

            switch (mes) {
                case 1:
                    System.out.println("Número digitado é referente ao mês de Janeiro");
                    break;
                case 2:
                    System.out.println("Número digitado é referente ao mês de Fevereiro");
                    break;
                case 3:
                    System.out.println("Número digitado é referente ao mês de Março");
                    break;
                case 4:
                    System.out.println("Número digitado é referente ao mês de Abril");
                    break;
                case 5:
                    System.out.println("Número digitado é referente ao mês de Maio");
                    break;
                case 6:
                    System.out.println("Número digitado é referente ao mês de Junho");
                    break;
                case 7:
                    System.out.println("Número digitado é referente ao mês de Julho");
                    break;
                case 8:
                    System.out.println("Número digitado é referente ao mês de Agosto");
                    break;
                case 9:
                    System.out.println("Número digitado é referente ao mês de Setembro");
                    break;
                case 10:
                    System.out.println("Número digitado é referente ao mês de Outubro");
                    break;
                case 11:
                    System.out.println("Número digitado é referente ao mês de Novembro");
                    break;
                case 12:
                    System.out.println("Número digitado é referente ao mês de Dezembro");
                    break;
                default:
                    System.out.println("Mês inválido! Você digitou um número " +
                            "incorreto referente a um mês do ano!");
            }
        }
    }
}

